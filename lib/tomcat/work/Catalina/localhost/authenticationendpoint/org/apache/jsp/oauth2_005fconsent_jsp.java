/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2020-02-25 02:01:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.application.authentication.endpoint.util.Constants;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import org.apache.commons.lang.StringUtils;

public final class oauth2_005fconsent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/localize.jsp", Long.valueOf(1569960366000L));
    _jspx_dependants.put("/init-url.jsp", Long.valueOf(1569960366000L));
    _jspx_dependants.put("/includes/footer.jsp", Long.valueOf(1571964730000L));
    _jspx_dependants.put("/includes/title.jsp", Long.valueOf(1571964730000L));
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1571964730000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil");
    _jspx_imports_classes.add("java.util.stream.Collectors");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.owasp.encoder.Encode");
    _jspx_imports_classes.add("java.util.stream.Stream");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("org.apache.commons.collections.CollectionUtils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.Constants");
    _jspx_imports_classes.add("org.apache.commons.lang.ArrayUtils");
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
      response.setContentType("text/html; charset=UTF-8");
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

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

    String identityServerEndpointContextParam = application.getInitParameter("IdentityServerEndpointContextURL");
    String samlssoURL = "../samlsso";
    String commonauthURL = "../commonauth";
    String oauth2AuthorizeURL = "../oauth2/authorize";
    String oidcLogoutURL = "../oidc/logout";
    String openidServerURL = "../openidserver";
    if (StringUtils.isNotBlank(identityServerEndpointContextParam)) {
        samlssoURL = identityServerEndpointContextParam + "/samlsso";
        commonauthURL = identityServerEndpointContextParam + "/commonauth";
        oauth2AuthorizeURL = identityServerEndpointContextParam + "/oauth2/authorize";
        oidcLogoutURL = identityServerEndpointContextParam + "/oidc/logout";
        openidServerURL = identityServerEndpointContextParam + "/oidc/logout";
    }

      out.write('\n');
      out.write('\n');

    String app = request.getParameter("application");
    String scopeString = request.getParameter("scope");
    boolean displayScopes = Boolean.parseBoolean(getServletContext().getInitParameter("displayScopes"));
    
    String[] requestedClaimList = new String[0];
    String[] mandatoryClaimList = new String[0];
    if (request.getParameter(Constants.REQUESTED_CLAIMS) != null) {
        requestedClaimList = request.getParameter(Constants.REQUESTED_CLAIMS).split(Constants.CLAIM_SEPARATOR);
    }
    
    if (request.getParameter(Constants.MANDATORY_CLAIMS) != null) {
        mandatoryClaimList = request.getParameter(Constants.MANDATORY_CLAIMS).split(Constants.CLAIM_SEPARATOR);
    }
    
    /*
        This parameter decides whether the consent page will only be used to get consent for sharing claims with the
        Service Provider. If this param is 'true' and user has already given consents for the OIDC scopes, we will be
        hiding the scopes being displayed and the approve always button.
    */
    boolean userClaimsConsentOnly = Boolean.parseBoolean(request.getParameter(Constants.USER_CLAIMS_CONSENT_ONLY));

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!-- title -->\n");
      out.write("    ");

        File titleFile = new File(getServletContext().getRealPath("extensions/title.jsp"));
        if (titleFile.exists()) {
    
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/title.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- localize.jsp MUST already be included in the calling script -->\n");
      out.write("\n");
      out.write("<!-- title -->\n");
      out.write("<title>WSO2 API Manager</title>\n");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    \n");
      out.write("    <link rel=\"icon\" href=\"images/favicon.png\" type=\"image/x-icon\"/>\n");
      out.write("    <link href=\"libs/bootstrap_3.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/Roboto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/custom-common.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function approved() {\n");
      out.write("        var mandatoryClaimCBs = $(\".mandatory-claim\");\n");
      out.write("        var checkedMandatoryClaimCBs = $(\".mandatory-claim:checked\");\n");
      out.write("        var scopeApproval = $(\"input[name='scope-approval']\");\n");
      out.write("\n");
      out.write("        // If scope approval radio button is rendered then we need to validate that it's checked\n");
      out.write("        if (scopeApproval.length > 0) {\n");
      out.write("            if (scopeApproval.is(\":checked\")) {\n");
      out.write("                var checkScopeConsent = $(\"input[name='scope-approval']:checked\");\n");
      out.write("                $('#consent').val(checkScopeConsent.val());\n");
      out.write("            } else {\n");
      out.write("                $(\"#modal_scope_validation\").modal();\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("        } else {\n");
      out.write("            // Scope radio button was not rendered therefore set the consent to 'approve'\n");
      out.write("            document.getElementById('consent').value = \"approve\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        if (checkedMandatoryClaimCBs.length === mandatoryClaimCBs.length) {\n");
      out.write("            document.getElementById(\"profile\").submit();\n");
      out.write("        } else {\n");
      out.write("            $(\"#modal_claim_validation\").modal();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function approvedAlways() {\n");
      out.write("        var mandatoryClaimCBs = $(\".mandatory-claim\");\n");
      out.write("        var checkedMandatoryClaimCBs = $(\".mandatory-claim:checked\");\n");
      out.write("\n");
      out.write("        if (checkedMandatoryClaimCBs.length === mandatoryClaimCBs.length) {\n");
      out.write("            document.getElementById('consent').value = \"approveAlways\";\n");
      out.write("            document.getElementById(\"profile\").submit();\n");
      out.write("        } else {\n");
      out.write("            $(\"#modal_claim_validation\").modal();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function deny() {\n");
      out.write("        document.getElementById('consent').value = \"deny\";\n");
      out.write("        document.getElementById(\"profile\").submit();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- header -->\n");

    File headerFile = new File(getServletContext().getRealPath("extensions/header.jsp"));
    if (headerFile.exists()) {

      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/header.jsp", out, false);
      out.write('\n');
 } else { 
      out.write("\n");
      out.write("        ");
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
      out.write('\n');
 } 
      out.write("\n");
      out.write("\n");
      out.write("<!-- page content -->\n");
      out.write("<div class=\"container-fluid body-wrapper\">\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("            <!-- content -->\n");
      out.write("            <div class=\"container col-xs-10 col-sm-6 col-md-6 col-lg-5 col-centered wr-content wr-login col-centered\">\n");
      out.write("                <div>\n");
      out.write("                    <h2 class=\"wr-title uppercase blue-bg padding-double white boarder-bottom-blue margin-none\">\n");
      out.write("                        ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "openid.user.claims"));
      out.write("\n");
      out.write("                    </h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"boarder-all \">\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <div class=\"padding-double login-form\">\n");
      out.write("                        <form action=\"");
      out.print(oauth2AuthorizeURL);
      out.write("\" method=\"post\" id=\"profile\" name=\"oauth2_authz\"\n");
      out.write("                              class=\"form-horizontal\" >\n");
      out.write("\n");
      out.write("                                <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                                    <div class=\"alert alert-warning\" role=\"alert\">\n");
      out.write("                                        <p class=\"margin-bottom-double\">\n");
      out.write("                                            <strong>");
      out.print(Encode.forHtml(request.getParameter("application")));
      out.write("</strong>\n");
      out.write("                                            ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "request.access.profile"));
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                            ");
 if (userClaimsConsentOnly) {
                                // If we are getting consent for user claims only we don't need to display OIDC
                                // scopes in the consent page
                            } else {
      out.write("\n");
      out.write("                            ");

                                if (displayScopes && StringUtils.isNotBlank(scopeString)) {
                                    // Remove "openid" from the scope list to display.
                                    List<String> openIdScopes = Stream.of(scopeString.split(" "))
                                            .filter(x -> !StringUtils.equalsIgnoreCase(x, "openid"))
                                            .collect(Collectors.toList());

                                    if (CollectionUtils.isNotEmpty(openIdScopes)) {
                            
      out.write("\n");
      out.write("                                <h5 class=\"section-heading-5\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "requested.scopes"));
      out.write("\n");
      out.write("                                </h5>\n");
      out.write("                                <div class=\"border-gray\" style=\"border-bottom: none;\">\n");
      out.write("                                    <ul class=\"scopes-list padding\">\n");
      out.write("                                        ");

                                            for (String scopeID : openIdScopes) {
                                        
      out.write("\n");
      out.write("                                        <li>");
      out.print(Encode.forHtml(scopeID));
      out.write("\n");
      out.write("                                        </li>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            ");

                                        }
                                    } 
      out.write("\n");
      out.write("    \n");
      out.write("                            <div class=\"border-gray margin-bottom-double\">\n");
      out.write("                                <div class=\"padding\">\n");
      out.write("                                    <div class=\"radio\">\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"radio\" name=\"scope-approval\" id=\"approveCb\" value=\"approve\">\n");
      out.write("                                            Approve Once\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"radio\">\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"radio\" name=\"scope-approval\" id=\"approveAlwaysCb\" value=\"approveAlways\">\n");
      out.write("                                            Approve Always\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("    \n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                                <!-- Prompting for consent is only needed if we have mandatory or requested claims without any consent -->\n");
      out.write("                                ");
 if (ArrayUtils.isNotEmpty(mandatoryClaimList) || ArrayUtils.isNotEmpty(requestedClaimList)) { 
      out.write("\n");
      out.write("                                <input type=\"hidden\" name=\"user_claims_consent\" id=\"user_claims_consent\" value=\"true\"/>\n");
      out.write("                                <!-- validation -->\n");
      out.write("                                <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                                    <h5 class=\"section-heading-5\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "requested.attributes"));
      out.write("</h5>\n");
      out.write("                                    <div class=\"border-gray margin-bottom-double\">\n");
      out.write("                                        <div class=\"claim-alert\" role=\"alert\">\n");
      out.write("                                            <p class=\"margin-bottom-double\">\n");
      out.write("                                                ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "by.selecting.following.attributes"));
      out.write("\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"padding\">\n");
      out.write("                                            <div class=\"select-all\">\n");
      out.write("                                                <div class=\"checkbox\">\n");
      out.write("                                                    <label>\n");
      out.write("                                                        <input type=\"checkbox\" name=\"consent_select_all\" id=\"consent_select_all\"/>\n");
      out.write("                                                        Select All\n");
      out.write("                                                    </label>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"claim-list\">\n");
      out.write("                                                ");
 for (String claim : mandatoryClaimList) {
                                                    String[] mandatoryClaimData = claim.split("_", 2);
                                                    if (mandatoryClaimData.length == 2) {
                                                        String claimId = mandatoryClaimData[0];
                                                        String displayName = mandatoryClaimData[1];
                                                
      out.write("\n");
      out.write("                                                <div class=\"checkbox claim-cb\">\n");
      out.write("                                                    <label>\n");
      out.write("                                                        <input class=\"mandatory-claim\" type=\"checkbox\" name=\"consent_");
      out.print(Encode.forHtmlAttribute(claimId));
      out.write("\" id=\"consent_");
      out.print(Encode.forHtmlAttribute(claimId));
      out.write("\"\n");
      out.write("                                                               required/>\n");
      out.write("                                                        ");
      out.print(Encode.forHtml(displayName));
      out.write("\n");
      out.write("                                                        <span class=\"required font-medium\">*</span>\n");
      out.write("                                                    </label>\n");
      out.write("                                                </div>\n");
      out.write("                                                ");

                                                        }
                                                    }
                                                
      out.write("\n");
      out.write("                                                ");
 for (String claim : requestedClaimList) {
                                                    String[] requestedClaimData = claim.split("_", 2);
                                                    if (requestedClaimData.length == 2) {
                                                        String claimId = requestedClaimData[0];
                                                        String displayName = requestedClaimData[1];
                                                
      out.write("\n");
      out.write("                                                <div class=\"checkbox claim-cb\">\n");
      out.write("                                                    <label>\n");
      out.write("                                                        <input type=\"checkbox\" name=\"consent_");
      out.print(Encode.forHtmlAttribute(claimId));
      out.write("\" id=\"consent_");
      out.print(Encode.forHtmlAttribute(claimId));
      out.write("\"/>\n");
      out.write("                                                        ");
      out.print(Encode.forHtml(displayName));
      out.write("\n");
      out.write("                                                    </label>\n");
      out.write("                                                </div>\n");
      out.write("                                                ");

                                                        }
                                                    }
                                                
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text-left padding-top-double\">\n");
      out.write("                                                <span class=\"mandatory\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "mandatory.claims.recommendation"));
      out.write("</span>\n");
      out.write("                                                <span class=\"required font-medium\">( * )</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                                <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                                    <div class=\"alert alert-warning padding-10 margin-bottom-double\" role=\"alert\">\n");
      out.write("                                        <div>\n");
      out.write("                                            ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "privacy.policy.privacy.short.description.approving"));
      out.write("\n");
      out.write("                                            <a href=\"privacy_policy.do\" target=\"policy-pane\">\n");
      out.write("                                                ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "privacy.policy.general"));
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                                    <table width=\"100%\" class=\"styledLeft margin-top-double\">\n");
      out.write("                                        <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"buttonRow\" colspan=\"2\">\n");
      out.write("                                                <input type=\"hidden\" name=\"");
      out.print(Constants.SESSION_DATA_KEY_CONSENT);
      out.write("\"\n");
      out.write("                                                       value=\"");
      out.print(Encode.forHtmlAttribute(request.getParameter(Constants.SESSION_DATA_KEY_CONSENT)));
      out.write("\"/>\n");
      out.write("                                                <input type=\"hidden\" name=\"consent\" id=\"consent\" value=\"deny\"/>\n");
      out.write("                                                <div style=\"text-align:left;\">\n");
      out.write("                                                    <input type=\"button\" class=\"btn  btn-primary\" id=\"approve\" name=\"approve\"\n");
      out.write("                                                           onclick=\"approved(); return false;\"\n");
      out.write("                                                           value=\"");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle,"continue"));
      out.write("\"/>\n");
      out.write("                                                    <input class=\"btn\" type=\"reset\"\n");
      out.write("                                                           onclick=\"deny(); return false;\"\n");
      out.write("                                                           value=\"");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle,"deny"));
      out.write("\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <!-- /content -->\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"modal_claim_validation\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\">\n");
      out.write("    <div class=\"modal-dialog modal-md\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                <h4 class=\"modal-title\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "mandatory.claims"));
      out.write("</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "mandatory.claims.warning.msg.1"));
      out.write("\n");
      out.write("                <span class=\"mandatory-msg\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "mandatory.claims.warning.msg.2"));
      out.write("</span>\n");
      out.write("                ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "mandatory.claims.warning.msg.3"));
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "ok"));
      out.write("</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"modal_scope_validation\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\">\n");
      out.write("    <div class=\"modal-dialog modal-md\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                <h4 class=\"modal-title\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "requested.scopes"));
      out.write("</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "please.select.approve.always"));
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "ok"));
      out.write("</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"libs/jquery_3.4.1/jquery-3.4.1.js\"></script>\n");
      out.write("<script src=\"libs/bootstrap_3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\"#consent_select_all\").click(function () {\n");
      out.write("            if (this.checked) {\n");
      out.write("                $('.checkbox input:checkbox').each(function () {\n");
      out.write("                    $(this).prop(\"checked\", true);\n");
      out.write("                });\n");
      out.write("            } else {\n");
      out.write("                $('.checkbox :checkbox').each(function () {\n");
      out.write("                    $(this).prop(\"checked\", false);\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        $(\".checkbox input\").click(function () {\n");
      out.write("            var claimCheckedCheckboxes = $(\".claim-cb input:checked\").length;\n");
      out.write("            var claimCheckboxes = $(\".claim-cb input\").length;\n");
      out.write("            if (claimCheckedCheckboxes !== claimCheckboxes) {\n");
      out.write("                $(\"#consent_select_all\").prop(\"checked\", false);\n");
      out.write("            } else {\n");
      out.write("                $(\"#consent_select_all\").prop(\"checked\", true);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- footer -->\n");

    File footerFile = new File(getServletContext().getRealPath("extensions/footer.jsp"));
    if (footerFile.exists()) {

      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/footer.jsp", out, false);
      out.write('\n');
 } else { 
      out.write("\n");
      out.write("        ");
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
      out.write('\n');
 } 
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"libs/jquery_3.4.1/jquery-3.4.1.js\"></script>\n");
      out.write("<script src=\"libs/bootstrap_3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
