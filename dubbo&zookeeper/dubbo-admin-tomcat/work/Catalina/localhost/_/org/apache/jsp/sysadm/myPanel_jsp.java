/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2013-06-25 12:42:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sysadm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class myPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/doqian.tld", Long.valueOf(1372164090593L));
    _jspx_dependants.put("/includes/page_inc.jsp", Long.valueOf(1372164091078L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <title>left</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/sysadm/css/base.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/sysadm/css/menu.css\" type=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<script language='javascript'>var curopenItem = '1';</script>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"/sysadm/js/menu.js\"></script>\r\n");
      out.write("<base target=\"main\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body target=\"main\">\r\n");
      out.write("<table width='99%' height=\"100%\" border='0' cellspacing='0' cellpadding='0'>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td style='padding-left:3px;padding-top:8px' valign=\"top\">\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <!-- Item 1 Strat -->\r\n");
      out.write("      <dl class='bitem'>\r\n");
      out.write("        <dt onClick='showHide(\"items1_1\")'><b>权限管理</b></dt>\r\n");
      out.write("        <dd style='display:block' class='sitem' id='items1_1'>\r\n");
      out.write("          <ul class='sitemu'>\r\n");
      out.write("          \r\n");
      out.write("            <li>\r\n");
      out.write("              <div class='items'>\r\n");
      out.write("                <div class='fllct'><a href='/sysadm/adminUserList.do' target='mainFrame'>管理员列表</a></div>                \r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("          \r\n");
      out.write("            <li><a href='/sysadm/adminLogList.do' target='mainFrame'>管理员日志</a> </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <div class='items'>\r\n");
      out.write("                <div class='fllct'><a href='/sysadm/roleList.do' target='mainFrame'>角色管理</a></div>              \r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href='/sysadm/agency/agencyList.do' target='mainFrame'>办事处列表</a> </li>\r\n");
      out.write("            <li><a href='/sysadm/suppliers/supplierPagList.do' target='mainFrame'>供货商列表</a> </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("      <!-- Item 1 End -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("\t  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}