/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2013-08-05 01:36:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.sysadm.extend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class editGiftUI_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:contains", org.apache.taglibs.standard.functions.Functions.class, "contains", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/doqian.tld", Long.valueOf(1375665880531L));
    _jspx_dependants.put("/includes/page_inc.jsp", Long.valueOf(1375665880859L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <title>会员列表</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sysadm/css/base.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("<script language=\"javascript\" src=\"/js/xheditor/xheditor-1.1.14-zh-cn.min.js\"></script>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"/js/My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/lhgdialog/lhgcore.lhgdialog.min.js?skin=igreen&self=true\"></script>\r\n");
      out.write("<script language=\"javascript\" src=\"/js/ajaxfileupload.js\"></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("$(function(){ \r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#credit\").keyup(function() {\r\n");
      out.write("\t\tvar tmptxt = $(this).val();\r\n");
      out.write("\t\t\t$(this).val(tmptxt.replace(/[^\\d]/g, ''));\r\n");
      out.write("\r\n");
      out.write("\t\t}).bind(\"paste\", function() {\r\n");
      out.write("\t\tvar tmptxt = $(this).val();\r\n");
      out.write("\t\t$(this).val(tmptxt.replace( /[^\\d]/g, ''));\r\n");
      out.write("\t}).css(\"ime-mode\", \"disabled\");\r\n");
      out.write("\t$(\"#amount\").keyup(function() {\r\n");
      out.write("\t\tvar tmptxt = $(this).val();\r\n");
      out.write("\t\t\t$(this).val(tmptxt.replace(/[^\\d]/g, ''));\r\n");
      out.write("\r\n");
      out.write("\t\t}).bind(\"paste\", function() {\r\n");
      out.write("\t\tvar tmptxt = $(this).val();\r\n");
      out.write("\t\t$(this).val(tmptxt.replace( /[^\\d]/g, ''));\r\n");
      out.write("\t}).css(\"ime-mode\", \"disabled\");\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\tvar gprotime = $(\"#fromtime\").val();\r\n");
      out.write("\tvar gprotime2 = $(\"#totime\").val();\r\n");
      out.write("\tif(gprotime != \"\"){\r\n");
      out.write("\t\tvar gprotime = parseInt(gprotime)\r\n");
      out.write("\t\tvar newTime = new Date(gprotime); //就得到普通的时间了\r\n");
      out.write("\t\tvar momth = newTime.getMonth() + 1;\r\n");
      out.write("\t\t$(\"#fromtime\").val(\r\n");
      out.write("\t\t\t\tnewTime.getFullYear() + \"-\" + momth + \"-\" + newTime.getDate()\r\n");
      out.write("\t\t\t\t\t\t);\r\n");
      out.write("\t}\r\n");
      out.write("\tif(gprotime2 != \"\"){\r\n");
      out.write("\t\tvar gprotime2 = parseInt(gprotime2)\r\n");
      out.write("\t\tvar newTime2 = new Date(gprotime2); //就得到普通的时间了\r\n");
      out.write("\t\tvar momth = newTime2.getMonth() + 1;\r\n");
      out.write("\t\t$(\"#totime\").val(\r\n");
      out.write("\t\t\t\tnewTime2.getFullYear() + \"-\" + momth + \"-\" + newTime2.getDate()\r\n");
      out.write("\t\t\t\t\t\t);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("function checkForm(){\r\n");
      out.write("\tvar typeid = $(\"#typeid\").val();\r\n");
      out.write("\tvar title = $(\"#title\").val();\r\n");
      out.write("\tvar credit = $(\"#credit\").val();\r\n");
      out.write("\tvar amount = $(\"#amount\").val();\r\n");
      out.write("\tvar username = $(\"#username\").val();\r\n");
      out.write("\tvar fromtime = $(\"#fromtime\").val();\r\n");
      out.write("\tvar totime = $(\"#totime\").val();\r\n");
      out.write("\tif(typeid == 0){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"礼品分类必选！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(title == \"\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"标题必填！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(credit  == \"\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"单价必填！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(amount  == \"\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"名额 必填！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(fromtime  == \"\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"开始时间必填！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(totime  == \"\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"结束时间必填！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar formated_fromtime = fromtime.replace(\"-\", \"/\");\r\n");
      out.write("\tvar formated_fromtime = formated_fromtime.replace(\"-\", \"/\");\r\n");
      out.write("\tvar formated_totime = totime.replace(\"-\", \"/\");\r\n");
      out.write("\tvar formated_totime = formated_totime.replace(\"-\", \"/\");\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tvar oldTime = (new Date(formated_totime)).getTime(); //得到毫秒数 \r\n");
      out.write("\tvar oldTime2 = (new Date(formated_fromtime)).getTime(); //得到毫秒数 \r\n");
      out.write("\t\r\n");
      out.write("\tif(oldTime2 > oldTime){\r\n");
      out.write("\t\talert(\"结束时间必需大于开始时间！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"#fromtime\").val(oldTime2);\r\n");
      out.write("\t$(\"#totime\").val(oldTime);\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function advList(item){\r\n");
      out.write("\t//var api = $.dialog({id:'L1360',width: '900px', height: 350}); \r\n");
      out.write("\t \r\n");
      out.write("\t$.dialog({lock: true,content: 'url:/sysadm/type/typeEdit.do?item='+item,id:'L1360',width: '1100px', height: 400,title:'礼品分类',min: false });\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body leftmargin=\"8\" topmargin=\"8\" background='/sysadm/images/allbg.gif'>\r\n");
      out.write("\r\n");
      out.write("<!--  快速转换位置按钮  -->\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write(" <td height=\"26\" background=\"/sysadm/images/newlinebg3.gif\">\r\n");
      out.write("  <table width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td>\r\n");
      out.write("   <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/gift/toEditGiftUI.do';\" value='添加礼品' />\r\n");
      out.write("    <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/gift/giftList.do';\" value='礼品列表' />\r\n");
      out.write("    <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/gift/giftList.do';\" value='订单列表' />\r\n");
      out.write("    <input type='button' class=\"coolbg np\" onClick=\"advList('gift');\" value='礼品分类' />\r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<!--  内容列表   -->\r\n");
      out.write("<form name=\"form\" action=\"/sysadm/gift/editGift.do\" method=\"post\" onsubmit=\"return checkForm()\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"itemid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.itemid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"itemid\"/>\r\n");
      out.write("<table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\" >\r\n");
      out.write("  <tr bgcolor=\"#EEF4EA\">\r\n");
      out.write("    <td colspan=\"2\" background=\"/sysadm/images/wbg.gif\" class='title'><span>添加礼品</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"30%\" bgcolor=\"#FFFFFF\"><font  color=\"red\" >*</font><strong>礼品分类</strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("    \t<select name=\"typeid\" id=\"typeid\">\r\n");
      out.write("    \t\t<option value=\"0\">请选择分类</option>\r\n");
      out.write("    \t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t</select>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"30%\" bgcolor=\"#FFFFFF\"><font color=\"red\" >*</font><strong>礼品标题 </strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("    \t<input name=\"title\" id=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("    \t<select  name=\"level\" id=\"level\">\r\n");
      out.write("   \t\t\t<option value=\"0\">级别</option>   \t\t\t\r\n");
      out.write("   \t\t\t<option value=\"1\"   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.level=='1'?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  >1 级 </option>\r\n");
      out.write("   \t\t\t<option value=\"2\"   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.level=='2'?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  >2 级</option>\r\n");
      out.write("   \t\t\t<option value=\"3\"   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.level=='3'?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  >3 级</option>\r\n");
      out.write("   \t\t\t<option value=\"4\"   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.level=='4'?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  >4 级</option>\r\n");
      out.write("   \t\t\t<option value=\"5\"   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.level=='5'?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  >5 级</option>\r\n");
      out.write("   \t\t\t<option value=\"6\"   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.level=='6'?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  >6 级</option>\r\n");
      out.write("   \t\t\t<option value=\"7\"   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.level=='7'?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  >7 级</option>\r\n");
      out.write("   \t\t\t<option value=\"8\"   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.level=='8'?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  >8 级</option>\r\n");
      out.write("   \t\t\t<option value=\"9\"   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.level=='9'?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  >9 级</option>\r\n");
      out.write("   \t\t</select>   \r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"30%\" bgcolor=\"#FFFFFF\"><strong>标题图片</strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\"><input name=\"pic\" id=\"pic\" type=\"file\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"30%\" bgcolor=\"#FFFFFF\"><font  color=\"red\" >*</font><strong>单价</strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("    \t<input name=\"credit\" id=\"credit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.credit }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"10\"/>积分 \r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"30%\" bgcolor=\"#FFFFFF\"><font  color=\"red\" >*</font><strong>名额</strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("    \t<input name=\"amount\" id=\"amount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.amount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"10\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"30%\" bgcolor=\"#FFFFFF\"><strong>会员组</strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   \r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("   <td width=\"30%\" bgcolor=\"#FFFFFF\"><font color=\"red\" >*</font><strong>有效期 </strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <input name=\"fromtime\" id=\"fromtime\" class=\"Wdate\" type=\"text\" onClick=\"WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.fromtime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\"/>至\r\n");
      out.write("    <input name=\"totime\" id=\"totime\" class=\"Wdate\" type=\"text\" onClick=\"WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.totime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\"/>\r\n");
      out.write("   \r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("   <td width=\"30%\" bgcolor=\"#FFFFFF\"><strong>详细说明</strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\"><textarea name=\"content\" class=\"xheditor-mfull\" rows=\"30\" cols=\"130\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</textarea></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("     <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("   <td bgcolor=\"#FFFFFF\" colspan=\"2\" align=\"center\">\r\n");
      out.write("   \t<input type=\"submit\" value=\"确定\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"返回\" onclick=\"history.go(-1)\"/>\r\n");
      out.write("   </td>\r\n");
      out.write("   \r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("</form>\r\n");
      out.write("<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align=\"center\" style=\"margin-top:8px\">\r\n");
      out.write("  <tr bgcolor='#EEF4EA'>\r\n");
      out.write("    <td background='/sysadm/images/wbg.gif' align='center'>\r\n");
      out.write("      \r\n");
      out.write("\t<font color=\"red\">*</font>号为必填项目\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/sysadm/extend/editGiftUI.jsp(166,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/sysadm/extend/editGiftUI.jsp(166,6) '${typeList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${typeList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/sysadm/extend/editGiftUI.jsp(166,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("type");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    \t\t\t");
          if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("    \t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("    \t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("    \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/sysadm/extend/editGiftUI.jsp(168,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b2bGift.typeid == type.typeid}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t\t\t\t<option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.typeid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\" selected=\"selected\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.typename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</option>\r\n");
        out.write("    \t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t\t\t\t<option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.typeid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.typename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</option>\r\n");
        out.write("    \t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/sysadm/extend/editGiftUI.jsp(218,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/sysadm/extend/editGiftUI.jsp(218,5) '${memberGroupList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${memberGroupList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/sysadm/extend/editGiftUI.jsp(218,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("memberGroup");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t    \t<label><input name=\"groupids\" id=\"groupids\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberGroup.groupid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"checkbox\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:contains(b2bGift.groupid,memberGroup.groupid) ? \"checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
          out.write('/');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberGroup.groupname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label>\r\n");
          out.write("    \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}