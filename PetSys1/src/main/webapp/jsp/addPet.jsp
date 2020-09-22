<%--
  Created by IntelliJ IDEA.
  User: 86150
  Date: 2020/9/20
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/js/jquery-1.12.4.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doAddPet" method="post">
    <table>
        <tr>
            <td>宠物基本信息</td>
        </tr>
        <tr>
            <td>昵称:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>品种:</td>
            <td><select name="petbreed">
                <option value="狗">狗</option>
                <option value="猫">猫</option>
                <option value="鼠">鼠</option>
                <option value="鸟">鸟</option>
            </select>
            </td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><input type="radio" name="sex" value="雌">雌</td>
            <td><input type="radio" name="sex" value="熊">熊</td>
        </tr>
        <tr>
            <td>出生日期:</td>
            <td><input type="text" name="date">yyyy-MM-dd</td>
        </tr>
        <tr>
            <td>宠物描述:</td>
            <td><textarea name="describle"></textarea></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
            <td><input  type="button" value="重置"/></td>
        </tr>
    </table>

</form>
<script>
    $("form").submit(function () {
        var name=$("[name='name']").val();
        if(name==""){
            alert("宠物昵称不能为空");
            return false;
        }
        var date=$("[name='date']").val();
        if(date==""||date.RegExp("/^((?:19|20)\d\d)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$/)")==false){
            alert("日期填写错误");
            return false;
        }
    })
</script>
</body>
</html>
