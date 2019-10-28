<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"     %>


<!DOCTYPE html>
<html>
<head>
    <title>AnimalFarm</title>
    <style><%@include file="../css/style.css"%></style>
</head>
<body>

<h2>Animal Management Console</h2>

<hr/>
<form method="post" action="/save">
    <input type="hidden" name="id" value="">
    Animal Name:<br>
    <input type="text" name="animal_name">
    <br>
    Animal Type:<br>
    <input type="text" name="animal_type" >
    <br>
    Animal Age:<br>
    <input type="number" name="animal_age">
    <br><br>
    <input type="submit" value="Submit">
</form>

<hr/>

<table class="myCoolStyle">
    <tr>
        <th>ID</th>
        <th>Animal Name</th>
        <th>Animal Type</th>
        <th>Animal Age</th>
        <th>Action</th>
    </tr>
    <c:forEach var = "item" items = "${list}">
    <tr>

        <td>${item.id}</td>
        <td>${item.animal_name}</td>
        <td>${item.animal_type}</td>
        <td>${item.animal_age}</td>
        <td>
            <a href="/delete/${item.id}"><img src="../../img/delete.jpg" alt="delete_image" ></a>
        </td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
