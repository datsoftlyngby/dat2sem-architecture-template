<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Main Page</title>
  </head>
  <body>
    <h1>Main</h1>
    <hr/>
    <form action="PetServlet" method="get">
      <button name="command" value="list">List Pets</button>
      <button name="command" value="create">Create Pet</button>
    </form>
  </body>
</html>
