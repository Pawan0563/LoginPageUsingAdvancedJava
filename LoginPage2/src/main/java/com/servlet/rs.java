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

@WebServlet("/rs")
public class rs extends HttpServlet {
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String n=request.getParameter("fn");
		String e=request.getParameter("em");
		String p=request.getParameter("ps");
		
		User us=new User();
		us.setName(n);
		us.setEmail(e);
		us.setPassword(p);
		
		UserDAO dao=new UserDAO(DBConnect.getConnection());
		boolean f=dao.userRegister(us);
		
		if(true) {
			HttpSession session=request.getSession();
			session.setAttribute("reg-msg", "Registration SucessFully...");
			response.sendRedirect("register.jsp");
		}
		else {
			HttpSession session=request.getSession();
			session.setAttribute("err-msg", "Something went wrong on server..");
			response.sendRedirect("register.jsp");
			
		}
		
		
		
		
		
	}

}
