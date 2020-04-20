package org.apache.jsp.Registration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<body>\n");
      out.write("            <form action = \"/InvManager/UserRegistrationServlet\" method=\"POST\">\n");
      out.write("                    <table border = \"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan = \"3\"> <font color=\"red\">* Required fields </font></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> <font color=\"red\">*</font> First Name : </td>\n");
      out.write("                        <td colspan = \"2\">\n");
      out.write("                            <input type = \"text\" name = \"first_name\" id=\"first_name\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> <font color=\"red\">*</font> Last Name : </td>\n");
      out.write("                        <td colspan = \"2\">\n");
      out.write("                            <input type = \"text\" name = \"last_name\" id=\"last_name\" >\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                     <tr>\n");
      out.write("                        <td> <font color=\"red\">*</font> Phone no : </td>\n");
      out.write("                        <td colspan = \"2\">\n");
      out.write("                            <input type = \"text\" name = \"ph_no\" >\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td> <font color=\"red\">*</font> Email id : </td>\n");
      out.write("                        <td colspan = \"2\">\n");
      out.write("                            <input type = \"email\" name = \"email\" >\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\t\t\t<td> <font color=\"red\">*</font> New Password : </td>\n");
      out.write("                        <td colspan = \"2\">\n");
      out.write("                            <input type = \"password\" name = \"password\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\t\t\t<td> <font color=\"red\">*</font> Reenter new Password : </td>\n");
      out.write("                        <td colspan = \"2\">\n");
      out.write("                             <input type = \"password\" name = \"repassword\" >\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <font color=\"red\">*</font>Gender\n");
      out.write("                        </td>\n");
      out.write("                        <td colspan = \"2\">\n");
      out.write("                            Male <input type=\"radio\" name=\"gender\" value=\"male\" checked>\n");
      out.write("                                                        Female<input type=\"radio\" name=\"gender\" value=\"female\"> \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <font color=\"red\">*</font> Birth date : \n");
      out.write("                        </td>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <input type=\"date\" name=\"dob\" id=\"dob\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                             User type : \n");
      out.write("                        </td>\n");
      out.write("                        <td colspan = \"2\">\n");
      out.write("                            <input type =\"radio\" name = 'u_type' value = 'buyer'> Buyer\n");
      out.write("                            <input type =\"radio\" name = 'u_type' value = 'transport'> Transport staff\n");
      out.write("                            <input type =\"radio\" name = 'u_type' value = 'collection'> Collection manager\n");
      out.write("                            <input type =\"radio\" name = 'u_type' value = 's_admin'> Storage administrator\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <font color=\"red\">*</font> Identity Number : \n");
      out.write("                        </td>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <input type=\"text\" name=\"id_num\" id=\"id_num\" >\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan = \"3\">\n");
      out.write("                            Addresss : \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan = \"3\">\n");
      out.write("                            <textarea name =\"address\" rows = \"5\" cols = \"100\">\n");
      out.write("                            </textarea>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input type =\"submit\" name =\"register\" value =\"Register\">\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type =\"reset\" name =\"reset\" value =\"Reset\">\n");
      out.write("                        </td>\n");
      out.write("                            \n");
      out.write("                        <td>\n");
      out.write("                            <a href =\"index.html\">Log in</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\t\t</table>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
