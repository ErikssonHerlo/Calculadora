<%-- 
    Document   : ingresoDatos
    Created on : 25/09/2020, 00:06:27
    Author     : erikssonherlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>     
    <%@ include file = "Header.html" %>     
    <BODY> 
        <%-- utilizaremos una estructura IF para tener una pagina dinamica--%>
        <%-- UTILIZAMOS SCRIPTLET--%>
        <% if(request.getAttribute("Resultado") == null) {%>
       

    <CENTER>     
        <H1>CALCULADORA</H1> 
        <H3>Elija las Operaciones que desea realizar con los numeros ingresados</H3>

    </CENTER>   
    <FORM METHOD="GET" ACTION="logica">  
        <DIV class="div">

            <P>     
                Primer Digito: <input type="number" step="0.001" name="n1" placeholder="Ingrese el Primer Numero" required>

            <P>     
                Segundo Digito: <input type="number" step="0.001" name="n2" placeholder="Ingrese el Segundo Numero" required>   

            <P>     
                <input type="radio" name="suma" value="1" /> - Suma

            <P>     
                <input type="radio" name="resta" value="2" /> - Resta 

            <P>     
                <input type="radio" name="multiplicacion" value="3" /> - Multiplicacion

            <P>     
                <input type="radio" name="division" value="4" /> - Division

            <P>     
                <input type="radio" name="mayor" value="5" /> - Obtener el Numero Mayor

            <P>     
                <input type="radio" name="potencia" value="6" /> - Obtener la Potencia n1^n2

            <P>     
                <input type="radio" name="binario" value="7" /> - Obtener el Valor Binario de Ambos Numeros

        </DIV>
        <CENTER>
            <P>     
                <input type="submit" value="Calcular">
                <input type="reset" value="Eliminar Datos" onclick="unselect()">
        </CENTER>

    </FORM>
    <% }else{ %>
    <%! String number1, number2;%> 
        
    <%
        number1 = request.getParameter("n1");
        number2 = request.getParameter("n2");
    %>    
    
    <CENTER>     
        <H1>CALCULADORA</H1> 
        <H3>El Resultado de las operaciones entre <%= number1%> y <%= number2%> es:</H3>

        <%=(String) request.getAttribute("Resultado")%>
    </CENTER>  
    <% } %>
</BODY>    
</HTML>  