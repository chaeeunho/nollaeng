/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-18 09:44:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1702876508000L));
    _jspx_dependants.put("jar:file:/C:/final/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>놀랭 : Nollaeng</title>\r\n");
      out.write("<style>\r\n");
      out.write("#login_info {\r\n");
      out.write("	margin-right: 300px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\"\r\n");
      out.write("	integrity=\"sha512-tS3S5qG0BlhnQROyJXvNjeEM4UpMXHrQfTGmbQ1gKmelCxlSEBUaxhRBj/EFTzpbP4RVSrpEikbmdJobCvhE3g==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Nanum+Gothic+Coding:wght@700&family=Nanum+Pen+Script&family=Noto+Sans+KR&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;700&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("	src=\"//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js\"></script>\r\n");
      out.write("<script src=\"resources/js/bootstrap.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\"\r\n");
      out.write("	integrity=\"sha512-bPs7Ae6pVvhOSiIcyUClR7/q2OAsRiovw4vAkX+zJbw3ShAeeqezq50RIIcIURq7Oa20rW2n2q+fyXBNcU9lrw==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("<script src=\"resources/js/header_bar.js\" defer></script>\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/7c6041109a.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<!-- 헤더 시작 -->\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"navbar_box\">\r\n");
      out.write("		<nav class=\"navbar\">\r\n");
      out.write("			<div class=\"navbar_logo\">\r\n");
      out.write("				<a href=\"#\"><img src=\"resources/images/logo.png\" alt=\"로고\"></a>\r\n");
      out.write("			</div>\r\n");
      out.write("			");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Slider main container -->\r\n");
      out.write("		<section id=\"top-page\">\r\n");
      out.write("			<div class=\"swiper\">\r\n");
      out.write("				<!-- Additional required wrapper -->\r\n");
      out.write("				<div class=\"swiper-wrapper\">\r\n");
      out.write("					<!-- Slides -->\r\n");
      out.write("					<div class=\"swiper-slide\">\r\n");
      out.write("						<a href=\"https://korean.visitkorea.or.kr/trss/intro.do\"><img\r\n");
      out.write("							src=\"resources/images/bigslide1.png\" alt=\"Slide 1\"></a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"swiper-slide\">\r\n");
      out.write("						<a href=\"event/event_page4.jsp\"><img\r\n");
      out.write("							src=\"resources/images/bigslide2.png\" alt=\"Slide 2\"></a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"swiper-slide\">\r\n");
      out.write("						<a href=\"https://vangoghexpo.com/seoul/\"><img\r\n");
      out.write("							src=\"resources/images/bigslide3.png\" alt=\"Slide 3\"></a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- If we need pagination -->\r\n");
      out.write("				<div class=\"swiper-pagination\"></div>\r\n");
      out.write("				<!-- If we need scrollbar -->\r\n");
      out.write("				<div class=\"swiper-scrollbar\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("			const swiper = new Swiper('.swiper', {\r\n");
      out.write("				// Optional parameters\r\n");
      out.write("				loop : true,\r\n");
      out.write("				autoplay : {\r\n");
      out.write("					delay : 4000,\r\n");
      out.write("				},\r\n");
      out.write("				// If we need pagination\r\n");
      out.write("				pagination : {\r\n");
      out.write("					el : '.swiper-pagination',\r\n");
      out.write("				},\r\n");
      out.write("				// And if we need scrollbar\r\n");
      out.write("				scrollbar : {\r\n");
      out.write("					el : '.swiper-scrollbar',\r\n");
      out.write("				},\r\n");
      out.write("			});\r\n");
      out.write("		</script>\r\n");
      out.write("		<!-- mid_body 시작 -->\r\n");
      out.write("		<section id=\"event_link\">\r\n");
      out.write("			<div class=\"event_div\">\r\n");
      out.write("				<em class=\"tag1\">EVENT ♥</em>\r\n");
      out.write("				<div class=\"event_page\">\r\n");
      out.write("					<h1>\r\n");
      out.write("						<a href=\"event/eventlist.jsp\">서울 데이트<br>풍성한 혜택이 가득\r\n");
      out.write("						</a>\r\n");
      out.write("					</h1>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"event_page_content_text\">\r\n");
      out.write("					<p>\r\n");
      out.write("						연인과 함께 아름다운 추억 만들어보세요.<br> <i><small>2023. 12. 5.\r\n");
      out.write("								~ 2023. 12. 31.</small></i>\r\n");
      out.write("					</p>\r\n");
      out.write("					<div class=\"event_page_content\">\r\n");
      out.write("						<div class=\"event_page_content_photo\">\r\n");
      out.write("							<img src=\"resources/images/tree_edit.png\" alt=\"이벤트 캐릭터 사진\"\r\n");
      out.write("								id=\"tree_img\" width=285; height=256;>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"event_slide_box\">\r\n");
      out.write("				<div class=\"event_slide_menu\">\r\n");
      out.write("					<div class=\"event_slide_title\">\r\n");
      out.write("						<a href=\"event/eventlist.jsp\">이벤트 및 혜택 모아보기</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"event_slide_wrapper\">\r\n");
      out.write("					<div class=\"slider owl-carousel\">\r\n");
      out.write("						<div class=\"card\">\r\n");
      out.write("							<div class=\"img\">\r\n");
      out.write("								<a href=\"event/event_page3.jsp\"><img\r\n");
      out.write("									src=\"resources/images/겨울섬.png\"></a>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"card\">\r\n");
      out.write("							<div class=\"img\">\r\n");
      out.write("								<a href=\"event/event_page2.jsp\"><img\r\n");
      out.write("									src=\"resources/images/랭킹전.png\"></a>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"card\">\r\n");
      out.write("							<div class=\"img\">\r\n");
      out.write("								<a href=\"event/event_page1.jsp\"><img\r\n");
      out.write("									src=\"resources/images/지금한국을여행해.png\"></a>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</section>\r\n");
      out.write("		<section class=\"recommend_page\">\r\n");
      out.write("			<div class=\"recommend_div\">\r\n");
      out.write("				<em class=\"tag2\">USER PICK!</em>\r\n");
      out.write("				<h2 class=\"mtit\">\r\n");
      out.write("					<a href=\"today_nollaeng_page/ptoday.jsp\">✔ 이번 주 BEST</a>\r\n");
      out.write("				</h2>\r\n");
      out.write("				<p class=\"stit\">\r\n");
      out.write("					실시간 이번 주 BEST💛 <br> <i><small>2023. 12. 24. ~\r\n");
      out.write("							2023. 12. 31.</small></i>\r\n");
      out.write("				</p>\r\n");
      out.write("				<img src=\"resources/images/best_icon.png\" alt=\"이벤트 캐릭터 사진2\"\r\n");
      out.write("					width=195; height=176; id=\"this_img\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row my-4\">\r\n");
      out.write("				<div class=\"col-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("\r\n");
      out.write("						<a href=\"instar/instar2.jsp\"><img\r\n");
      out.write("							src=\"resources/images/weekB.jpg\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h5 class=\"card-title\">첫 DDP 방문기</h5>\r\n");
      out.write("							<p class=\"card-text\">서울특별시 동대문구</p>\r\n");
      out.write("							<a href=\"instar/instar2.jsp\" class=\"btn btn-primary\">후기 상세보기</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"instar/instar2.jsp\"><img\r\n");
      out.write("							src=\"resources/images/weekB2.jpg\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h5 class=\"card-title\">Travel to Korea :)</h5>\r\n");
      out.write("							<p class=\"card-text\">인천광역시 중구</p>\r\n");
      out.write("							<a href=\"instar/instar2.jsp\" class=\"btn btn-primary\">후기 상세보기</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"instar/instar2.jsp\"><img\r\n");
      out.write("							src=\"resources/images/weekB3.jpg\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h5 class=\"card-title\">은평한옥마을에서 가볍게 산책하기</h5>\r\n");
      out.write("							<p class=\"card-text\">서울특별시 은평구</p>\r\n");
      out.write("							<a href=\"instar/instar2.jsp\" class=\"btn btn-primary\">후기 상세보기</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"instar/instar2.jsp\"><img\r\n");
      out.write("							src=\"resources/images/weekB4.jpg\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h5 class=\"card-title\">다시 눈발이 거세게 날리기 전, 고요한 오후 보내기</h5>\r\n");
      out.write("							<p class=\"card-text\">서울특별시 중구</p>\r\n");
      out.write("							<a href=\"instar/instar2.jsp\" class=\"btn btn-primary\">후기 상세보기</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"instar/instar2.jsp\"><img\r\n");
      out.write("							src=\"resources/images/weekB5.jpg\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h5 class=\"card-title\">쌀쌀한 겨울엔 광장시장에서 따뜻하게 배 채우기</h5>\r\n");
      out.write("							<p class=\"card-text\">서울특별시 종로구</p>\r\n");
      out.write("							<a href=\"instar/instar2.jsp\" class=\"btn btn-primary\">후기 상세보기</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<a href=\"instar/instar2.jsp\"><img\r\n");
      out.write("							src=\"resources/images/weekB6.jpg\" class=\"card-img-top\" alt=\"...\"></a>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h5 class=\"card-title\">경복궁에서 한복 대여하고 추억도 많이 남겼어요!</h5>\r\n");
      out.write("							<p class=\"card-text\">서울특별시 종로구</p>\r\n");
      out.write("							<a href=\"instar/instar2.jsp\" class=\"btn btn-primary\">후기 상세보기</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		$(\".slider\").owlCarousel({\r\n");
      out.write("			loop : true,\r\n");
      out.write("			autoplay : true,\r\n");
      out.write("			autoplayTimeout : 2000,\r\n");
      out.write("			autoplayHoverPause : true,\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("	<!-- 놀맵 시작 -->\r\n");
      out.write("	<div id=\"map_container\">\r\n");
      out.write("		<section class=\"map_section\">\r\n");
      out.write("			<table class=\"front_where_textarea\">\r\n");
      out.write("				<tbody>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>\r\n");
      out.write("							<h2 id=\"emoji\">&#127751;</h2>\r\n");
      out.write("							<h2>Noll Map</h2>\r\n");
      out.write("							<h3>Where do you want to hang out?</h3>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("			<table class=\"front_where_region\">\r\n");
      out.write("				<tbody>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>\r\n");
      out.write("							<table class=\"front_region_gu\">\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>\r\n");
      out.write("										<div class=\"image\" id=\"gu1\">\r\n");
      out.write("											<!-- image 클래스 추가 -->\r\n");
      out.write("											<a href=\"instar/instar3.jsp\"> <img\r\n");
      out.write("												src=\"resources/images/front_imgs/강남구.jpg\" alt=\"강남구\">\r\n");
      out.write("											</a>\r\n");
      out.write("											<div class=\"text\">강 남</div>\r\n");
      out.write("											<!-- text 클래스 추가 -->\r\n");
      out.write("										</div>\r\n");
      out.write("									</td>\r\n");
      out.write("									<td>\r\n");
      out.write("										<div class=\"image\" id=\"gu2\">\r\n");
      out.write("											<a href=\"instar/instar3.jsp\"> <img\r\n");
      out.write("												src=\"resources/images/front_imgs/마포구.jpg\" alt=\"마포구\">\r\n");
      out.write("											</a>\r\n");
      out.write("											<div class=\"text\">마 포</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</td>\r\n");
      out.write("									<td>\r\n");
      out.write("										<div class=\"image\" id=\"gu3\">\r\n");
      out.write("											<a href=\"instar/instar3.jsp\"> <img\r\n");
      out.write("												src=\"resources/images/front_imgs/서초구.jpg\" alt=\"서초구\">\r\n");
      out.write("											</a>\r\n");
      out.write("											<div class=\"text\">서 초</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</td>\r\n");
      out.write("									<td>\r\n");
      out.write("										<div class=\"image\" id=\"gu5\">\r\n");
      out.write("											<a href=\"instar/instar3.jsp\"> <img\r\n");
      out.write("												src=\"resources/images/front_imgs/용산구.jpg\" alt=\"용산구\">\r\n");
      out.write("											</a>\r\n");
      out.write("											<div class=\"text\">용 산</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</td>\r\n");
      out.write("									<td>\r\n");
      out.write("										<div class=\"image\" id=\"gu6\">\r\n");
      out.write("											<a href=\"instar/instar3.jsp\"> <img\r\n");
      out.write("												src=\"resources/images/front_imgs/잠실구.jpg\" alt=\"송파구\">\r\n");
      out.write("											</a>\r\n");
      out.write("											<div class=\"text\">잠 실</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</td>\r\n");
      out.write("									<td>\r\n");
      out.write("										<div class=\"image\" id=\"gu7\">\r\n");
      out.write("											<a href=\"instar/instar3.jsp\"> <img\r\n");
      out.write("												src=\"resources/images/front_imgs/종로구.jpg\" alt=\"종로구\">\r\n");
      out.write("											</a>\r\n");
      out.write("											<div class=\"text\">종 로</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("\r\n");
      out.write("							</table> <!-- front_region_gu -->\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</tbody>\r\n");
      out.write("				<!-- front_where_region -->\r\n");
      out.write("			</table>\r\n");
      out.write("			<!-- front_where_textarea -->\r\n");
      out.write("		</section>\r\n");
      out.write("		<!-- section -->\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- 풋터 시작 -->\r\n");
      out.write("\r\n");
      out.write("	<footer class=\"footer_box\">\r\n");
      out.write("		<div class=\"footer_info\">\r\n");
      out.write("			<div class=\"footer_cell\"></div>\r\n");
      out.write("			<div class=\"footer_cell\">\r\n");
      out.write("\r\n");
      out.write("				<ul class=\"footer_u\">\r\n");
      out.write("					<!-- 나중에 링크 넣어서 바로 넘어갈 수 있도록 생각 -->\r\n");
      out.write("					<li>상호 : (주)놀랭 | 대표자명 : 김정수</li>\r\n");
      out.write("					<li>사업자등록번호 : 000-00-00000 | 통신판매업신고번호 : 제0000-서울영등포-0000호</li>\r\n");
      out.write("					<li>연락처 : 00-000-0000 | 팩스 : 000-0000-0000 | E-mail :\r\n");
      out.write("						nollaeng@local</li>\r\n");
      out.write("					<li>주소 : 서울특별시 영등포구 선유동2로 57</li>\r\n");
      out.write("					<li><a href=\"#\">이용약관 개인정보처리방침</a></li>\r\n");
      out.write("					<li>Copyright © 놀랭</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"footer_cell\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /main.jsp(56,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionId}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<ul class=\"navbar_menu\">\r\n");
          out.write("						<li><a href=\"today_nollaeng_page/ptoday.jsp\">오늘의 놀랭</a></li>\r\n");
          out.write("						<li><a href=\"#map_container\">놀 맵</a></li>\r\n");
          out.write("						<li><a href=\"/communitylist.do\">커뮤니티</a></li>\r\n");
          out.write("						<li><a href=\"event/eventlist.jsp\">이벤트 및 혜택</a></li>\r\n");
          out.write("					</ul>\r\n");
          out.write("					<a href=\"#\" class=\"navbar_toggleBtn\"> <i\r\n");
          out.write("						class=\"fa-solid fa-bars\"></i>\r\n");
          out.write("					</a>\r\n");
          out.write("\r\n");
          out.write("					<div id=\"search\">\r\n");
          out.write("						<form action=\"instar/instar.jsp\" method=\"get\">\r\n");
          out.write("							<input type=\"text\" placeholder=\"오늘은 어디서 놀랭?\" maxlength=\"10\">\r\n");
          out.write("							<a href=\"instar/instar.jsp\"><button type=\"submit\">\r\n");
          out.write("									<i class=\"fas fa-search\"></i>\r\n");
          out.write("								</button></a>\r\n");
          out.write("						</form>\r\n");
          out.write("					</div>\r\n");
          out.write("					<div id=\"login\">\r\n");
          out.write("						<a href=\"users/loginform.jsp\"><img\r\n");
          out.write("							src=\"/resources/images/login.png\" alt=\"로그인\"></a>\r\n");
          out.write("					</div>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<ul class=\"navbar_menu\">\r\n");
          out.write("						<li><a href=\"../today_nollaeng_page/ptoday.jsp\">오늘의 놀랭</a></li>\r\n");
          out.write("						<li><a href=\"../main.jsp#map_container\">놀 맵</a></li>\r\n");
          out.write("						<li><a href=\"/communitylist.do\">커뮤니티</a></li>\r\n");
          out.write("						<li><a href=\"../event/eventlist.jsp\">이벤트 및 혜택</a></li>\r\n");
          out.write("					</ul>\r\n");
          out.write("					<a href=\"#\" class=\"navbar_toggleBtn\"> <i\r\n");
          out.write("						class=\"fa-solid fa-bars\"></i>\r\n");
          out.write("					</a>\r\n");
          out.write("\r\n");
          out.write("					<div id=\"search\">\r\n");
          out.write("						<form action=\"https://search.naver.com/search.naver\">\r\n");
          out.write("							<div class=\"search\">\r\n");
          out.write("								<input type=\"text\" placeholder=\"오늘은 어디서 놀랭?\" maxlength=\"10\"\r\n");
          out.write("									name=\"query\" value=\"\">\r\n");
          out.write("								<button type=\"submit\">\r\n");
          out.write("									<i class=\"fas fa-search\"></i>\r\n");
          out.write("								</button>\r\n");
          out.write("							</div>\r\n");
          out.write("\r\n");
          out.write("						</form>\r\n");
          out.write("					</div>\r\n");
          out.write("					<div>\r\n");
          out.write("						<ul class=\"navbar_menu\" id=\"login_info\">\r\n");
          out.write("							<li><a href=\"/logout.do\">(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님)로그아웃</a></li>\r\n");
          out.write("							<li><a href=\"/userview.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"><img\r\n");
          out.write("									src=\"../resources/images/login.png\" alt=\"로그인\"></a></li>\r\n");
          out.write("						</ul>\r\n");
          out.write("					</div>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
