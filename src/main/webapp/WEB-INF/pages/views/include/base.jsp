<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name= "viewport" content="width=device-width,initial-scale=1.0">
    <meta name="description" content="A layout example that shows off a blog page with a list of posts.">
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css">
    <link rel="stylesheet" href="http://picturebag.qiniudn.com/blog.css">
    <%--<link rel="stylesheet" href="${home}/js/pure-release-0.6.0/pure-min.css">--%>
    <%--<link rel="stylesheet" href="${home}/js/pure-release-0.6.0/grids-responsive-min.css">--%>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <%--<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">--%>
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <%--<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">--%>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <%--<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>--%>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <%--<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>--%>
    <%--<link rel="stylesheet" href="${home}/js/bootstrap/css/bootstrap.min.css">--%>
    <link rel="stylesheet" href="${home}/js/bootstrap/css/bootstrap-theme.min.css">
    <script src="${home}/js/jquery-1.11.1/jquery.min.js"></script>
    <script src="${home}/js/bootstrap/js/bootstrap.min.js"></script>

    <title>my blog</title>
</head>
<body>
<div id = 'layout' class="pure-g">
	<div class="sidebar pure-u-1 pure-u-md-1-4">
		<div class="header">
			<h1 class="brand-title">my blog</h1>
			<h2 class="brand-tagline">马云</h2>
			<nav class="nva">
				<ul class="nav-list">
				 <li class="nav-item">
                        <a class="button-success pure-button" href="${home}/blog/blog.jsp">主页</a>
                    </li>
                    <li class="nav-item">
                        <a class="button-success pure-button" href="/">归档</a>
                    </li>
					<li class="nav-item">
						<a class="pure-button" href="https://www.baidu.com">登录</a>
					</li>
				</ul>
			</nav>
		</div>
	</div>
	    <div class="content pure-u-1 pure-u-md-3-4">
        <div>
            <jsp:include page="home.jsp"></jsp:include>
            <div class="footer">
                <div class="pure-menu pure-menu-horizontal pure-menu-open">
                    <ul>
                        <li><a href="#">About Me</a></li>
                        <li><a href="#">Twitter</a></li>
                        <li><a href="#">GitHub</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>