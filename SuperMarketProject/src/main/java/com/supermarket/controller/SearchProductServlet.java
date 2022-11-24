package com.supermarket.controller;

import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.entity.Products;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchProductServlet", value = "/SearchProductServlet")
public class SearchProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDAO productDAO = new ProductDAO();

        String name = request.getParameter("searchValue");
        List<Products> productsList = productDAO.searchProduct(name);

        request.setAttribute("products", productsList);
        request.setAttribute("total", productsList.size());

//        response.sendRedirect("groceries.jsp");
        getServletContext().getRequestDispatcher("/search-product.jsp").forward(request, response);
    }
}
