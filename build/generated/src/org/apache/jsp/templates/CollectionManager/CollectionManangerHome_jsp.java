package org.apache.jsp.templates.CollectionManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CollectionManangerHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write(" \t <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write(" \t <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write(" \t <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<title>Home</title>\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\tbody{\r\n");
      out.write("\t\t\t\t\t\tmin-height: 100vh;\r\n");
      out.write("\t\t\t\t\t\tbackground-color: #FFDAB9;\r\n");
      out.write("\t\t\t\t background-image: url(\"bg.png\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\ttable {\r\n");
      out.write("\t\t\t\t border-collapse: collapse;\r\n");
      out.write("\t\t\t\t  width: 100%;\r\n");
      out.write("\t\t\t\tbackground-color:#00FA9A;\r\n");
      out.write("\t\t\t\tmargin:0% 1%;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tth, td {\r\n");
      out.write("\t\t\t\t  padding: 5px;\r\n");
      out.write("\t\t\t\t  text-align: left;\r\n");
      out.write("\t\t\t\t  border-bottom: 1px solid #008B8B;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t</style>\r\n");
      out.write("\t\t\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("  \r\n");
      out.write("  \t\t<ul class=\"list-inline\">\r\n");
      out.write("    \t\t\t<li><a href=\"/InvManager/CollectionManager/CollectionManagerHome\" class=\"btn btn-primary\"><h4>Home</h4></a></li>\r\n");
      out.write("    \t\t\t<li><a href=\"/InvManager/CollectionManager/CollectionManagerNewSupply\" class=\"btn btn-primary\"><h4>New Supply</h4></a></li>\r\n");
      out.write("    \t\t\t<li><a href=\"/InvManager/CollectionManager/CollectionManagerSupplies\" class=\"btn btn-primary\"><h4>My Supplies</h4></a></li>\r\n");
      out.write("    \t\t\t<li><a href=\"/InvManager/CollectionManager/CollectionManagerHistory\" class=\"btn btn-primary\"><h4>View Supply History</h4></a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("    \t\t\t<li><a href=\"/InvManager/Login/LogOut.jsp\" class=\"btn btn-primary\"><h4>Log out</h4></a></li>\r\n");
      out.write("  \t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <br>\r\n");
      out.write("    \t<tbl1>\r\n");
      out.write("        <table width=\"100%\"  align=\"center\" style=\"height:200px\">\r\n");
      out.write("             <td colspan=\"5\" rowspan=\"10\">\r\n");
      out.write("                 <h3>Table for upcoming supplies //which are approved</h3><br>\r\n");
      out.write("             \t\t<table width=\"100%\" >\r\n");
      out.write("             \t\t\t<tr>\r\n");
      out.write("             \t\t\t\t<th>Supply no.</th>\r\n");
      out.write("             \t\t\t\t<th>Fruit</th>\r\n");
      out.write("             \t\t\t\t<th>Quantity(Kg.)</th>\r\n");
      out.write("             \t\t\t\t<th>Source</th>\r\n");
      out.write("             \t\t\t\t<th>Request Date</th>\r\n");
      out.write("             \t\t\t\t<th>Action</th>\r\n");
      out.write("             \t\t\t</tr>\r\n");
      out.write("             \t\t\t<tr>\r\n");
      out.write("             \t\t\t\t<td>S2001240001</td>\r\n");
      out.write("             \t\t\t\t<td>Mango</td>\r\n");
      out.write("             \t\t\t\t<td>30</td>\r\n");
      out.write("             \t\t\t\t<td>F0100100001</td>\r\n");
      out.write("             \t\t\t\t<td>24/01/2020</td>\r\n");
      out.write("             \t\t\t\t<td><input type=\"button\" name=\"gen_rec\" class=\"btn btn-success\" value=\"Generate receipt\"/></td>\r\n");
      out.write("             \t\t\t</tr>\r\n");
      out.write("             \t\t</table>\r\n");
      out.write("             </td></tr>\r\n");
      out.write("             </table>\r\n");
      out.write("        </tbl1> \r\n");
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
