package Com.Mytaxi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Mytaxi.dao.UserDao;
import Com.Mytaxi.model.User;

/**
 * Servlet implementation class RegisterServelt
 */
@WebServlet("/register")
public class RegisterServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String username=request.getParameter("username");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			
			User user = new User();
			user.setUsername(username);
			user.setEmail(email);
			user.setPassword(password);
			
			
			boolean result = new UserDao().createUser(user);
			if(result) {
          		// response.getWriter().print("user created");
				response.sendRedirect("RegisterCreated.jsp");
			}
			else {
				response.getWriter().print("not created");
			//	req.setAttribute("errormsg", "User ID aleady exists");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
	}

