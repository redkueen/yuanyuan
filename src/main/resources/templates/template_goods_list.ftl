<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>商品列表</title>
</head>
<body>
<#list goodsS as goods>
<div> <a  href="/goods/get?id=${goods.id}">${goods.goodsName}</div>
</#list>
</body>
</html>