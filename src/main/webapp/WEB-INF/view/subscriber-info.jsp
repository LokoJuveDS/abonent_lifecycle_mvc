<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Subscriber info</h2>
<br>

<form:form action="subscribers" modelAttribute="subscriber" method="post">

    <form:hidden path="id"/>

    First Name: <form:input path="firstName"/>
    <form:errors path="firstName"/>
    <br><br>
    Last Name: <form:input path="lastName"/>
    <form:errors path="lastName"/>
    <br><br>
    Phone Number: <form:input path="msisdn"/>
    <form:errors path="msisdn"/>
    <br><br>
    Balance: <form:input path="balance"/>
    <form:errors path="balance"/>
    <br><br>
    Status: ${subscriber.status ? 'Active':'Blocked'} <form:hidden path="status"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>
</body>
</html>