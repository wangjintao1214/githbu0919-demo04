
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<form action="/doAdd" method="post">
<h3>宠物的基本信息</h3>
    <p>昵称：<input type="text" name="petName"></p>
    <p>品种：<select name="petBreed">
        <option value="0">--请选择--</option>
        <option value="1">金毛</option>
        <option value="2">拉布拉多</option>
        <option value="3">柯基</option>
        <option value="4">二哈</option>
    </select>
    </p>
    <p>性别：<input type="radio" value="雄" name="petSex" checked>雄<input type="radio" value="雌" name="petSex">雌
    </p>
    <p>出生日期：<input type="text" name="birthday">yyyy-mm-dd</p>
    <p>宠物描述：<textarea rows="5" cols="30" name="description"></textarea></p>
    <p>
        <input value="提交" type="submit">
        <input type="reset">
    </p>
</form>

</body>
<script type="text/javascript">
    $("form").submit(function () {
        var name=$("[name='petName']").val();
        var type=$("[name='petBreed']").val();
        var birthday=$("[name='birthday']").val();
        if(name==""){
            alert("昵称不能为空!");
            return false;
        }
        if(type=="0"){
            alert("请选择品种!");
            return false;
        }
        var reg = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
        var regExp = new RegExp(reg);
        if(!regExp.test(birthday)){
            alert("日期格式不正确");
            return false;
        }
        return true;
    })
</script>
</html>
