package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Validators.PasswordValidator;
import javax.servlet.*;

public final class LogIn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.print("Connected " +request.getParameter("user_email") );
      out.write("\r\n");
      out.write("        ");

            String user_email=request.getParameter("user_email");
            String user_passwd=request.getParameter("user_passwd");
            //PasswordValidator pv =new PasswordValidator("jdbc:mysql://127.0.0.1:3306/ce4_13","root","");
            PasswordValidator pv =new PasswordValidator();
            try{
                if(pv.isValid(user_email,user_passwd)){
                    HttpSession sess=request.getSession();
                    sess.setAttribute("user_email", user_email);
                    sess.setAttribute("user_type", pv.temp);
                    switch(pv.temp){
                        case("b"):
                            response.sendRedirect("/InvManager/Buyer/BuyerHome");
                            break;
                        case("c"):
                            response.sendRedirect("/InvManager/CollectionManager/CollectionManagerHome");
                            break;
                        case("s"):
                            response.sendRedirect("/InvManager/StorageAdmin/AdminHome");
                            break;
                        case("t"):
                            response.sendRedirect("/InvManager/Transport/TransportHome");
                            break;
                        default:
                            response.sendRedirect("/InvManager");
                }
                }
                else{
                    response.sendRedirect("/InvManager/");
                }
            }
            catch(Exception e){
                response.sendRedirect("/InvManager/");
            }
                
        
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
