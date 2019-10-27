<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>HTML Table</h2>

<table>

    <tr>
        <th>ID</th>
        <td>${selectedItem.id}</td>
    </tr>
    <tr>
        <th>First Name</th>
        <td>${selectedItem.firstName}</td>
    </tr>
    <tr>
        <th>Last Name</th>
        <td>${selectedItem.lastName}</td>
    </tr>
</table>
<a href="/">Back</a>

</body>
</html>
