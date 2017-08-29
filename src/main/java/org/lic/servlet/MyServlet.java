package org.lic.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

/**
 * DefaultServlet implementation class MyServlet
 */
public class MyServlet extends DefaultServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("pathInfo:"+request.getPathInfo());
		System.out.println("servletPath:"+request.getServletPath());
		System.out.println("contextPath:"+request.getContextPath());
	}

}
