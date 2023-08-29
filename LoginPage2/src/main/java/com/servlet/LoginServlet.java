package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.UserDAO;
import com.DB.DBConnect;
import com.entites.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Email=request.getParameter("email");
		String Pass=request.getParameter("pass");
		
		UserDAO dao=new UserDAO(DBConnect.getConnection());
		
		User user=dao.getLogin(Email, Pass);
		
		if(user != null) {
			HttpSession ses=request.getSession();
			ses.setAttribute("user-obj", user);
			response.sendRedirect("home.jsp");
		}
		else {
			HttpSession ses=request.getSession();
			ses.setAttribute("error-msg", "Invalid email & Password");
			response.sendRedirect("login.jsp");
		}
		
		
		
		
		
		
		
	}

}
