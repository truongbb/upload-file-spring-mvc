<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 7/29/2022
  Time: 5:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Handle afer upload</title>
</head>
<body>
<h2>Submitted File</h2>

<c:if test="${!result}">
    <h3>Upload file thất bại</h3>
</c:if>
<c:if test="${result}">
    <p>Danh sách file đã upload: </p>
    <c:forEach items="${files}" var="f">
        <div>${f.originalFilename}</div>
    </c:forEach>
</c:if>

</body>
</html>
