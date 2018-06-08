package web;

import java.io.IOException;

import org.json.JSONObject;

import domain.UrlPogoda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Katowice")
public class PogodaDlaKatowic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().println("UDA£O SIE");
		UrlPogoda url = new UrlPogoda();
		response.sendRedirect(url.getUrl(3096472));
		
	}
}
