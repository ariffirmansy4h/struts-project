package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sj_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sb_head_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sj_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sb_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sj_head_nobody.release();
    _jspx_tagPool_sb_head_nobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    ");
      if (_jspx_meth_sj_head_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_sb_head_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    WELCOME\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_sj_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sj:head
    com.jgeppert.struts2.jquery.views.jsp.ui.HeadTag _jspx_th_sj_head_0 = (com.jgeppert.struts2.jquery.views.jsp.ui.HeadTag) _jspx_tagPool_sj_head_nobody.get(com.jgeppert.struts2.jquery.views.jsp.ui.HeadTag.class);
    _jspx_th_sj_head_0.setPageContext(_jspx_page_context);
    _jspx_th_sj_head_0.setParent(null);
    int _jspx_eval_sj_head_0 = _jspx_th_sj_head_0.doStartTag();
    if (_jspx_th_sj_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sj_head_nobody.reuse(_jspx_th_sj_head_0);
      return true;
    }
    _jspx_tagPool_sj_head_nobody.reuse(_jspx_th_sj_head_0);
    return false;
  }

  private boolean _jspx_meth_sb_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sb:head
    com.jgeppert.struts2.bootstrap.views.jsp.ui.HeadTag _jspx_th_sb_head_0 = (com.jgeppert.struts2.bootstrap.views.jsp.ui.HeadTag) _jspx_tagPool_sb_head_nobody.get(com.jgeppert.struts2.bootstrap.views.jsp.ui.HeadTag.class);
    _jspx_th_sb_head_0.setPageContext(_jspx_page_context);
    _jspx_th_sb_head_0.setParent(null);
    int _jspx_eval_sb_head_0 = _jspx_th_sb_head_0.doStartTag();
    if (_jspx_th_sb_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sb_head_nobody.reuse(_jspx_th_sb_head_0);
      return true;
    }
    _jspx_tagPool_sb_head_nobody.reuse(_jspx_th_sb_head_0);
    return false;
  }
}
