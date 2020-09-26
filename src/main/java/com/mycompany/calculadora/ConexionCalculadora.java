/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author erikssonherlo
 */
@WebServlet(name = "logica", urlPatterns = {"/logica"})
public class ConexionCalculadora extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        double n1 = Double.parseDouble(request.getParameter("n1"));
        double n2 = Double.parseDouble(request.getParameter("n2"));
        
       
        Calculo calc = new Calculo(n1, n2);
        //int n1 = Integer.parseInt(request.getParameter("n1"));
        //int n2 = Integer.parseInt(request.getParameter("n2"));
        
        
        String cadenaRetorno = "";
        if (request.getParameter("suma") != null) {
            
            cadenaRetorno+="<h1>Suma: </h1>" + calc.suma();
        }
        if (request.getParameter("resta") != null) {
            cadenaRetorno+="<h1>Resta: </h1>" + calc.resta();
        }
        if (request.getParameter("multiplicacion") != null) {
            cadenaRetorno+="<h1>Multiplicacion: </h1>" + calc.multiplicacion();
        }
        if (request.getParameter("division") != null) {
            cadenaRetorno+="<h1>Division: </h1>" + calc.division();
        }
        if (request.getParameter("mayor") != null) {
            cadenaRetorno+="<h1>Numero Mayor: </h1>" + calc.mayorQue();
            
        }
        if (request.getParameter("potencia") != null) {
            cadenaRetorno+="<h1>Potenciacion: </h1>" + calc.potencia();
        }
        if (request.getParameter("binario") != null) {
            
        
            cadenaRetorno+="<h1>Binarios: </h1>";
            cadenaRetorno+="<p>El Numero Decimal "+n1+" equivale a: "+calc.binario(n1)+" en Numeros Binarios</p>";
            
            cadenaRetorno+="<br>";
            
            cadenaRetorno+="<p>El Numero Decimal "+n2+" equivale a: "+calc.binario(n2)+" en Numeros Binarios</p>";
        }
        request.setAttribute("Resultado", cadenaRetorno);
        RequestDispatcher despachar = request.getRequestDispatcher("index.jsp");
        despachar.forward(request, response);
        
      
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
        processRequest(request, response);
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
