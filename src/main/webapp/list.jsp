<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List Page</title>
  </head>
  <body>
    <h1>List of pets</h1>
    <hr/>
    <ul>
      <c:forEach var="pet" items="${pets}">
        <li>
          <form action="PetServlet" method="GET">
          ${pet.id}: ${pet.name} is ${pet.age} years old
          <input type="hidden" name="id" value="${pet.id}"/>
          <button name="command" value="edit">Edit</button>
          </form>
        </li>
      </c:forEach>
    </ul>
    <form action="PetServlet" method="GET">
      <button name="command" value="back">Back</button>
    </form>
  </body>
</html>
