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
        <h1>Register page</h1>
        <pre>
            <f:form method="post" action="register" modelAttribute="user">
                <label>First name: </label><f:input path="firstName" />
                <label>Last name: </label><f:input path="lastName" />
                <label>Email: </label><f:input path="email" />
                <label>Password: </label><f:password path="password" />
                <label>Confirm Password: </label><input type="password" name="confirmPassword" />
                <input type="submit" value="Register">
            </f:form>
        </pre>
    </div>

</body>
</html>