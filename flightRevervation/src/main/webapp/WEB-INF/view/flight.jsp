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
    <pre>
        <f:form method="post" action="flights" modelAttribute="flights">
            <label>From: </label><f:input path="departureCity" />
            <label>To: </label><f:input path="arrivalCity" />
            <input type="submit" value="Find a Trip">
        </f:form>
    </pre>
</div>

</body>
</html>