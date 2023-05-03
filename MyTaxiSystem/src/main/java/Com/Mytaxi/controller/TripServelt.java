package Com.Mytaxi.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Mytaxi.dao.TripDao;
import Com.Mytaxi.model.Trip;

/**
 * Servlet implementation class TripServelt
 */
@WebServlet("/Trip")
public class TripServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TripServelt() {
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
			String pickup =request.getParameter("pickup");
			String droplocation =request.getParameter("droplocation");
			String mobile=request.getParameter("mobile");
			String time=request.getParameter("time");
			String date=request.getParameter("date");
			
			Trip trip = new Trip();
			trip.setPickup(pickup);
			trip.setDroplocation(droplocation);
			trip.setMobile(mobile);
			trip.setTime(time);
			trip.setDate(date);
			
			
			
			boolean result =new TripDao().createTrip(trip);
			
			if(result) {
				// response.getWriter().print("user created")
				response.sendRedirect("tripcreated.jsp");
				
			}else {
				response.getWriter().print("something went");
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
	


