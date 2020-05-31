/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;
import ModeloDAO.ProductoDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author willy Chana
 */
public class Controlador extends HttpServlet {

    ProductoDAO pdao = new ProductoDAO();
    Producto p = new Producto();
    int id;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = (request.getParameter("accion") != null ? request.getParameter("accion") : "listar");

        switch (accion) {
            case "listar":

                List<Producto> lp = pdao.Listar();
                request.setAttribute("productos", lp);
                request.getRequestDispatcher("Vista/Main.jsp").forward(request, response);
                break;
            case "edit":
                id = Integer.parseInt(request.getParameter("id"));
                p = pdao.getProducto(id);
                request.setAttribute("producto", p);
                request.getRequestDispatcher("Vista/Editar.jsp").forward(request, response);
                break;
            case "delet":
                id = Integer.parseInt(request.getParameter("id"));
                pdao.delete(id);
                response.sendRedirect("Controlador");
                break;
            case "new":
                request.getRequestDispatcher("Vista/Nuevo.jsp").forward(request, response);
                break;

            default:
                response.sendRedirect("index.jsp");
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = (request.getParameter("accion") != null ? request.getParameter("accion") : "listar");

        switch (accion) {
            case "add":
                String desc = request.getParameter("desc");
                int stock = Integer.parseInt(request.getParameter("stock"));
                p.setDesc(desc);
                p.setStock(stock);
                pdao.add(p);
                response.sendRedirect("Controlador");
                break;

            case "update":
                id = Integer.parseInt(request.getParameter("id"));
                String desc1 = request.getParameter("desc");
                int stock1 = Integer.parseInt(request.getParameter("stock"));
                p.setDesc(desc1);
                p.setStock(stock1);
                pdao.update(p);
                response.sendRedirect("Controlador");
                break;
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
