package rgrproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDF {
	private BaseFont times = null;

	private String Namefile;

	private Document document;

	private PdfPTable table;

	
		public CreatePDF(String Namefile) throws IOException { 
			this.Namefile=Namefile;
			//BaseFont BaseFontPDF;
			//this.times=BaseFontPDF;		
			
			this.document = new Document(); 
			String filepath=new File("").getCanonicalPath();
			String[] parsfilepath=filepath.split("/");
			int lenghtpath=parsfilepath.length;
			String abspath="";
			for (int i=0;(i<lenghtpath-1);i++) {
				abspath=abspath+parsfilepath[i]+"/";
			}
			filepath=abspath+"webapps/Project_12/"+Namefile;
			String fontpath=abspath+"webapps/Project_12/WEB-INF/classes/fonts/times.ttf";
			try {
				PdfWriter.getInstance(document, new FileOutputStream(filepath));
			} 
			catch(FileNotFoundException | DocumentException e ) {
				e.printStackTrace();
			}
			
			document.open(); 
			
			try {
				times=BaseFont.createFont(fontpath,"cp1251",BaseFont.EMBEDDED);
			}catch (DocumentException e2) {
				e2.printStackTrace();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
		}

	
	private void addRows(PdfPTable table, String[][] arrayCell) {
	      
		int SizeTwo = arrayCell.length; 
		int SizeOne = arrayCell[0].length; 
		
	    for (int j=0; j<SizeTwo; j++) {     
		 for (int i=0; i<SizeOne; i++) {
			table.addCell(new Phrase(arrayCell[j][i], new Font(times,14)));
		}}
	   }

	
	private void setHeader(PdfPTable table, String[] NameCellHat) {
		    	for (int i=0; i<NameCellHat.length; i++) {  
		        PdfPCell header = new PdfPCell(); 
		        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
		        header.setBorderWidth(2);	        
		        header.setPhrase(new Phrase(NameCellHat[i],new Font(times,14)));
		        table.addCell(header); 
		    }
		}
	
	public Document getDocument() {
		return this.document;
	}

	public void getClose() {
		this.document.close();
	}

	
	public void addPicture(URL url, Document document, int position1, int position2) {
	    Image img = null;
			try {
				img = Image.getInstance(url.toString());
			} catch (BadElementException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		img.setAbsolutePosition(position1, position2); 
		
		try {
				document.add(img);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
	}

	
	public void addText(Document document, String Text, int SizeFont, boolean Space ) {
		Paragraph paragraph = new Paragraph(); 
		Paragraph paragraphadd = new Paragraph(Text, new Font(times,SizeFont));
		paragraphadd.setAlignment(com.itextpdf.text.Element.ALIGN_JUSTIFIED);
	    paragraph.add(paragraphadd);
	    
	    try {
			document.add(paragraph);
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
	    paragraph.clear();
	    
	    if (Space) {
	    
	    String string_pdf3 = " ";
		 paragraph.add(new Paragraph(string_pdf3, new Font(times,14)));
		 
		 try {
				document.add(paragraph);
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
	    }
	    paragraph=null;
	}

	
	public void InitTableAndAddHat (Document document, String[] NameCellHat) {
		
		table = new PdfPTable(NameCellHat.length);
		setHeader(table,NameCellHat);
	}

	
	public PdfPTable getTable () {
		return table;
	}

	
	public void addRowsInTable(PdfPTable Table, String[][] arrayCell) {
		addRows(Table, arrayCell);
		
	}

	
	public void addTable(Document document, PdfPTable Table) {
		try {
			document.add(Table);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}}

