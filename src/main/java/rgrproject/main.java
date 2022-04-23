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
			
			
			
			CalculatorManagerImpl result = new CalculatorManagerImpl(data);
			request.setAttribute("result1",stena);
			
		}
	}
	
}
