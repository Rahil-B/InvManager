/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionManager;

import Models.Fruits;
import Models.Supplies;
import MyHibernate.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author RAHIL
 */

@WebServlet(name = "CollectionManagerHome", urlPatterns = {"/CollectionManager/CollectionManagerHome"})
public class CollectionManagerHome extends HttpServlet {

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
        Session sess;
        Transaction tx=null;
        String redirection_string=null;
        HttpSession htSess=request.getSession();
        String managerEmail=(String)htSess.getAttribute("user_email");
        try{
            sess=HibernateUtil.getSessionFactory().openSession();
            tx=sess.beginTransaction();
            List<Supplies> supplies_list =(List<Supplies>) sess.createCriteria(Supplies.class).add(Restrictions.eq("managerEmail", managerEmail)).add(Restrictions.gt("desId", 0)).add(Restrictions.eq("supplyDate", Date.valueOf(LocalDate.now() ) ) ).list();
            List<Fruits> fruit_list=(List<Fruits>) sess.createCriteria(Fruits.class).list();
            request.setAttribute("supplies_list", supplies_list);
            tx.commit();
            HashMap<Integer,String> fruit_names=new HashMap<>();
//functional operation            
            fruit_list.stream().forEach((f) -> {
                fruit_names.put(f.getFruitId(),f.getFruitName());
            });
            request.setAttribute("fruit_names", fruit_names);
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
        
        RequestDispatcher red=request.getRequestDispatcher("/templates/CollectionManager/CollectionManagerHome.jsp");
        red.include(request, response);
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
