package org.apache.jsp.templates.CollectionManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CollectionManagerHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \t<tbl1>\n");
      out.write("        <table border='1'  width=\"100%\"  align=\"center\" style=\"height:200px\">\n");
      out.write("             <tr><td><a href=\"supplyStaff_home.html\">Home</a></td>\n");
      out.write("             <td colspan=\"5\" rowspan=\"10\">\n");
      out.write("             \t\tTable for upcoming supplies //which are approved\n");
      out.write("             \t\t<table border=\"1\" width=\"100%\" >\n");
      out.write("             \t\t\t<tr>\n");
      out.write("             \t\t\t\t<th>Supply no.</th>\n");
      out.write("             \t\t\t\t<th>Fruit</th>\n");
      out.write("             \t\t\t\t<th>Quantity(Kg.)</th>\n");
      out.write("             \t\t\t\t<th>Source</th>\n");
      out.write("             \t\t\t\t<th>Request Date</th>\n");
      out.write("             \t\t\t\t<th>Action</th>\n");
      out.write("             \t\t\t</tr>\n");
      out.write("             \t\t\t<tr>\n");
      out.write("             \t\t\t\t<td>S2001240001</td>\n");
      out.write("             \t\t\t\t<td>Mangoe</td>\n");
      out.write("             \t\t\t\t<td>30</td>\n");
      out.write("             \t\t\t\t<td>F0100100001</td>\n");
      out.write("             \t\t\t\t<td>24/01/2020</td>\n");
      out.write("             \t\t\t\t<td><input type=\"button\" name=\"gen_rec\" value=\"Generate receipt\"/></td>\n");
      out.write("             \t\t\t</tr>\n");
      out.write("             \t\t</table>\n");
      out.write("             </td></tr>\n");
      out.write("             <tr><td><a href=\"/InvManager/CollectionManager/NewSupply\">New Supply</a></td></tr>             \n");
      out.write("             <tr><td><a href=\"/InvManager/CollectionManager/Supplies\">My Supplies</a></td></tr>\n");
      out.write("             <tr><td><a href=\"/InvManager/CollectionManager/History\">View Supply History</a></td></tr>\n");
      out.write("             <tr><td><a href=\"/InvManager/Login/LogOut.jsp\">Log out</a></td></tr>\n");
      out.write("        </table>\n");
      out.write("        </tbl1> \n");
      out.write("    </body>\n");
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
