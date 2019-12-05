<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/19/2019
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Chat Bot</title>
  </head>
  <body>
  <h4>Client Socket</h4>

  <label for="textMessage">Chat Message</label>
  <input type="text" name="message" id="textMessage">
  <button id="submit">Send</button>
  <textarea name="responseArea" id="response" cols="30" rows="10"></textarea>
  <button id="end">Disconnect</button>
  </body>
  <script src = "scripts/script.js"></script>
</html>
