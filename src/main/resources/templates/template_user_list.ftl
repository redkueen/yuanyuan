<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
</head>
<body>

<#list users as user>
<div>  <a  href="/user/get?id=${user.id}">   ${user.username}   </a>       </div>
</#list>

</body>
</html>