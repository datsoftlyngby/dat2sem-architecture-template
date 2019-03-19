<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Page</title>
  </head>
  <body>
    <h1>Edit the pet data</h1>
    <c:if test="${!empty message}">
      <div style="border: 3px solid red; background-color: yellow;">
        ${message}
      </div>
    </c:if>
    <hr/>
    <form action="PetServlet" method="GET">
      <input name="id" type="hidden" value="${pet.id}"/>
      <table>
        <tr>
          <th>Id</th>
          <td>${pet.id}</td>
        </tr>
        <tr>
          <th>Name</th>
          <td><input name="name" type="text" value="${pet.name}"/></td>
        </tr>
        <tr>
          <th>Age</th>
          <td><input name="age" type="text" value="${pet.age}"/></td>
        </tr>
        <tr>
          <td colspan="2" style="text-align: center">
            <button name="command" value="save">Save</button>
            <button name="command" value="cancel">Cancel</button>
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>
