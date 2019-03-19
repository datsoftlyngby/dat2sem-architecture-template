package dk.cphbusiness.pets.presentation;

import dk.cphbusiness.pets.data.Pet;
import dk.cphbusiness.pets.logic.PetManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PetServlet", urlPatterns = {"/PetServlet"})
public class PetServlet extends HttpServlet {
  private PetManager manager = new PetManager();
  
  private Map<String, Command> commands = new HashMap<>();
  
  public PetServlet() {
    commands.put("list", new ListCommand("list.jsp"));
    // commands.put("create", new CreateCommand("edit.jsp"));
    }

  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String commandKey = request.getParameter("command");
    Command command = commands.get(commandKey);
    String target = command.execute(request, manager);
    RequestDispatcher dispatcher = request.getRequestDispatcher(target);
    dispatcher.forward(request, response);
 
    }

  @Override
  public String getServletInfo() {
    return "Short description";
    }// </editor-fold>

  }
