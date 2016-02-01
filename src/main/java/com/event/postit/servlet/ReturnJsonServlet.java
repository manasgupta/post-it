package com.event.postit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.event.postit.model.Image;
import com.event.postit.model.Media;
import com.google.gson.Gson;

public class ReturnJsonServlet extends HttpServlet {

	private static final long serialVersionUID = 4187620098713511247L;
	private static final Logger LOGGER = Logger
			.getLogger(ReturnJsonServlet.class.getName());

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			String tagName = request.getParameter("tagName");
			if (tagName != null) {
				String json = new Gson()
						.toJson(new Media(
								new Image(
										"img1.jpg",
										"http://rack.0.mshcdn.com/media/ZgkyMDEyLzEyLzA0L2IxL2ZibWVmYWNlYm9vLmFEei5qcGcKcAl0aHVtYgk5NTB4NTM0IwplCWpwZw/1cc96e9e/948/fb-me-facebook-now-has-its-own-url-shortener-6027d97b72.jpg",
										"142Kb")));
				response.setContentType("application/json");
				response.setCharacterEncoding("UTF-8");
				PrintWriter writer = response.getWriter();
				writer.write(json);
				writer.close();
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				response.flushBuffer();
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
