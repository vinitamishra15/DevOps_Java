package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
// @WebServlet("/HelloWorldServlet")
//@WebServlet("/Hello")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*	*//**
			 * @see HttpServlet#HttpServlet()
			 *//*
				 * public HelloWorldServlet() { super(); }
				 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().println("<h1>Hello, World!</h1>");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/*	*//**
			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
			 *      response)
			 *//*
				 * protected void doPost(HttpServletRequest request, HttpServletResponse
				 * response) throws ServletException, IOException { // TODO Auto-generated
				 * method stub doGet(request, response); }
				 */

}
