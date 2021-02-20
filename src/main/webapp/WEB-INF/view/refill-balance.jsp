<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Refill balance</h2>
<br>

<form:form action="saveSubscriber" modelAttribute="subscriber" method="post">

    <form:hidden path="id"/>

    First Name: ${subscriber.firstName} <form:hidden path="firstName"/>
    <br><br>
    Last Name: ${subscriber.lastName} <form:hidden path="lastName"/>
    <br><br>
    Phone Number: ${subscriber.msisdn} <form:hidden path="msisdn"/>
    <br><br>
    Balance: <form:input path="balance"/>
    <br><br>
    Status: ${subscriber.status ? 'Active':'Blocked'} <form:hidden path="status"/>
    <br><br>
    <input type="submit" value="OK">


</form:form>
</body>
</html>