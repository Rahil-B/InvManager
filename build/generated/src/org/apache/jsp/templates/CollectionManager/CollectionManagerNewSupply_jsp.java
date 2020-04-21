package org.apache.jsp.templates.CollectionManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CollectionManagerNewSupply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>New Supply</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border='1' width=\"100%\"  align=\"center\" style=\"height:200px\" >\n");
      out.write("             <tr>\n");
      out.write("\t\t         <td><a href=\"/InvManager/CollectionManager/CollectionManagerHome\">Home</a></td>\n");
      out.write("\t\t         <td colspan=\"5\" rowspan=\"10\">\n");
      out.write("\t\t         \n");
      out.write("             \t\tGenerate new supply request\n");
      out.write("             \t\t<form action = \"AddSupply\" method=\"POST\">\n");
      out.write("                    <table border = \"1\" width=\"100%\">\n");
      out.write("            \t\t\t<tr>\t\n");
      out.write("            \t\t\t\t\t\t<th colspan='3'>New Supply</th>\n");
      out.write("            \t\t\t</tr>        \n");
      out.write("            \t\t\t<tr>\n");
      out.write("            \t\t\t\t\t<td colspan='1'>Fruit:</td>\n");
      out.write("            \t\t\t\t\t<td>\n");
      out.write("\t\t        \t\t\t\t\t<select name=\"fruit_type\">\n");
      out.write("\t\t        \t\t\t\t\t\t<!--value=fruit id-->\n");
      out.write("\t\t\t\t                        <option value=\"1\" > Apple </option>\n");
      out.write("\t\t\t\t                        <option value=\"2\" > Mangoe </option>\n");
      out.write("\t\t\t\t                        <option value=\"3\" > Kiwi </option>\n");
      out.write("\t\t\t\t                        <option value=\"4\" > Orange </option>\n");
      out.write("\t\t\t\t                        <option value=\"5\" > Grapes </option>\n");
      out.write("\t\t                        \t</select>\n");
      out.write("            \t\t\t\t\t</td>\n");
      out.write("            \t\t\t</tr>\n");
      out.write("            \t\t\t<tr>\n");
      out.write("            \t\t\t\t\t<td colspan='1'>Quantity:</td>\n");
      out.write("            \t\t\t\t\t<td>\n");
      out.write("\t\t        \t\t\t\t\t<select name=\"qty\">\n");
      out.write("\t\t\t\t                        <option value=\"1\" > 01 </option>\n");
      out.write("\t\t\t\t                        <option value=\"2\" > 02 </option>\n");
      out.write("\t\t\t\t                        <option value=\"3\" > 03 </option>\n");
      out.write("\t\t\t\t                        <option value=\"4\" > 04 </option>\n");
      out.write("\t\t\t\t                        <option value=\"5\" > 05 </option>\n");
      out.write("\t\t                        \t</select>\n");
      out.write("                            \t</td>\n");
      out.write("            \t\t\t</tr>\n");
      out.write("            \t\t\t<tr>\n");
      out.write("            \t\t\t\t<td colspan='1'>Source</td>\n");
      out.write("            \t\t\t\t<td>\n");
      out.write("\t\t        \t\t\t\t\t<select name=\"farm_type\">\n");
      out.write("\t\t\t\t                        <option value=\"1\" > F </option>\n");
      out.write("\t\t\t\t                        <option value=\"2\" > 02 </option>\n");
      out.write("\t\t\t\t                        <option value=\"3\" > 03 </option>\n");
      out.write("\t\t\t\t                        <option value=\"4\" > 04 </option>\n");
      out.write("\t\t\t\t                        <option value=\"5\" > 05 </option>\n");
      out.write("\t\t                        \t</select>\n");
      out.write("            \t\t\t\t\t\t<input type='text' name='farm_id' required >\n");
      out.write("            \t\t\t\t</td> \n");
      out.write("            \t\t\t</tr >\n");
      out.write("            \t\t\t<tr>\n");
      out.write("            \t\t\t\t<td colspan='1'>Supply date</td>\n");
      out.write("            \t\t\t\t<td><input type='date' name='supply_date' /></td>\n");
      out.write("            \t\t\t</tr>\n");
      out.write("            \t\t\t<tr>\n");
      out.write("            \t\t\t\t<td>\t\n");
      out.write("            \t\t\t\t\t<input type='submit' value='Submit'>\n");
      out.write("            \t\t\t\t</td>\n");
      out.write("            \t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("             \t\t\n");
      out.write("             \t\t\n");
      out.write("             </td></tr>\n");
      out.write("             <tr><td><a href=\"/InvManager/CollectionManager/NewSupply\">New Supply</a></td></tr>             \n");
      out.write("             <tr><td><a href=\"/InvManager/CollectionManager/Supplies\">My Supplies</a></td></tr>\n");
      out.write("             <tr><td><a href=\"/InvManager/CollectionManager/History\">View Supply History</a></td></tr>\n");
      out.write("             <tr><td><a href=\"/InvManager/Login/LogOut.jsp\">Log out</a></td></tr>\n");
      out.write("\n");
      out.write("        </table> \n");
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
