<%--
  Created by IntelliJ IDEA.
  User: 86150
  Date: 2020/9/20
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/js/jquery-1.12.4.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>${sucess}</div>
<div>${fail}</div>
<form action="/selectPetBybreed" method="post">

    <table border="1px">
        <td>宠物基本信息</td>
        <td>品种<select name="breed">
            <option>猫</option>
            <option>鼠</option>
            <option>狗</option>
            <option>鸟</option>
        </select>
            <input type="submit" value="查询"></td>
        <a href="/addPet">新增宠物</a>
        </tr>
        <tr>
            <td>昵称:</td>
            <td>出生日期</td>
            <td>性别</td>
        </tr>
        <c:forEach var="pet" items="${list}">
            <tr>
                <td>${pet.petname}</td>
                <td>${pet.birthday}</td>
                    <%--   <td><fmt:formatDate value="" pattern="yyyy-MM-dd"></fmt:formatDate></td>--%>
                <td>${pet.petsex}</td>
            </tr>
        </c:forEach>
    </table>

</form>
<script>
    $(function () {
        $("tr:odd").css("background-color", "pink");
    })
</script>
</body>
</html>
