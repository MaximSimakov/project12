package ru.servlets;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OutputList implements ServletContextListener {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	if( request.getParameter( "sign5" ) != null ) {
		@SuppressWarnings("unused")
		String ollist = "1. Симаков М.В </br> 2. Асьянов А.А </br> 3. Рогова А.А </br>  4.Шайхутдинов Т.М";
	}

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
	
	}

