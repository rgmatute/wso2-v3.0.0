/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2020-02-25 01:59:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.lang.StringUtils;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.mgt.endpoint.IdentityManagementEndpointUtil;
import org.wso2.carbon.identity.mgt.endpoint.client.api.SelfRegisterApi;
import com.google.gson.Gson;
import org.wso2.carbon.identity.mgt.endpoint.client.model.*;
import org.wso2.carbon.identity.mgt.endpoint.client.model.Error;
import org.wso2.carbon.identity.mgt.endpoint.IdentityManagementEndpointConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.base.MultitenantConstants;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.mgt.endpoint.EncodedControl;
import java.nio.charset.StandardCharsets;

public final class self_002dregistration_002dwith_002dverification_002dconfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/localize.jsp", Long.valueOf(1569960366000L));
    _jspx_dependants.put("/includes/footer.jsp", Long.valueOf(1571964730000L));
    _jspx_dependants.put("/includes/title.jsp", Long.valueOf(1571964730000L));
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1571964730000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("org.wso2.carbon.identity.mgt.endpoint.client.model");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.IdentityManagementEndpointConstants");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.client.api.SelfRegisterApi");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.client.model.Error");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.IdentityManagementEndpointUtil");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.owasp.encoder.Encode");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.EncodedControl");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("com.google.gson.Gson");
    _jspx_imports_classes.add("org.wso2.carbon.base.MultitenantConstants");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.mgt.recovery.endpoint.i18n.Resources";
    ResourceBundle recoveryResourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');

    boolean error = IdentityManagementEndpointUtil.getBooleanValue(request.getAttribute("error"));
    String errorMsg = IdentityManagementEndpointUtil.getStringValue(request.getAttribute("errorMsg"));


    String username = request.getParameter("username");
    String tenantdomain = request.getParameter("tenantdomain");
    String confirmationKey = request.getParameter("confirmation");
    String callback = request.getParameter("callback");

    if (StringUtils.isBlank(callback)) {
        callback = IdentityManagementEndpointUtil.getUserPortalUrl(
                application.getInitParameter(IdentityManagementEndpointConstants.ConfigConstants.USER_PORTAL_URL));
    }


    if (StringUtils.isBlank(username) || StringUtils.isBlank(confirmationKey)) {
        confirmationKey = IdentityManagementEndpointUtil.getStringValue(request.getAttribute("confirmationKey"));
    }
    String message = "" ;

    try {
        SelfRegisterApi selfRegisterApi = new SelfRegisterApi();
        CodeValidationRequest validationRequest = new CodeValidationRequest();
        List<Property> properties = new ArrayList<>();
        Property tenantDomainProperty = new Property();
        tenantDomainProperty.setKey(MultitenantConstants.TENANT_DOMAIN);
        tenantDomainProperty.setValue(tenantdomain);
        properties.add(tenantDomainProperty);

        validationRequest.setCode(confirmationKey);
        validationRequest.setProperties(properties);

        selfRegisterApi.validateCodePostCall(validationRequest);

        request.setAttribute("callback", callback);
        request.setAttribute("confirm", "true");
        request.getRequestDispatcher("self-registration-complete.jsp").forward(request,response);
    } catch (Exception e) {
        IdentityManagementEndpointUtil.addErrorInformation(request, e);
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- title -->\n");
      out.write("        ");

            File titleFile = new File(getServletContext().getRealPath("extensions/title.jsp"));
            if (titleFile.exists()) {
        
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/title.jsp", out, false);
      out.write("\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- localize.jsp MUST already be included in the calling script -->\n");
      out.write("\n");
      out.write("<!-- title -->\n");
      out.write("<title>WSO2 API Manager</title>\n");
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"icon\" href=\"images/favicon.png\" type=\"image/x-icon\"/>\n");
      out.write("        <link href=\"libs/bootstrap_3.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/Roboto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/custom-common.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <!-- header -->\n");
      out.write("    ");

        File headerFile = new File(getServletContext().getRealPath("extensions/header.jsp"));
        if (headerFile.exists()) {
    
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- localize.jsp MUST already be included in the calling script -->\n");
      out.write("\n");
      out.write("<!-- header -->\n");
      out.write("<header class=\"header header-default\">\n");
      out.write("    <div class=\"container-fluid\"><br></div>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"pull-left brand float-remove-xs text-center-xs\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <img src=\"images/logo-inverse.svg\"\n");
      out.write("\t\t             alt=\"WSO2\"\n");
      out.write("                     title=\"WSO2\"\n");
      out.write("                     class=\"logo\">\n");
      out.write("                <h1><em>API Manager</em></h1>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <!-- page content -->\n");
      out.write("    <div class=\"container-fluid body-wrapper\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!-- content -->\n");
      out.write("            <div class=\"col-xs-12 col-sm-10 col-md-8 col-lg-5 col-centered wr-login\">\n");
      out.write("\n");
      out.write("                <div class=\"boarder-all \">\n");
      out.write("\n");
      out.write("                    ");
 if (error) { 
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\" id=\"server-error-msg\">\n");
      out.write("                        ");
      out.print( IdentityManagementEndpointUtil.i18nBase64(recoveryResourceBundle, errorMsg) );
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");
 }else{
                        
      out.write("\n");
      out.write("                    <div class=\"alert alert-info\">");
      out.print(message);
      out.write("</div>\n");
      out.write("                    ");

                    } 
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\" id=\"error-msg\" hidden=\"hidden\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    ");

        File footerFile = new File(getServletContext().getRealPath("extensions/footer.jsp"));
        if (footerFile.exists()) {
    
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- localize.jsp MUST already be included in the calling script -->\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <p>WSO2 API Manager | &copy;\n");
      out.write("            <script>document.write(new Date().getFullYear());</script>\n");
      out.write("            <a href=\"https://wso2.com/\"\n");
      out.write("               target=\"_blank\">\n");
      out.write("               <i class=\"icon fw fw-wso2\"></i>\n");
      out.write("               Inc\n");
      out.write("            </a>\n");
      out.write("            . All rights reserved\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"libs/jquery_3.4.1/jquery-3.4.1.js\"></script>\n");
      out.write("    <script src=\"libs/bootstrap_3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
