package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.User;

@WebServlet("/reg")
public class UserController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String username = req.getParameter("username");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		String reg_date = req.getParameter("reg_date");
		String password = req.getParameter("password");
		String upload_photo = req.getParameter("upload_photo");
		long phone = Long.parseLong(req.getParameter("phone"));

		User user = new User(id, username, phone, email, address, reg_date, password, upload_photo);

		PrintWriter out = resp.getWriter();
		out.println("Id:"+id);
		out.println("<br>name:"+username);
		out.println("<br>email: "+email);
		out.println("<br>address: "+address);
		out.println("<br>reg date: "+reg_date);
		out.println("<br>photo: "+upload_photo);
		out.println("<br>phone: "+phone);
		
		UserDAO dao = new UserDAOImpl();
		if(dao.saveUser(user)) {
			out.println("User Added Successfully");
		}
		else {
			out.println("Error Cannot Insert");
		}
	}
}
