<%-- 
    Document   : crearForm
    Created on : 31-08-2018, 15:45:00
    Author     : alejandro
--%>

<%@page contentType="text/html"%>
<%
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
                    <div class="container">
                        <div class="row">
                            <form action="<%=request.getContextPath()%>/hola-mundo.htm" method="post" class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label for="nombre" class="col-sm-2 control-label">Nombre</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="nombre" style="width: 300px;" class="form-control" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">Email</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="email" style="width: 300px;" class="form-control" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="saldo" class="col-sm-2 control-label">Saldo</label>

                                    <div class="col-sm-10">
                                        <input type="text" name="saldo" style="width: 300px;" class="form-control" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="nivelEndeudamiento" class="col-sm-2 control-label">Nivel Endeudamiento</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="nivelEndeudamiento" style="width: 300px;" class="form-control" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="fechaRenovacion" class="col-sm-2 control-label">Fecha Renovaci?n</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="fechaRenovacion" style="width: 300px;" class="form-control" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-10">
                                        <input type="submit" value="<%=titulo2%>"
                                               class="btn btn-primary" role="button" />
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </body>
</html>

