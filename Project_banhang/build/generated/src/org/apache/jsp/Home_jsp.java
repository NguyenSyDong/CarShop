package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- Default stylesheets-->\n");
      out.write("        <link href=\"assets2/lib/flexslider/flexslider.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets2/css3/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: #030303\">\n");
      out.write("        <!--begin of menu-->\n");
      out.write("        <nav class=\"navbar navbar-expand-md navbar-dark bg-dark\" style=\"background: url('images/car6.jpg')\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"home\"><img src=\"images/car.png\" style=\"width: 140px; height: 50px \"alt=\"\"/></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarsExampleDefault\">\n");
      out.write("                    <ul class=\"navbar-nav m-auto\" style=\"font-size: 17px\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"home\" style=\"color:white\">Home</a>    \n");
      out.write("                        </li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <form action=\"search\" method=\"post\" class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                        <div class=\"input-group input-group-sm\">\n");
      out.write("                            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txt\" type=\"text\" class=\"form-control\" aria-label=\"Small\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Search...\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-secondary btn-number\">\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"btn btn-success btn-sm ml-3\"  href=\"cart\">\n");
      out.write("                            <i class=\"fa fa-shopping-cart\"></i> Cart\n");
      out.write("                            <span class=\"badge badge-light\">3</span>\n");
      out.write("                        </a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <section class=\"home-section home-fade home-full-height\" id=\"home\" >\n");
      out.write("            <div class=\"hero-slider\">\n");
      out.write("                <ul class=\"slides\">\n");
      out.write("                    <li class=\"bg-dark-30 bg-dark shop-page-header\" style=\"background-image:url(&quot;images/car10.jpg&quot;);\">\n");
      out.write("                        <div class=\"titan-caption\">\n");
      out.write("                            <div class=\"caption-content\">\n");
      out.write("                                <div class=\"font-alt mb-30 titan-title-size-1\">WELCOME</div>\n");
      out.write("                                <div class=\"font-alt mb-30 titan-title-size-4\">VIATO STORE</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"bg-dark-30 bg-dark shop-page-header\" style=\"background-image:url(&quot;images/car11.jpg&quot;);\">\n");
      out.write("                        <div class=\"titan-caption\">\n");
      out.write("                            <div class=\"caption-content\">\n");
      out.write("                                <div class=\"font-alt mb-30 titan-title-size-1\">WELCOME</div>\n");
      out.write("                                <div class=\"font-alt mb-30 titan-title-size-4\"> VIATO STORE</div>\n");
      out.write("                                <div class=\"font-alt mb-40 titan-title-size-1\">YOUR ONLINE LUXURY CAR DESTINATION</div><a class=\"section-scroll btn btn-border-w btn-round\" href=\"http://localhost:8080/Project_banhang/detail?pid=12\">Learn More</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"bg-dark-30 bg-dark shop-page-header\" style=\"background-image:url(&quot;images/car12.jpg&quot;);\">\n");
      out.write("                        <div class=\"titan-caption\">\n");
      out.write("                            <div class=\"caption-content\">\n");
      out.write("                                <div class=\"font-alt mb-30 titan-title-size-1\">WELCOME</div>\n");
      out.write("                                <div class=\"font-alt mb-30 titan-title-size-4\"> VIATO STORE</div>\n");
      out.write("                                <div class=\"font-alt mb-40 titan-title-size-1\">YOUR ONLINE LUXURY CAR DESTINATION</div><a class=\"section-scroll btn btn-border-w btn-round\" href=\"http://localhost:8080/Project_banhang/detail?pid=7\">Learn More</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"bg-dark-30 bg-dark shop-page-header\" style=\"background-image:url(&quot;images/car13.jpg&quot;);\">\n");
      out.write("                        <div class=\"titan-caption\">\n");
      out.write("                            <div class=\"caption-content\">\n");
      out.write("                                <div class=\"font-alt mb-30 titan-title-size-1\">WELCOME</div>\n");
      out.write("                                <div class=\"font-alt mb-30 titan-title-size-4\"> VIATO STORE</div>\n");
      out.write("                                <div class=\"font-alt mb-40 titan-title-size-1\">YOUR ONLINE LUXURY CAR DESTINATION</div><a class=\"section-scroll btn btn-border-w btn-round\" href=\"http://localhost:8080/Project_banhang/detail?pid=4\">Learn More</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"bg-dark-30 bg-dark shop-page-header\" style=\"background-image:url(&quot;images/car14.jpg&quot;);\">\n");
      out.write("                        <div class=\"titan-caption\">\n");
      out.write("                            <div class=\"caption-content\">\n");
      out.write("                                <div class=\"font-alt mb-30 titan-title-size-1\"> This is Titan</div>\n");
      out.write("                                <div class=\"font-alt mb-40 titan-title-size-4\">Exclusive products</div><a class=\"section-scroll btn btn-border-w btn-round\" href=\"http://localhost:8080/Project_banhang/detail?pid=9\">Learn More</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--end of menu-->\n");
      out.write("        <div class=\"container\" style=\"background: #030303\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <nav aria-label=\"breadcrumb\">\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"home\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"http://localhost:8080/Project_banhang/category?cid=1\">Category</a></li>\n");
      out.write("                        </ol>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\" style=\"background: #030303\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"card bg-light mb-3\">\n");
      out.write("                        <div class=\"card-header bg-primary text-white text-uppercase\"><i class=\"fa fa-list\"></i> Categories</div>\n");
      out.write("                        <ul class=\"list-group category_block\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card bg-light mb-3\">\n");
      out.write("                        <div  class=\"card-header bg-success text-white text-uppercase\" >New product</div>\n");
      out.write("                        <div class=\"card-body\" style=\"\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            <h5 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                            <p class=\"card-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <div class=\"ratings\" style=\"color: yellow\">\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"bloc_left_price\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-9\" >\n");
      out.write("                    <div class=\"row\" >\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\">\n");
      out.write("                <ul class=\"pagination\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\">\n");
      out.write("                <ul class=\"pagination\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\">\n");
      out.write("                <ul class=\"pagination\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"module-small bg-dark\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"widget\">\n");
      out.write("                            <h5 class=\"widget-title font-alt\">About Titan</h5>\n");
      out.write("                            <p>The languages only differ in their grammar, their pronunciation and their most common words.</p>\n");
      out.write("                            <p>Phone: +1 234 567 89 10</p>Fax: +1 234 567 89 10\n");
      out.write("                            <p>Email:<a href=\"#\">somecompany@example.com</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"widget\">\n");
      out.write("                            <h5 class=\"widget-title font-alt\">Recent Comments</h5>\n");
      out.write("                            <ul class=\"icon-list\">\n");
      out.write("                                <li>Maria on <a href=\"#\">Designer Desk Essentials</a></li>\n");
      out.write("                                <li>John on <a href=\"#\">Realistic Business Card Mockup</a></li>\n");
      out.write("                                <li>Andy on <a href=\"#\">Eco bag Mockup</a></li>\n");
      out.write("                                <li>Jack on <a href=\"#\">Bottle Mockup</a></li>\n");
      out.write("                                <li>Mark on <a href=\"#\">Our trip to the Alps</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"widget\">\n");
      out.write("                            <h5 class=\"widget-title font-alt\">Blog Categories</h5>\n");
      out.write("                            <ul class=\"icon-list\">\n");
      out.write("                                <li><a href=\"#\">Photography - 7</a></li>\n");
      out.write("                                <li><a href=\"#\">Web Design - 3</a></li>\n");
      out.write("                                <li><a href=\"#\">Illustration - 12</a></li>\n");
      out.write("                                <li><a href=\"#\">Marketing - 1</a></li>\n");
      out.write("                                <li><a href=\"#\">Wordpress - 16</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"widget\">\n");
      out.write("                            <h5 class=\"widget-title font-alt\">Popular Posts</h5>\n");
      out.write("                            <ul class=\"widget-posts\">\n");
      out.write("                                <li class=\"clearfix\">\n");
      out.write("                                    <div class=\"widget-posts-image\"><a href=\"#\"><img src=\"images/car8.jpg\" alt=\"Post Thumbnail\"/></a></div>\n");
      out.write("                                    <div class=\"widget-posts-body\">\n");
      out.write("                                        <div class=\"widget-posts-title\"><a href=\"#\">Designer Desk Essentials</a></div>\n");
      out.write("                                        <div class=\"widget-posts-meta\">23 january</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"clearfix\">\n");
      out.write("                                    <div class=\"widget-posts-image\"><a href=\"#\"><img src=\"images/car11.jpg\" alt=\"Post Thumbnail\"/></a></div>\n");
      out.write("                                    <div class=\"widget-posts-body\">\n");
      out.write("                                        <div class=\"widget-posts-title\"><a href=\"#\">Realistic Business Card Mockup</a></div>\n");
      out.write("                                        <div class=\"widget-posts-meta\">15 February</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr class=\"divider-d\">\n");
      out.write("        <footer class=\"footer bg-dark\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <p class=\"copyright font-alt\">&copy; 2017&nbsp;<a href=\"index.html\">TitaN</a>, All Rights Reserved</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"footer-social-links\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a><a href=\"#\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a><a href=\"#\"><i class=\"fa fa-skype\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"assets2/lib/wow/dist/wow.js\"></script>\n");
      out.write("        <script src=\"assets2/lib/flexslider/jquery.flexslider.js\"></script>\n");
      out.write("        <script src=\"assets2/js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"managerAccount\">Manager Account</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"managerProduct\">Manager Product</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSell == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"managerProduct\">Manager Product</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"InfoAccount.jsp\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"logout\">Logout</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"Login.jsp\" style=\"color:white\">Login</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"list-group-item text-white ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag == o.cid ? \"active\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPT}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"col-12 col-md-6 col-lg-4\" >\n");
          out.write("                                <div class=\"card\">\n");
          out.write("                                    <img class=\"card-img-top\" style=\"height: 170px\"src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Card image cap\">\n");
          out.write("                                    <div class=\"card-body\">\n");
          out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                        <p class=\"card-text show_txt\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                        <div class=\"ratings\" style=\"color: yellow\">\n");
          out.write("                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
          out.write("                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
          out.write("                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
          out.write("                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
          out.write("                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"product-meta-data\">\n");
          out.write("                                            <div class=\"line\"></div>\n");
          out.write("                                            <p class=\"product-price\" style=\"font-size: 25px; color: #843534\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"cart\">\n");
          out.write("                                            <a href=\"cart?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-toggle=\"tooltip\" data-placement=\"left\" title=\"Add to Cart\"><img src=\"images/cart.png\" alt=\"\"></a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("i");
    _jspx_th_c_forEach_2.setBegin(1);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <li class=\"page-item  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i == PTid ? \"active\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"home?PTid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"page-link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>    \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("i");
    _jspx_th_c_forEach_3.setBegin(1);
    _jspx_th_c_forEach_3.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endPageSearch}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <li class=\"page-item  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i == PTidSearch ? \"active\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"search?PTidSearch=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&txt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"page-link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>    \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("i");
    _jspx_th_c_forEach_4.setBegin(1);
    _jspx_th_c_forEach_4.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endPageCate}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <li class=\"page-item  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i == PTidCate ? \"active\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"category?PTidCate=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"page-link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>    \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }
}
