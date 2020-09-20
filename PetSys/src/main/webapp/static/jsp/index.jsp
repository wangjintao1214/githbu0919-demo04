<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/9/20
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<body>
<form action="/" method="post">
    <p align="center">
        品种&nbsp;
        <select name="type">
            <option value="0">--请选择--</option>
            <option value="1">金毛</option>
            <option value="2">拉布拉多</option>
            <option value="3">柯基</option>
            <option value="4">二哈</option>
        </select>
        <input type="submit" value="查询">&nbsp;
        <a href="/toAdd">新增宠物</a>
    </p>
</form>
<table border="1" align="center" style="width:600px;height: 160px;">
    <tr align="center" style="background-color: #9C9A9F;font-weight: bolder">
        <td>宠物昵称</td>
        <td>出生日期</td>
        <td>性别</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr align="center" class="bian">
            <td>${item.petName}</td>
            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${item.birthday}" type="both"/></td>
            <td>${item.petSex}</td>
        </tr>
    </c:forEach>
</table>
</body>
<script type="text/javascript">
    $(".bian:odd").css("background-color","#97D1FA");
</script>
</html>
