package xyz.TonyaBaSygroup.course.controller.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author TonyaBaSy
 * @version 1.0 4/30/16
 */
@WebServlet(name = "ManagerHomeServlet")
public class ManagerHomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("manager".equals(request.getSession().getAttribute("identity"))) {
            request.getRequestDispatcher("/WEB-INF/page/manager.jsp").forward(request,response);
        } else {
            response.sendError(404);
        }

    }
}
