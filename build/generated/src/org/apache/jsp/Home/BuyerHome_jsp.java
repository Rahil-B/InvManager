package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BuyerHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border='1' width=\"100%\">\n");
      out.write("             <tr><td><a href=\"buyer_home.html\">Home</a></td>\n");
      out.write("             <td colspan=\"5\" rowspan=\"10\">\n");
      out.write("             \t\tTable of available fruits.\n");
      out.write("             \t\t<table border=\"1\" width=\"100%\">\n");
      out.write("             \t\t\t<tr>\n");
      out.write("             \t\t\t\t<th>Fruit</th>\n");
      out.write("             \t\t\t\t<th>Quantity available(Kg)</th>\n");
      out.write("             \t\t\t\t<th>Required quantity(Kg)</th>\n");
      out.write("             \t\t\t\t<th></th>\n");
      out.write("             \t\t\t</tr>\n");
      out.write("             \t\t\t<tr>\n");
      out.write("             \t\t\t\t<td>Apple</td>\n");
      out.write("             \t\t\t\t<td>30</td>\n");
      out.write("             \t\t\t\t<th><select name=\"o_qty\">\n");
      out.write("                                <option value=\"1\" > 01 </option>\n");
      out.write("                                <option value=\"2\" > 02 </option>\n");
      out.write("                                <option value=\"3\" > 03 </option>\n");
      out.write("                                <option value=\"4\" > 04 </option>\n");
      out.write("                                <option value=\"5\" > 05 </option>\n");
      out.write("                            </select></th>\n");
      out.write("                            <th><button type=\"submit\" style=\"background-color:yellow; border-color:black; color:black\">Add to cart</button></th>\n");
      out.write("             \t\t\t</tr>\n");
      out.write("             \t\t\t<tr>\n");
      out.write("             \t\t\t\t<td>Banana</td>\n");
      out.write("             \t\t\t\t<td>50</td>\n");
      out.write("             \t\t\t\t<th><select name=\"o_qty\">\n");
      out.write("                                <option value=\"1\" > 01 </option>\n");
      out.write("                                <option value=\"2\" > 02 </option>\n");
      out.write("                                <option value=\"3\" > 03 </option>\n");
      out.write("                                <option value=\"4\" > 04 </option>\n");
      out.write("                                <option value=\"5\" > 05 </option>\n");
      out.write("                            </select></th>\n");
      out.write("                            <th><button type=\"submit\" style=\"background-color:yellow; border-color:black; color:black\">Add to cart</button></th>\n");
      out.write("\n");
      out.write("             \t\t\t</tr>\n");
      out.write("             \t\t</table>\n");
      out.write("             \t\t\n");
      out.write("             \t\t\n");
      out.write("             \t\t\n");
      out.write("             </td></tr>\n");
      out.write("             <tr><td><a href=\"buyer_orders.html\">My Orders</a></td></tr>\n");
      out.write("             <tr><td><a href=\"buyer_cart.html\">My Cart</a></td></tr>\n");
      out.write("             <tr><td><a href=\"buyer_schedule.html\">Manage Schedule</a></td></tr>\n");
      out.write("             <tr><td><a href=\"buyer_add_schedule.html\">Add Schedule</a></td></tr>\n");
      out.write("             <tr><td><a href=\"log_out.php\">Log out</a></td></tr>\n");
      out.write("\n");
      out.write("        </table> \n");
      out.write("    </body>\n");
      out.write("</html>");
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
