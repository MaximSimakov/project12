package rgrproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import rgrproject.managers.CalculatorManager;
import rgrproject.managers.CalculatorManagerImpl;
import rgrproject.managers.CalculatorStateImpl;
import rgrproject.types.FundamentTypes;
import rgrproject.types.KrshaTypes;
import rgrproject.types.StenaType;
import rgrproject.types.OknaTypes;
import rgrproject.types.OttdelcaTypes;
import rgrproject.types.PeregorodkaTypes;

@WebServlet(name="main", urlPatterns="/main")

public class main extends HttpServlet{
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CalculatorStateImpl data=new CalculatorStateImpl();
		
		try {
		
		double widht=Double.parseDouble(request.getParameter("width"));
		if(widht<=0) throw new Exception();
		double length=Double.parseDouble(request.getParameter("length"));
		if(length<=0) throw new Exception();
		int atazh=Integer.parseInt(request.getParameter("atazh"));
		if(atazh>3) throw new Exception("?????????? ?????? ?? ????? ???? ?????? 3");
		if(atazh<=0) throw new Exception();
		double tsokol=Double.parseDouble(request.getParameter("tsokol"));
		if(tsokol<=0) throw new Exception();
		double dlinaDoma=Double.parseDouble(request.getParameter("dlinaDoma"));
		if(dlinaDoma<=0) throw new Exception();
		double perimetr=Double.parseDouble(request.getParameter("perimetr"));
		if(perimetr<=0) throw new Exception();
		
		String stena=request.getParameter("stena");
		String otdelka=request.getParameter("otdelka");
		String fundam=request.getParameter("fundam");
		String vnutr=request.getParameter("vnutr");
		String krsha=request.getParameter("krsha");
		String oknaDveri=request.getParameter("oknaDveri");
		
		if(stena.contains("kirp1")==true) data.setStenaType(StenaType.KIRPICH_1);
		if(stena.contains("kirp15")==true) data.setStenaType(StenaType.KIRPICH_1_5);
		if(stena.contains("kirp2")==true) data.setStenaType(StenaType.KIRPICH_2);
		if(otdelka.contains("oblic")==true) data.setOttdelcaTypes(OttdelcaTypes.OBLIC_KIRP);
		if(otdelka.contains("shtuk")==true) data.setOttdelcaTypes(OttdelcaTypes.SHTUCATURKA);
		if(otdelka.contains("kamen")==true) data.setOttdelcaTypes(OttdelcaTypes.DIKI_KAMEN);
		if(fundam.contains("buronabiv")==true) data.setFundamentTypes(FundamentTypes.BYRONABIV);
		if(fundam.contains("lent")==true) data.setFundamentTypes(FundamentTypes.LENTOCHN);
		if(fundam.contains("plit")==true) data.setFundamentTypes(FundamentTypes.PLITN);
		if(vnutr.contains("yes")==true) data.setPeregorodkaTypes(PeregorodkaTypes.DA);
		if(vnutr.contains("no")==true) data.setPeregorodkaTypes(PeregorodkaTypes.NET);
		if(krsha.contains("metall")==true) data.setKrshaTypes(KrshaTypes.METALLO);
		if(krsha.contains("krovl")==true) data.setKrshaTypes(KrshaTypes.MYAGKHAYA);
		if(oknaDveri.contains("da")==true) data.setOknaTypes(OknaTypes.DA);
		if(oknaDveri.contains("net")==true) data.setOknaTypes(OknaTypes.NET);
		
		data.setWeight(widht);
		data.setHeight(length);
		data.setAtazhnost(atazh);
		data.setTsokol(tsokol);
		data.setHeightAtazh(dlinaDoma);
		data.setHeightKon(perimetr);
	
		CalculatorManagerImpl res=new CalculatorManagerImpl(data);
		request.setAttribute("result", res.getResultPrice());
		request.getRequestDispatcher("WebForm.jsp").forward(request, response);
		new PDFCreate(res,data);
		}
		
		catch (Exception i) {
			request.setAttribute("error", "??????? ??????? ?????????");
			request.getRequestDispatcher("WebForm.jsp").forward(request, response);
		}
	}
	}
	
