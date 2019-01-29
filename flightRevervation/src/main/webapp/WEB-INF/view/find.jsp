<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.saleban.flightReversation.util.Mappings" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<body>
<div align="center">
    <h1>Find a flight</h1>
        <table border="1">
            <tr>
                <th>Airline</th>
                <th>Departure</th>
                <th>Arrival</th>
            </tr>
        <c:forEach var="flight" items="${flight}">
            <tr>
                <td><c:out value="${flight.operatingAirlines}" /></td>
                <td><c:out value="${flight.departureCity}" /></td>
                <td><c:out value="${flight.arrivalCity}" /></td>
                <td><a href="display?id=${flight.id}">select</a></td>
            </tr>
        </c:forEach>
        </table>
        <a href="${Mappings.FIND_FLIGHTS}">Find a flight</a>
</div>
</body>
</html>