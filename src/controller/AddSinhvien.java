package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SinhvienDAO;
import model.Sinhvien;

/**
 * Servlet implementation class AddSinhvien
 */
@WebServlet("/AddSinhvien")
public class AddSinhvien extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  private final SinhvienDAO sinhviendao=new SinhvienDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSinhvien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	
		
        Sinhvien sv= new Sinhvien();
        sv.setTen(request.getParameter("f_ten"));
        sv.setNgaysinh(request.getParameter("f_ngaysinh"));
       String sdtb=request.getParameter("f_dtb");

     
    	   try {
    	     	   float dtb=Float.parseFloat(sdtb);
    	            sv.setDtb(dtb);
    	     	   String mess = "";
    	    		if (sinhviendao.add(sv))
    	    			mess = "Them thanh cong!";
    	    		else
    	    			mess = "Them KHONG thanh cong!";
    	    		
    	    		request.setAttribute("mess", mess);
    	    		request.getRequestDispatcher("/WEB-INF/view/Add_sinhvien_form_view.jsp").forward(request, response);
    	     	} catch (NumberFormatException e) {
    	     		String mess = "DTB nhap vao khong phai la kieu so";
    	     		request.setAttribute("mess", mess);
    	        		request.getRequestDispatcher("/WEB-INF/view/Add_sinhvien_form_view.jsp").forward(request, response);
    	     	}
    	     	

       
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
