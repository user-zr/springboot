<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<table border="1px" align="center">
    <tr>
        <th>序号</th>
        <th>名字</th>
        <th>年龄</th>
    </tr>

<#--
list:余姚遍历集合的名称
user:遍历结合的每一个对象
user_index:表示当前对象的下标
-->
    <#list li as user>
        <#if user_index%2==0>
            <tr bgcolor="red">
        </#if>
        <#if user_index%2!=0>
            <tr bgcolor="#ffe4c4">
        </#if>
            <th>${user_index+1}</th>
            <th>${user.name}</th>
            <th>${user.age}</th>
        </tr>
    </#list>
</table>
</body>
</html>