<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>MOVIE LIST</title>
</head>
<body>
<h3>Employees</h3>
<c:if  test="${!empty moviesList}">
<table class="data">
<tr>
    <th>Title</th>
    <th>Description</th>
    <th>Telephone</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${moviesList}" var="movie">
    <tr>
        <td>${movie.title} </td>
        <td>${movie.description}</td>
        <td>${movie.rentalPrice}</td>
        <td><a href="rent/${movie.id}">RENT</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
</body>
</html>