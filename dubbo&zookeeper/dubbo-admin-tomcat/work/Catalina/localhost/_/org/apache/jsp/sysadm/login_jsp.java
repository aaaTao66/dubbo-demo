/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2015-06-16 07:36:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sysadm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>后台登录</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".STYLE3 {\r\n");
      out.write("\tcolor: #528311;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tcolor: #42870a;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" >\r\n");
      out.write("$(document).ready(function(){//防止按下enter键立即提交，如果 按下enter键则是切换下一个表单\r\n");
      out.write(" \t$(\"input\").keypress(function (e){\t \r\n");
      out.write(" \t\tvar keyCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode; \r\n");
      out.write(" \t\tif (keyCode == 13){\r\n");
      out.write("\t\t\tvar i;  \r\n");
      out.write(" \t\t\tfor (i = 0; i < this.form.elements.length; i++) \r\n");
      out.write(" \t\t\tif (this == this.form.elements[i]) break; \t \t\t\t\t \t\t \r\n");
      out.write("\t\t\ti = (i + 1) % this.form.elements.length; \r\n");
      out.write(" \t\t\tthis.form.elements[i].focus(); \r\n");
      out.write(" \t\t\treturn false;\r\n");
      out.write(" \t\t} else \r\n");
      out.write("\t \t\treturn true;\r\n");
      out.write(" \t});\r\n");
      out.write(" \t$('#userName').focus();\r\n");
      out.write("});  \r\n");
      out.write("function imgAgain(obj) {\r\n");
      out.write("\tobj.src = \"../identifyCode.lhp?\" + Math.random();\r\n");
      out.write("}\r\n");
      out.write("function formClear(){\r\n");
      out.write("\t$(\"#userName\").val(\"\");\r\n");
      out.write("\t$(\"#password\").val(\"\");\r\n");
      out.write("\t$(\"#identifyCode\").val(\"\");\t\r\n");
      out.write("}\r\n");
      out.write("function  loginSubmit(){\t\t\r\n");
      out.write("\tvar  username=$.trim($(\"#userName\").val());\r\n");
      out.write("\tvar  password=$.trim($(\"#password\").val());\r\n");
      out.write("\tvar  identifyCode=$.trim($(\"#identifyCode\").val());\t\r\n");
      out.write("\tvar  checkIdentifycode=$.trim($(\"#checkIdentifycode\").val());\t\t\r\n");
      out.write("\tif(username.length==0){\r\n");
      out.write("\t\talert(\"用户名不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(password.length==0){\r\n");
      out.write("\t\talert(\"密码不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(identifyCode.length==0){\r\n");
      out.write("\t\talert(\"验证码不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\t   async : false,\r\n");
      out.write("\t\t   cache : false,\t\r\n");
      out.write("\t\t   type: \"POST\",\r\n");
      out.write("\t\t   url: \"/sysadm/login.do\",\r\n");
      out.write("\t\t   data: $(\"form\").serialize(),\r\n");
      out.write("\t\t   success: function(msg){\r\n");
      out.write("\t\t\t   if(msg=='codefail'){\t\t\r\n");
      out.write("\t\t\t\t   alert(\"验证码不正确！\");\t\t\t\t\t\r\n");
      out.write("\t\t\t   }else if(msg=='passfail'){\t\t    \t \r\n");
      out.write("\t\t\t     alert(\"用户名或者密码不正确！\");\t\t\t\t\t    \t\r\n");
      out.write("\t\t\t   }else if(msg=='success'){\r\n");
      out.write("\t\t\t\t   window.location.href=\"/sysadm/index.jsp\"; \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t   }\t\t\t \r\n");
      out.write("\t\t   }\r\n");
      out.write("\t});\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" >\r\n");
      out.write("//回车的键值为13   \r\n");
      out.write("function document.onkeydown(){   \r\n");
      out.write("     if (event.keyCode == 13) {   \r\n");
      out.write("        //js 监听对应的id   \r\n");
      out.write("        document.getElementById(\"login_1\").click();   \r\n");
      out.write("        return false ;   \r\n");
      out.write("     }   \r\n");
      out.write(" }   \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"/sysadm/login.do\" method=\"post\"  id=\"form1\" >\r\n");
      out.write("\r\n");
      out.write("\t<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\tcellspacing=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=\"#e5f6cf\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"608\" background=\"/sysadm/images/login_03.gif\"><table\r\n");
      out.write("\t\t\t\t\twidth=\"862\" border=\"0\" align=\"center\" cellpadding=\"0\"\r\n");
      out.write("\t\t\t\t\tcellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"266\" background=\"/sysadm/images/login_04.gif\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr    height=\"95\">\r\n");
      out.write("\t\t\t\t\t\t<td height=\"95\">\r\n");
      out.write("\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tcellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"424\" height=\"95\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbackground=\"/sysadm/images/login_06.gif\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"183\" background=\"/sysadm/images/login_07.gif\"><table\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"28%\" height=\"30\"><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"STYLE3\">用户名：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"72%\" height=\"30\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"userName\"  id=\"userName\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"30\"><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"STYLE3\">密码：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"30\"><input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"password\"  id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"30\"><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"STYLE3\">验证码：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"30\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"identifyCode\" id=\"identifyCode\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"height:18px; width:60px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img title=\"看不清?请点击刷新!\"   id=\"imgIdentifyCode\" src=\"/identifyCode.lhp\" onClick=\"imgAgain(this);\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"255\" background=\"/sysadm/images/login_08.gif\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"247\" valign=\"top\"\r\n");
      out.write("\t\t\t\t\t\t\tbackground=\"/sysadm/images/login_09.gif\"><table\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"22%\" height=\"30\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"56%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- ****************************提交按钮*************************************** -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div  style=\"margin-left: 280px\" > <img src=\"/sysadm/images/dl.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"81\" height=\"22\" border=\"0\" usemap=\"#Map\"></div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"22%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td height=\"30\"><table width=\"100%\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"44%\" height=\"20\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"56%\" class=\"STYLE4\">版权所有</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=\"#a2d962\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<map name=\"Map\">\r\n");
      out.write("\t\t<area shape=\"rect\" coords=\"3,3,36,19\" href=\"#\"   onclick=\"loginSubmit()\" id=\"login_1\">\r\n");
      out.write("\t\t<area shape=\"rect\" coords=\"40,3,78,18\" href=\"#\"  onclick=\"formClear()\">\r\n");
      out.write("\t</map>\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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