<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<table border="1" cellspacing="0" cellpadding="2">
    <tr>
        <td>model</td>
        <td>color</td>
        <td>number</td>
    </tr>

    <c:forEach items="${cars}" var="car" varStatus="status">
        <tr>
            <td >${car.getModel()}</td>
            <td>${car.getColor()}</td>
            <td>${car.getNumberAuto()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
