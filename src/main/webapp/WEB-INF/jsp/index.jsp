<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"     %>


<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
    <style><%@include file="../css/style.css"%></style>
</head>
<body>

<h2>Styled People Management</h2>

<table class="myCoolStyle">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Action</th>
    </tr>
    <c:forEach var = "item" items = "${list}">
    <tr>

        <td>${item.id}</td>
        <td>${item.firstName}</td>
        <td>${item.lastName}</td>
        <td>
            <a href="/view/${item.id}">View</a>
            <a href="/edit/${item.id}">Edit</a>
            <a href="/delete/${item.id}"><img src="../../img/delete.jpg" alt="delete_image" ></a>
        </td>
    </tr>
    </c:forEach>
</table>

<hr/>
<form method="post" action="/save">
    <input type="hidden" name="id" value="">
    First name:<br>
    <input type="text" name="firstname">
    <br>
    Last name:<br>
    <input type="text" name="lastname" >
    <br><br>
    <input type="submit" value="Submit">
</form>

<hr/> <hr/>
<FORM ACTION="formAction.jsp" METHOD="POST">
    <SELECT NAME="select1" SIZE="5" MULTIPLE>
        <c:forEach var = "item" items = "${list}">
            <OPTION>${item.firstName} ${item.lastName}</OPTION>
        </c:forEach>
    </SELECT>
    <BR>
    <%--<INPUT TYPE="SUBMIT" VALUE="Submit">--%>
</FORM>

</body>
</html>
