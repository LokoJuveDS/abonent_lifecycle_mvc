<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>All Subscribers</h2>
<br>
<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Phone Number</th>
        <th>Balance</th>
        <th>Status</th>
    </tr>

    <c:forEach var="sub" items="${allSubs}">
        <tr>
            <td>${sub.firstName}</td>
            <td>${sub.lastName}</td>
            <td>${sub.msisdn}</td>
            <td>${sub.balance}</td>
            <td>${sub.status}</td>
        </tr>

    </c:forEach>

</table>

</body>
</html>