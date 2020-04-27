/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import MyHibernate.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "DatabasePopulater", urlPatterns = {"/DatabasePopulater"})
public class DatabasePopulater extends HttpServlet {

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
        
        
        Session sess;
        Transaction tx=null;
        String redirection_string=null;
        
        try{
            sess=HibernateUtil.getSessionFactory().openSession();
            tx=sess.beginTransaction();
            Fruits f=new Fruits("Mangoe","Yellow",15);
            sess.save(f);
            
            Fruits f2=new Fruits("Apple","Red",25);
            Fruits f3=new Fruits("Kiwi","green",5);
            Fruits f4=new Fruits("Banana","Yellow",5);
            sess.save(f2);
            sess.save(f3);
            sess.save(f4);
            
            
            
            WareHouse w1=new WareHouse(100000,"Address warehouse1");
            WareHouse w2=new WareHouse(50000,"Address warehouse2");
            WareHouse w3=new WareHouse(200000,"Address warehouse3");
            WareHouse w4=new WareHouse(300000,"Address warehouse4");
            
            sess.save(w1);
            sess.save(w2);
            sess.save(w3);
            sess.save(w4);
            
            
            Inventory invs[]={new Inventory(1,-1,0,1),new Inventory(1,-1,0,2),new Inventory(1,-1,0,3),new Inventory(1,-1,0,4),
                new Inventory(2,-1,0,1),new Inventory(2,-1,0,2),new Inventory(2,-1,0,3),new Inventory(2,-1,0,4),
                new Inventory(3,-1,0,1),new Inventory(3,-1,0,2),new Inventory(3,-1,0,3),new Inventory(3,-1,0,4),
                new Inventory(4,-1,0,1),new Inventory(4,-1,0,2),new Inventory(4,-1,0,3),new Inventory(4,-1,0,4),
            };
            for(int i=14;i<16;i++){
                sess.save(invs[i]);
            }
            
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
        
        
        
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DatabasePopulater</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>The project is ready to use <a href='/InvManager/'>Login</a></h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
