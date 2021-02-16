<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Subscriber info</h2>
<br>

<form:form action="saveSubscriber" modelAttribute="subscriber">

    <form:hidden path="id"/>

    First Name <form:input path="firstName"/>
    <br><br>
    Last Name <form:input path="lastName"/>
    <br><br>
    Phone Number <form:input path="msisdn"/>
    <br><br>
    Balance <form:input path="balance"/>
    <br><br>
    Status <form:input path="status"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>
</body>
</html>