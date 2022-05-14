package rgrproject;


import com.itextpdf.text.*;
import rgrproject.managers.*;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import rgrproject.CreatePDF;

public class PDFCreate {
	
	private Document document;
	
    /**  field with the name of the created document . */
    private String Namefile;
	
    /** Base font used field  . */
    private BaseFont times = null;
	
    /** Table header field . */
    private String[] Hat = new String[2];
	
    /** The private string array Cells. */
    private String[][] Cells=new String[2][26];
	
	
	/**
     * Instantiates a new PDF create.
     *
     * @param result with calculation results
     * @param with the received data
	 * @throws IOException 
     */
     
     public PDFCreate(CalculatorManagerImpl result, CalculatorStateImpl data) throws IOException {
    	 this.document = new Document();
		
 
			String Heading = "                                    �������� ������ ������� 12";
			String startText="����:����������� ������� ��������� ������������� �������� ����";

			String FinalText="� ������: "+result.getResultPrice(); 
			BaseFont times = null;
			URL Imagelink=getClass().getResource("/pictures/UGATU.jpg");
			//try {
				//times = BaseFont.createFont("/webapps/Project_12/WEB-INF/classes/fonts/times.ttf", "cp1251", BaseFont.EMBEDDED);
			//} catch (DocumentException e2) {
				//e2.printStackTrace();
			//} catch (IOException e2) {
				//e2.printStackTrace();
			//}
			
			
			
			Hat[0]="������������ ��������";
			Hat[1]="����";
			
			Cells[0][0]="�����a";
			Cells[0][1]=""+data.getWeight();
			Cells[0][2]="����a";
			Cells[0][3]=""+data.getHeight();
			Cells[0][4]="���������";
			Cells[0][5]=""+data.getAtazhnost();;
			Cells[0][6]="������ ������: ";
			Cells[0][7]=""+data.getTsokol();
			Cells[0][8]="����� ����� �����: ";
			Cells[0][9]=""+data.getHeightAtazh();
			Cells[0][10]="�������� �����: ";
			Cells[0][11]=""+data.getHeightKon();
			Cells[0][12]="�����: ";
			Cells[0][13]=""+result.getNs();
			Cells[0][14]="������� ��������: ";
			Cells[0][15]=""+result.getOt();
			Cells[0][16]="���������: ";
			Cells[0][17]=""+result.getFn();
			Cells[0][18]="���������� �����������: ";
			Cells[0][19]=""+result.getPer();
			Cells[0][20]="�����: ";
			Cells[0][21]=""+result.getKr();
			Cells[0][22]="����+���.�����:";
			Cells[0][23]=""+result.getOk();
			Cells[0][24]="�����: ";
			Cells[0][25]=""+result.getResultPrice();
			
			
			
			CreatePDF pdf = new CreatePDF("Project12.pdf",times);
			Document document = pdf.getDocument();
			pdf.addText(document, Heading, 20,true);
			pdf.addPicture(Imagelink, document, 360, 730);
			pdf.addText(document, startText, 14,true);
			pdf.InitTableAndAddHat(document,Hat);
			pdf.addRowsInTable(pdf.getTable(), Cells);
			pdf.addTable(document,pdf.getTable());
			pdf.addText(document, FinalText, 18, true);
			pdf.getClose();
		
	
     }
    
    
}
