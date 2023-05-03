package Com.Mytaxi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Mytaxi.dao.EnquiryDao;
import Com.Mytaxi.model.Enquiry;

/**
 * Servlet implementation class EnquiryServelt
 */
@WebServlet("/enquiry")
public class EnquiryServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnquiryServelt() {
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
		String name =request.getParameter("name");
		String mobile =request.getParameter("mobile");
		String email =request.getParameter("email");
		String subject =request.getParameter("subject");
		String comment =request.getParameter("comment");
		
		Enquiry enquiry=new Enquiry();
		enquiry.setName(name);
		enquiry.setMobile(mobile);
		enquiry.setEmail(email);
		enquiry.setSubject(subject);
		enquiry.setComment(comment);
		
		
		boolean result = new EnquiryDao().createEnquiry(enquiry);
		
		if(result) {
			response.getWriter().print("user created");
			
		}else {
			response.getWriter().print("something went");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


