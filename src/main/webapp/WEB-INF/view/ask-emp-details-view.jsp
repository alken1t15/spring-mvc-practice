<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<body>
<h2>Dear Employee, Please enter your details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee" method="get">
    Name <form:input path="name"/>
    <form:errors path="name"/> <%-- отвечает за ошибки--%>
    <br><br>
    Surname <form:input path="surName"/>
    <form:errors path="surName"/> <%-- отвечает за ошибки--%>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/> <%-- отвечает за ошибки--%>
    <br><br>
    <%--    HARD CODE--%>
    <%--    Department <form:select path="department">--%>
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Sales" label="SALES"/>--%>
    <%--</form:select>--%>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
<%--    HARD CODE--%>
<%--    Which car do you want?--%>
<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    MB <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
    Which car do you want?
    <form:radiobuttons  path="carBrand" items="${employee.carBrands}"/>
    <br><br>
<%--    HARD CODE--%>
<%--    Foreign Language(s)--%>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/> <%-- отвечает за ошибки--%>
    <br><br>
    Email: <form:input path="email"/>
    <form:errors path="email"/> <%-- отвечает за ошибки--%>
    <input type="submit" value="OK">
</form:form>
</body>
</html>