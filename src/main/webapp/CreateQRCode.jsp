<%--
  Created by IntelliJ IDEA.
  User: Jay
  Date: 2018/9/26
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>生成二维码</title>
    <%--首先引入Jquery--%>
    <script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
    <%--然后引入jquery.qrcode.min.js--%>
    <script type="text/javascript" src="/js/jquery.qrcode.min.js"></script>
</head>
<body>
<h2>生成的二维码如下:</h2>
<br>
<div id="qrcode"></div>
<script type="text/javascript">
    //jquery('#qrcode').qrcode("www.Scoripions.com!");
    jQuery('#qrcode').qrcode({width: 128,height: 128,text: "size doesn't matter"});
</script>

</body>
</html>
