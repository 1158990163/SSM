<%--
  Created by IntelliJ IDEA.
  User: lty
  Date: 2020/10/4
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
    </script>
  </head>
  <body>
  <script>

    function editCustomer(id) {
      $.ajax({
        type:"get",
        url:"${pageContext.request.contextPath }/testajax",
        data:{"id":id},
        dataType:'text',
        success:function(data) {
          console.log("ajax");
          console.log(data)
        },
        error:function (data) {
          alert(data)
        }

      });
      console.log("out");
    }
  </script>
  <input type="button" style="width:100px;height: 40px" onclick="editCustomer(1)" value="AJAX" >

  </body>
</html>
