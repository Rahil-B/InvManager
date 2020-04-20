/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageUsers;

import Models.UserData;
import MyHibernate.HiberneteUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author RAHIL
 */
@WebServlet(name = "UserRegistrationServlet", urlPatterns = {"/UserRegistrationServlet"})
public class UserRegistrationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
        response.setContentType("text/html;charset=UTF-8");
        String fnm=request.getParameter("first_name");
        String lnm=request.getParameter("lnm");
        String p_no=request.getParameter("ph_no");
        String email=request.getParameter("email");
        String passWd=request.getParameter("password");
        String rePassWd=request.getParameter("repassword");
        String gender=request.getParameter("gender");
        String idNum=request.getParameter("id_num");
        Date dob=null;
        try{
            dob=new Date(
                    new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob")).getTime()
            );
        }
        catch(ParseException pe){
            System.out.println("date conversion error");
        }
        catch(NullPointerException e){
            
        }
        String u_type=request.getParameter("u_type");
        
        String address=request.getParameter("address");
        
        UserData ud=new UserData(fnm,lnm,p_no,email,passWd,gender.charAt(0),dob,u_type.charAt(0),address,idNum);
        
//        Configuration con=new Configuration().configure("/MyHibernate/hibernate.cfg.xml").addAnnotatedClass(UserData.class);
//         ServiceRegistry s_reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//        
//         
//         Session sess=con.buildSessionFactory(s_reg).openSession();
        
        Session sess=null;
        Transaction tx=null;
        String redirection_string=null;
        try{
            sess=HiberneteUtil.getSessionFactory().openSession();
            tx=sess.beginTransaction();
            sess.save(ud);
            tx.commit();
            redirection_string="/InvManager/";
        }
        catch(HibernateException e)
        {
            if (tx != null)
            {
                tx.rollback();
            }
            System.out.println("Error : " + e);
            redirection_string="/InvManager/ErrorPage.jsp?msg=hibernete transaction error"+"\nerror: "+e;
        }
        catch(NullPointerException npe){
            redirection_string="/InvManager/ErrorPage.jsp?msg=transaction error"+"\nerror: "+npe;
        }
        catch(ExceptionInInitializerError ex){
            redirection_string="/InvManager/ErrorPage.jsp?msg=server_is_down";
        }
        catch(Exception e){
            redirection_string="/InvManager/ErrorPage.jsp?msg=server_is_down"+"error: "+e;
        }
        finally
        {
            //if(sess!=null)
                //sess.close();
        }
        //try (PrintWriter out = response.getWriter()) {
            /*TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet UserRegistrationServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet UserRegistrationServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        //}
        
        response.sendRedirect(redirection_string);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
