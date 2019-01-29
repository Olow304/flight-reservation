<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<body>
<div align="center">
    <h1>Login here</h1>
    <pre>
        <f:form method="post" action="login" modelAttribute="login">
            <label>Email: </label><f:input path="email"/>
            <label>Password: </label><f:password path="password"/>
            <input type="submit" value="Login">
            ${msg}
        </f:form>
    </pre>
</div>
</body>
</html>