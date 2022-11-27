package com.supermarket.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.entity.Products;

@WebServlet("/renderdata")
public class RenderProductDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDAO productDAO = null;

	@Override
	public void init() {
		productDAO = new ProductDAO();
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		String categoryNameToFind = request.getParameter("categoryName");
		if (categoryNameToFind == "" || categoryNameToFind == null) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}

		// Xoa khoang trang giua cac tu
		String categoryNameToSend = categoryNameToFind.replaceAll(" ", "");

		List<Products> products = productDAO.selectByCategoryName(categoryNameToFind);

		request.setAttribute("products", products);
		request.setAttribute("total", products.size());

		getServletContext().getRequestDispatcher("/" + categoryNameToSend.toLowerCase() + ".jsp").forward(request, response);
	}
}
