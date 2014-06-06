<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>RENTAL</title>
</head>
<body>
<h3>Your rental</h3>
<table class="data">
<tr>
    <th>Customers name</th>
    <th>Movie Title</th>
    <th>Rented by</th>
    <th>Rental price</th>
</tr>

    <tr>
        <td>${rental.customer.firstName} ${rental.customer.lastName} </td>
        <td>${rental.movie.title} </td>
        <td>${rental.staff.firstName} </td>
        <td>${rental.movie.rentalPrice}</td>
    </tr>
</table>

</body>
</html>