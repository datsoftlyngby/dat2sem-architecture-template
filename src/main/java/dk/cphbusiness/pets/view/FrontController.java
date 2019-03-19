package dk.cphbusiness.pets.view;

import dk.cphbusiness.pets.view.commands.Command;
import dk.cphbusiness.pets.control.PetManager;
import dk.cphbusiness.pets.view.commands.CommandException;
import dk.cphbusiness.pets.view.commands.CommandFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PetServlet", urlPatterns = {"/PetServlet"})
public class FrontController extends HttpServlet {
  private final PetManager manager = new PetManager();
  
  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String commandKey = request.getParameter("command");
    Command command = CommandFactory.commandFrom(commandKey);
    try {
      String target = command.execute(request, manager);
      RequestDispatcher dispatcher = request.getRequestDispatcher(target);
      dispatcher.forward(request, response);
      }
    catch (CommandException ce) {
      request.setAttribute("message", ce.getMessage());
      RequestDispatcher dispatcher = request.getRequestDispatcher(ce.getTarget());
      dispatcher.forward(request, response);
      }
    catch (Exception e) {
      PrintWriter out = response.getWriter();
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("  <head><title>PANIC Page</title></head>");
      out.println("  <body>");      
      out.println("    <h3>"+e.getMessage()+"</h3><hr/>");
      out.println("    <pre>");
      e.printStackTrace(out); // Don't do this in production code!
      out.print("</pre>");
      out.println("  </body>");
      out.println("</html>");
      }
    }

  @Override
  public String getServletInfo() {
    return "Short description";
    }

  }
