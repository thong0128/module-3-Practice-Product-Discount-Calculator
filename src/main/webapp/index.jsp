<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/calculate" method="post">
    <label>Product Description: </label><br/>
    <input type="text" name="productDescription" placeholder="Mô tả của sản phẩm"/><br/>
    <label>List Price: </label><br/>
    <input type="text" name="listPrice" placeholder="Giá niêm yết của sản phẩm" value="0"/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="discountPercent" placeholder="Tỷ lệ chiết khấu (phần trăm)" value="10"/><br/>
    <input type = "submit" id = "submit" value = "Discount"/>
</form>
</body>
</html>