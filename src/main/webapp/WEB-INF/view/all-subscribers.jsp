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
        <th>Operations</th>
        <th>Admin functions</th>

    </tr>

    <c:forEach var="sub" items="${allSubs}">

        <c:url var="refillButton" value="/refillBalance">
            <c:param name="subId" value="${sub.id}"/>
        </c:url>

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="subId" value="${sub.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteSubscriber">
            <c:param name="subId" value="${sub.id}"/>
        </c:url>


        <tr>
            <td>${sub.firstName}</td>
            <td>${sub.lastName}</td>
            <td>${sub.msisdn}</td>
            <td>${sub.balance}</td>
            <td>${sub.status ? 'Active':'Blocked'}</td>
            <td>
                <input type="button" value="Refill"
                       onclick="window.location.href = '${refillButton}'"/>
            </td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'"/>

                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>


        </tr>

    </c:forEach>
</table>
<br>
<input type="button" value="Add"
       onclick="window.location.href='addNewSubscriber'"/>

</body>
</html>