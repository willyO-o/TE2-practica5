<%-- 
    Document   : Main
    Created on : 31-may-2020, 14:57:02
    Author     : willy
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>

        <div class="container">

            <div class="card mt-5" >
                <div class="card-body">
                    <h1 class="text-center my-4">Productos</h1>
                    
                    <div class="my-4">
                        <a href="Controlador?accion=new" class="btn btn-primary"> 
                            Nuevo Producto
                        </a>
                    </div>
                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Descripcon</th>
                                <th scope="col">Stock</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="pr" items="${productos}">
                                <tr>
                                    <th scope="row">${pr.getId()}</th>
                                    <td>${pr.getDesc()}</td>
                                    <td>${pr.getStock()}</td>
                                    <td>
                                        <a href="Controlador?accion=edit&id=${pr.getId()}">
                                            <button class="btn btn-warning">Editar</button>
                                        </a>
                                        <a href="Controlador?accion=delet&id=${pr.getId()}">
                                            <button class="btn btn-danger">Eliminar</button>
                                        </a>
                                    </td>

                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>

                </div>
            </div>
        </div>

        <!-- JS, Popper.js, and jQuery -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </body>
</html>
