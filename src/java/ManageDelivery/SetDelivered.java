/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageDelivery;

import Models.Inventory;
import Models.Supplies;
import MyHibernate.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "SetDelivered", urlPatterns = {"/ManageDelivery/SetDelivered"})
public class SetDelivered extends HttpServlet {

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
        
        
        try{
            sess=HibernateUtil.getSessionFactory().openSession();
            tx=sess.beginTransaction();
            int supId=Integer.parseInt(request.getParameter("supplyId"));
            int desId=Integer.parseInt(request.getParameter("desId"))*-10;//-ve means delivered
            Supplies sup = (Supplies)sess.get(Supplies.class, supId);
            sup.setDesId(desId);
            sess.update(sup);
            List<Inventory> inv_list =(List<Inventory>) sess.createCriteria(Inventory.class).add(Restrictions.eq("wareHouseId", Integer.parseInt(request.getParameter("desId")) )).add(Restrictions.eq("fruitId", sup.getFruitId())).list();
            Inventory inv1=inv_list.get(0);
            int qty=inv1.getQuantityAvail();
            inv1.setQuantityAvail(qty-sup.getQuantity());
            
            sess.update(inv1);
            tx.commit();
            
            
            redirection_string="/InvManager/Transport/TransportHome   ";
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
