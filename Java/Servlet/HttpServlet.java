package com.example.directservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
// gson
import com.revature.model.SuperVillain;

public class DirectServlet extends HttpServlet{
	/*
	 * Step 1: create a class that inherits from HttpServlet or GenericServlet
	 * Step 2: Override the doGet and doPost methods()
	 * Step 3: Configure the servlet in your web.xml (Deployment Descriptor)
	 */

	// this method allows a Servlet to handle a GET request
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		// When this servlet recieves a get request, I want it to simply write to the browser, "Hey!"
		res.setContentType("text/html");
		
		// PrintWriter is an object that prints text data to a character stream
		// we can call it on the response
		// ctrl + shift + o will import all the things!
		PrintWriter out = res.getWriter();
		out.println("<html><body><h1>The Servlet is talking directly to the client!</h1></body></html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		// the object that I send back will correspond to an object that I've defined a CLASS for in my java app.
		res.setContentType("application/json");
		
		// 1. create a supervillain
		SuperVillain sheev = new SuperVillain("Sheev Palpatine", "Evilness", 250000);
		
		// 2. send this supervillain as a JSON object to the browser
		// this will return the json object as the HTTP response;
		res.getWriter().write(new ObjectMapper().writeValueAsString(sheev));
	}
}