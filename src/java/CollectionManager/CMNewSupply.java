/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionManager;

import Models.Fruits;
import Models.Supplies;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MyHibernate.HibernateUtil;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author RAHIL
 */
@WebServlet(name = "CMNewSupply", urlPatterns = {"/CollectionManager/NewSupply"})
public class CMNewSupply extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
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
        
        
        Session sess;
        Transaction tx=null;
        String redirection_string=null;
        
        try{
            sess=HibernateUtil.getSessionFactory().openSession();
            tx=sess.beginTransaction();
            List<Fruits> fruit_list = sess.createCriteria(Fruits.class).list();
            request.setAttribute("fruit_list", fruit_list);
            tx.commit();
            redirection_string=null;//"/InvManager/";
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
        
        
        if(redirection_string!=null)
            response.sendRedirect(redirection_string);
        
        
        RequestDispatcher red=request.getRequestDispatcher("/templates/CollectionManager/CollectionManagerNewSupply.jsp");
        red.include(request, response);
        
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
        int fId=Integer.parseInt(request.getParameter("fruit_id"));
        int qty=Integer.parseInt(request.getParameter("qty"));
        String farmType=request.getParameter("farm_type");
        int farmId=Integer.parseInt(request.getParameter("farm_id"));
        int desId=0;
        HttpSession htSess = request.getSession();
        String managerEmail=(String)htSess.getAttribute("user_email");
        Date supplyDate=HibernateUtil.convertDateToSqlDate(request.getParameter("supply_date"));
        Date requestDate=Date.valueOf(LocalDate.now());
        
        
        Supplies sp=new Supplies(fId,qty,farmId,farmType,desId,supplyDate,requestDate,managerEmail);
        
        Session sess;
        Transaction tx=null;
        String redirection_string=null;
        try{
            sess=HibernateUtil.getSessionFactory().openSession();
            tx=sess.beginTransaction();
            sess.save(sp);
            tx.commit();
            redirection_string="/InvManager/CollectionManager/NewSupply";
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
//        try (PrintWriter out = response.getWriter()) {
//            /*TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet UserRegistrationServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet UserRegistrationServlet at " + request.getContextPath() +" " +redirection_string +"</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
        
        //if(redirection_string!=null)
            //response.sendRedirect(redirection_string);
        //else{
//                RequestDispatcher red=request.getRequestDispatcher("/templates/CollectionManager/CollectionManagerNewSupply.jsp");
//                red.include(request, response);
        //}
        
        response.sendRedirect(redirection_string);
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
