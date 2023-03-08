<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2 style="color: blue">Dear Employee, yoa are WELCOME!!!</h2>
<br>
<br>
<br>
<%--Your name: ${param.employeeName}  &lt;%&ndash; ${param.employeeName} для вывода информации из переменной&ndash;%&gt;--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surName}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Languages(s):
<ul>
    <c:forEach var="lang"  items="${employee.languages}">
        <li> ${lang}</li>
    </c:forEach>
</ul>

Phone number : ${employee.phoneNumber}
<br>
Email : ${employee.email}
</body>
</html>
