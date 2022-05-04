package ru.servlets;

import java.io.IOException;

import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class OutputList implements ServletContextListener {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	if( request.getParameter( "sign5" ) != null ) {
		@SuppressWarnings("unused")
		String ollist = "1. Симаков М.В </br> 2. Асьянов А.А </br> 3. Рогова А.А </br>  4.Шайхутдинов Т.М";
	}

	}
	
	}

