/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validators;

import Models.UserData;
import MyHibernate.HibernateUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RAHIL
 */
public class PasswordValidator {
    public String temp;
    public PasswordValidator(){
        
    }
    
    public boolean isValid(String user_email,String user_passwd){
        try{
            /*
                Class.forName("com.mysql.jdbc.Driver");
                //Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.29.152:1521:XE","ce4_13","ce4_13");
                Connection conn=DriverManager.getConnection(this.server_url,this.db_usernm,this.db_passwd);
                Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                System.out.println("select * from Users where user_email=\""+user_email+"\";"+user_passwd);
                ResultSet rs=stmt.executeQuery("select * from Users where user_email=\""+user_email+"\";");
            
            
                rs.next();
            */
            UserData ud=null;    
            Session sess=null;
            Transaction tx=null;
            String redirection_string=null;
            try{
                sess=HibernateUtil.getSessionFactory().openSession();
                
                ud=(UserData)sess.get(UserData.class,user_email);
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
                if(sess!=null)
                    sess.close();
            }
            if(ud!=null){
                String reg_user_passwd=ud.getPassWord();
                this.temp=""+ud.getUserType();
                return user_passwd.compareTo(reg_user_passwd)==0;
            }
            
            /*
            while(rs.next()){
            /*if(rs.getInt(1)==2){
            rs.updateInt(3,-1);
            }*/
            /*
            out.print(rs.getInt(1)+" ");
            out.print(rs.getString(2)+" ");
            out.println(rs.getDouble(3)+"<br>");
                    
             */
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        return(false);
    }
}