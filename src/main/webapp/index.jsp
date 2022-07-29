<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 7/29/2022
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo upload file</title>
</head>
<body>
<form action="upload-file" method="post" enctype="multipart/form-data">
    Select File: <input type="file" name="my-files" multiple="multiple"/>
    <input type="submit" value="Upload File"/>
</form>

</body>
</html>
