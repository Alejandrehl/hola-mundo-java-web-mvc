/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formaciondbi.ejemplo.servlet;

import com.formaciondbi.ejemplo.servlet.models.Cuenta;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alejandro
 */
@WebServlet(name = "HolaMundoServlet", urlPatterns = {"/hola-mundo.htm"})
public class HolaMundo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("titulo", "Formulario Básico");
        request.setAttribute("titulo2", "Crear Cuenta");
        getServletContext().getRequestDispatcher("/WEB-INF/views/crearForm.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String saldo = request.getParameter("saldo");
        String nivelEndeudamiento = request.getParameter("nivelEndeudamiento");
        String fechaRenovacionString = request.getParameter("fechaRenovacion");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaRenovacion = null;
        try {
            fechaRenovacion = formatter.parse(fechaRenovacionString);
        } catch (ParseException ex) {
        }

        Cuenta cuenta = new Cuenta();
        cuenta.setNombre(nombre);
        cuenta.setEmail(email);

        try {
            cuenta.setSaldo(new BigDecimal(saldo));
            cuenta.setNivelEndeudamiento(new BigDecimal(nivelEndeudamiento));
        } catch (NumberFormatException ex) {
        }

        cuenta.setFechaRenovacion(fechaRenovacion);

        request.setAttribute("cuenta", cuenta);
        request.setAttribute("titulo", "Formulario Básico Servlet: Datos enviados");
        request.setAttribute("titulo2", "Detalle Cuenta: " + cuenta.getNombre());

        getServletContext().getRequestDispatcher("/WEB-INF/views/respuesta.jsp").forward(request, response);
       
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
