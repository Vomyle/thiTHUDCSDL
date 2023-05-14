package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SinhvienDAO;
import model.Sinhvien;

/**
 * Servlet implementation class ListSinhvien
 */
@WebServlet("/ListSinhvien")
public class ListSinhvien extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final SinhvienDAO sinhviendao=new SinhvienDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListSinhvien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Sinhvien> sinhviens =sinhviendao.findALL();
		request.setAttribute("sinhviens",sinhviens);
		request.getRequestDispatcher("/WEB-INF/view/show_sinhviens_view.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
