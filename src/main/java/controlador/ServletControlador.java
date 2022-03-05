package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")

public class ServletControlador extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //1procesamos los parametros
     
     //Creamos los javaBeans
     Rectangulo rec = new Rectangulo(3,6);

     // Agregamos al JavaBean algun alcance
     request.setAttribute("mensaje", "Saludo desde el Servlet");
     HttpSession sesion = request.getSession();
     sesion.setAttribute("rectangulo", rec);

     //Redireccionamos a la vista seleccionada
     RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
     rd.forward(request, response);
    }
}
