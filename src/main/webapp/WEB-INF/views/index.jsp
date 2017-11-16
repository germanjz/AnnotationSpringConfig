<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
</head>
<div class="col-sm-offset-1 col-sm-10">
 
    <legend>
        Lista de codigos Iata
    </legend>
 
    <div>
        <table id="dataTable" class="table table-striped table-bordered">
            <thead>
                <tr>
                    <th>Clave</th>
                    <th>Codigo</th>
                    <th>Clave de Pais</th>
                    <th>Ciudad</th>
                </tr>
            <thead>
            <tbody>
                <c:forEach var="codigos" items="${iataModel.listResponse}">
                    <tr>
                        <td>${codigos.id}</td>
                        <td>${codigos.code}</td>
                        <td>${codigos.countryCode}</td>
                        <td>${codigos.name}</td>
                    <tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>