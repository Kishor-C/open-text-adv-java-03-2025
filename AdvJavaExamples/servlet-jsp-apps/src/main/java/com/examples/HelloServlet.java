package com.examples;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //GET type request is sent via URL
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); //creates an output writer that writes to the response body
		String name = "Kishor";
		// to share the data you can use different objects like request, HttpSession
		request.setAttribute("username", name); // username is the key & name is the value
		// RequestDispatcher - it dispatches the request from one resource to another
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp"); // ${username}
		rd.forward(request, response); // forwards the request & response will be from display.jsp
	}

	//POST type request is sent via form method = "post"
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
