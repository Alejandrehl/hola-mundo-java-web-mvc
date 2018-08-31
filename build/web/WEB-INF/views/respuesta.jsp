<%-- 
    Document   : respuesta
    Created on : 31-08-2018, 16:03:27
    Author     : alejandro
--%>

<%@page import="com.formaciondbi.ejemplo.servlet.models.Cuenta"%>
<%@page contentType="text/html"%>
<%
    Cuenta cuenta = (Cuenta) request.getAttribute("cuenta");
    String titulo = (String) request.getAttribute("titulo");
    String titulo2 = (String) request.getAttribute("titulo2");
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title><%=titulo%></title>
        <!-- Bootstrap -->
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h1>
                    <%=titulo%>
                </h1>
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading"><%=titulo2%></div>
                <div class="panel-body">
                    <table class="table table-striped table-hover table-bordered">
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Email</th>
                                <th>Saldo</th>
                                <th>Endeudamiento</th>
                                <th>Fecha Renovaci?n</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><%=cuenta.getNombre()%></td>
                                <td><%=cuenta.getEmail()%></td>
                                <td><%=cuenta.getSaldo()%></td>
                                <td><%=cuenta.getNivelEndeudamiento()%></td>
                                <td><%=cuenta.getFechaRenovacion()%></td>
                            </tr>
                        </tbody>
                    </table>
                    <a class="btn btn-default" href="<%=request.getContextPath()%>/hola-mundo.htm" role="button">Volver</a>
                </div>
            </div>
        </div>
    </body>
</html>
