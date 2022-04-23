package rgrproject;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		
		request.getRequestDispatcher("/WebForm.jsp").forward(request, response);
		
	}
	
	private static class RequestCalc {
		private final String widht_calc;
		private final String length_calc;
		private final String atazh_calc;
		private final String tsokol_calc;
		private final String dlinaDoma_calc;
		private final String perimetr_calc;
		
		
		private RequestCalc(String widht,String length, String atazh, String tsokol ,String dlinaDoma,String perimetr) {
		this.widht_calc = widht;
		this.length_calc = length;
		this.atazh_calc = atazh;
		this.tsokol_calc = tsokol;
		this.dlinaDoma_calc = dlinaDoma;
		this.perimetr_calc = perimetr;
	}
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
			request.getParameter("widht"),
			request.getParameter("lenght"),
			request.getParameter("atazh"),
			request.getParameter("tsokol"),
			request.getParameter("dlinaDoma"),
			request.getParameter("perimetr"));
		}
		
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
			String stena=request.getParameter("stena");
			String otdelka=request.getParameter("otdelka");
			String fundam=request.getParameter("fundam");
			String vnutr=request.getParameter("vnutr");
			String krsha=request.getParameter("krsha");
			String oknaDveri=request.getParameter("oknaDveri");
			
			CalculatorStateImpl data=new CalculatorStateImpl();
			request.setAttribute("widht", widht_calc);
			request.setAttribute("lenght", length_calc);
			request.setAttribute("atazh", atazh_calc);
			request.setAttribute("tsokol", tsokol_calc);
			request.setAttribute("dlinaDoma", dlinaDoma_calc);
			request.setAttribute("perimetr", perimetr_calc);
			int widht_try;
			int lenght_try;
			int atazh_try;
			int tsokol_try;
			int dlinaDoma_try;
			int perimetr_try;
			try {
				widht_try = Integer.parseInt(widht_calc);
				lenght_try = Integer.parseInt(length_calc);
				atazh_try = Integer.parseInt(atazh_calc);
				tsokol_try = Integer.parseInt(tsokol_calc);
				dlinaDoma_try = Integer.parseInt(dlinaDoma_calc);
				perimetr_try = Integer.parseInt(perimetr_calc);
			}
			catch(NumberFormatException e) {
				widht_try = 0;
				lenght_try = 0;
				atazh_try = 0;
				tsokol_try = 0;
				dlinaDoma_try = 0;
				perimetr_try = 0;
			}
			
			if(stena=="kirp") {data.setStenaType(StenaType.KIRPICH_1);}
			if(stena=="kirp15") {data.setStenaType(StenaType.KIRPICH_1_5);}
			if(stena=="kirp2") {data.setStenaType(StenaType.KIRPICH_2);}
			if(otdelka=="oblic") {data.setOttdelcaTypes(OttdelcaTypes.OBLIC_KIRP);}
			if(otdelka=="shtuk") {data.setOttdelcaTypes(OttdelcaTypes.SHTUCATURKA);}
			if(otdelka=="kamen") {data.setOttdelcaTypes(OttdelcaTypes.DIKI_KAMEN);}
			if(fundam=="buronabiv") {data.setFundamentTypes(FundamentTypes.BYRONABIV);}
			if(fundam=="lent") {data.setFundamentTypes(FundamentTypes.LENTOCHN);}
			if(fundam=="plit") {data.setFundamentTypes(FundamentTypes.PLITN);}
			if(vnutr=="yes") {data.setPeregorodkaTypes(PeregorodkaTypes.DA);}
			if(vnutr=="no") {data.setPeregorodkaTypes(PeregorodkaTypes.NET);}
			if(krsha=="metall") {data.setKrshaTypes(KrshaTypes.METALLO);}
			if(krsha=="krovl") {data.setKrshaTypes(KrshaTypes.MYAGKHAYA);}
			if(oknaDveri=="da") {data.setOknaTypes(OknaTypes.DA);}
			if(oknaDveri=="net") {data.setOknaTypes(OknaTypes.NET);}
			
			data.setWeight(widht_try);
			data.setHeight(lenght_try);
			data.setAtazhnost(atazh_try);
			data.setTsokol(tsokol_try);
			data.setHeight(dlinaDoma_try);
			data.setHeightKon(perimetr_try);
			
			
			
			CalculatorManagerImpl result = new CalculatorManagerImpl(data);
			request.setAttribute("summ1",stena);
			
		}
	}
	
}
