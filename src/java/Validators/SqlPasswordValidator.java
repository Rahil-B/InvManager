/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validators;
import java.sql.*;
/**
 *
 * @author RAHIL
 */
public class SqlPasswordValidator {
    String server_url;
    String db_usernm;
    String db_passwd;
    public String temp;
    SqlPasswordValidator(){
        
    }
    
    public SqlPasswordValidator(String url,String unm,String passwd){
        server_url=url;
        db_usernm=unm;
        db_passwd=passwd;
    }
    
    public boolean isValid(String user_email,String user_passwd){
        try{
            
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection conn=DriverManager.getConnection(this.server_url,this.db_usernm,this.db_passwd);
                Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                System.out.println("select * from Users where user_email=\""+user_email+"\";"+user_passwd);
                ResultSet rs=stmt.executeQuery("select * from Users where user_email=\""+user_email+"\";");
                
                rs.next();
                String reg_user_passwd=rs.getNString("user_password");
                this.temp=rs.getNString("user_type");
                return user_passwd.compareTo(reg_user_passwd)==0;
            /*
            while(rs.next()){
            /*if(rs.getInt(1)==2){
            rs.updateInt(3,-1);
            }*/
            /*
            out.print(rs.getInt(1)+" ");
            out.print(rs.getString(2)+" ");
            out.println(rs.getDouble(3)+"<br>");
            }
             */
        }catch(SQLException e){
            System.out.println(e);
            
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        return(false);
    }
}