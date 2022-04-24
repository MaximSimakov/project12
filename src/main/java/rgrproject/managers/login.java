package rgrproject.managers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet(name="login", urlPatterns="/login")
public class login extends HttpServlet{
	String[] nickname = new String[100];
	String[] password = new String[100];
	nickname[0]= "user";
	password[0]= "12345";
	
	protected void doPost(HttpServietRequest request, HttpServletResponse response) throws Servietéxception, IOException { 
		logining Calc = logining.fromRequestParaneters(request); 
		Calc. setAsRequestattributesandCalculate(request);
	request.getRequestOispatcher("/login.jsp").forward(request, response);
	}

	private static class logining{
		private final String nickname;
		private final String password;
		private Boolean success = false;
		private logining (String nick, String passwd) {
			this.nickname = nick;
			this.password = passwd;
		}
		public static logining fromRequestParaneters(HttpServletRequest request) {
			return new logining {
				request.getParameter("login");
				request.getParameter("password");
			}
			public void result(HttpServletRequest request) {
				String nck = request.setAttribute(nickname, nickname);
				String pwd = request.setAttribute(password, password);
				
				if(nck.equals(nickname[0]) && pwd.equals(paasword[0])) {
					//вставь функцию
				}
				
			}
			
		}
	}
	
}