package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculator", value = "/calculate")
public class DiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productDescription = req.getParameter("productDescription");
        int listPrice = Integer.parseInt(req.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(req.getParameter("discountPercent"));
        double discountAmount = (listPrice * discountPercent * 0.01);

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<h2>Product Discount Calculator</h2>");
        out.println("<h3>Product Description: " + productDescription + "</h3>");
        out.println("<h3>List Price: " + listPrice + "</h3>");
        out.println("<h3>Discount Percentage: " + discountPercent + "</h3>");
        out.println("<h3>Discount Amount: " + discountAmount + "</h3>");
        out.println("</html>");
    }
}
