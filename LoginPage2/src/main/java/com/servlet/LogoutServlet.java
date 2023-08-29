package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
			
		HttpSession sess=request.getSession();
//		sess.removeAttribute("user-obj");
		sess.invalidate();
		
		//HttpSession sess2=request.getSession()	;
		//sess2.setAttribute("logout-msg", "Logout Sucessfully");
		response.sendRedirect("login.jsp");
			
	}

	
}
