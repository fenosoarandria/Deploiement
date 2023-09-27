package Controller;

import Model.Employe;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Helloworld", urlPatterns = {"/Helloworld"})
public class Helloworld extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Employe emp = new Employe();
        String affiche = emp.Hello();
        request.setAttribute("List", affiche);
        RequestDispatcher dispath = request.getRequestDispatcher("/Employe.jsp");
        dispath.forward(request, response);
    }

   
}
