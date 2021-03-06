/**
 * 访问网站根目录进入index.jsp
 */
package xyz.TonyaBaSygroup.course.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class RootServlet
 */
public class RootServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RootServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String identity = (String) request.getSession().getAttribute("identity");
        String contextPath = request.getContextPath();
	    if("student".equals(identity)) {
	        response.sendRedirect(contextPath + "/student");
	    } else if("teacher".equals(identity)) {
	        response.sendRedirect(contextPath + "/teacher");
	    } else if("manager".equals(identity)) {
	        response.sendRedirect(contextPath + "/manager");
	    } else {
	        response.sendRedirect(contextPath + "/login");
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doGet(request, response);
	}

}
