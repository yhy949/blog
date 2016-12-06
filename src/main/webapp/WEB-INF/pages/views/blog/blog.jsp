<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>test</title>
	  <link rel="stylesheet" href="https://unpkg.com/purecss@0.6.0/build/pure-min.css">
	  <link rel="stylesheet" href="https://unpkg.com/purecss@0.6.0/build/pure-min.css">
    <link rel="stylesheet" href="https://unpkg.com/purecss@0.6.0/build/grids-responsive-min.css">
    <link rel="stylesheet" href="${home}/css/blog/blog.css">
     <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.5/fonts/glyphicons-halflings-regular.svg"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<style type="text/css">
	
</style>
<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">切换导航</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a rel="nofollow" class="navbar-brand" href="#">导航</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a rel="nofollow" href="#">链接</a>
						</li>
						<li>
							<a rel="nofollow" href="#">链接</a>
						</li>
						<li class="dropdown">
							 <a rel="nofollow" href="#" class="dropdown-toggle" data-toggle="dropdown">下拉菜单<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a rel="nofollow" href="#">列表一</a>
								</li>
								<li>
									<a rel="nofollow" href="#">列表二</a>
								</li>
								<li>
									<a rel="nofollow" href="#">列表三</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a rel="nofollow" href="#">更多列表</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a rel="nofollow" href="#">更多列表</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">搜索</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							<a rel="nofollow" href="#">链接</a>
						</li>
						<li class="dropdown">
							 <a rel="nofollow" href="#" class="dropdown-toggle" data-toggle="dropdown">下拉菜单<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a rel="nofollow" href="#">列表一</a>
								</li>
								<li>
									<a rel="nofollow" href="#">列表二</a>
								</li>
								<li>
									<a rel="nofollow" href="#">列表三</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a rel="nofollow" href="#">更多列表</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a rel="nofollow" href="#">更多列表</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-8 column">
			<div class="posts">
                <h1 class="content-subhead">Pinned Post</h1>

                <!-- A single blog post -->
                <section class="post">
                    <header class="post-header">
                        <img width="48" height="48" alt="Tilo Mitra&#x27;s avatar" class="post-avatar" src="${home}/images/blog/tilo-avatar.png">

                        <h2 class="post-title">Introducing Pure</h2>

                        <p class="post-meta">
                            By <a href="#" class="post-author">Tilo Mitra</a> under <a class="post-category post-category-design" href="#">CSS</a> <a class="post-category post-category-pure" href="#">Pure</a>
                        </p>
                    </header>

                    <div class="post-description">
                        <p>
                            Yesterday at CSSConf, we launched Pure – a new CSS library. Phew! Here are the <a href="https://speakerdeck.com/tilomitra/pure-bliss">slides from the presentation</a>. Although it looks pretty minimalist, we’ve been working on Pure for several months. After many iterations, we have released Pure as a set of small, responsive, CSS modules that you can use in every web project.
                        </p>
                    </div>
                </section>
            </div>
            <div class="posts">
                <h1 class="content-subhead">Recent Posts</h1>

                <section class="post">
                    <header class="post-header">
                        <img width="48" height="48" alt="Eric Ferraiuolo&#x27;s avatar" class="post-avatar" src="${home}/images/blog/ericf-avatar.png">

                        <h2 class="post-title">Everything You Need to Know About Grunt</h2>

                        <p class="post-meta">
                            By <a class="post-author" href="#">Eric Ferraiuolo</a> under <a class="post-category post-category-js" href="#">JavaScript</a>
                        </p>
                    </header>

                    <div class="post-description">
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
                        </p>
                    </div>
                </section>

                <section class="post">
                    <header class="post-header">
                        <img width="48" height="48" alt="Reid Burke&#x27;s avatar" class="post-avatar" src="${home}/images/blog/reid-avatar.png">

                        <h2 class="post-title">Photos from CSSConf and JSConf</h2>

                        <p class="post-meta">
                            By <a class="post-author" href="#">Reid Burke</a> under <a class="post-category" href="#">Uncategorized</a>
                        </p>
                    </header>

                    <div class="post-description">
                        <div class="post-images pure-g">
                            <div class="pure-u-1 pure-u-md-1-2">
                                <a href="http://www.flickr.com/photos/uberlife/8915936174/">
                                    <img alt="Photo of someone working poolside at a resort"
                                         class="pure-img-responsive"
                                         src="http://farm8.staticflickr.com/7448/8915936174_8d54ec76c6.jpg">
                                </a>

                                <div class="post-image-meta">
                                    <h3>CSSConf Photos</h3>
                                </div>
                            </div>

                            <div class="pure-u-1 pure-u-md-1-2">
                                <a href="http://www.flickr.com/photos/uberlife/8907351301/">
                                    <img alt="Photo of the sunset on the beach"
                                         class="pure-img-responsive"
                                         src="http://farm8.staticflickr.com/7382/8907351301_bd7460cffb.jpg">
                                </a>

                                <div class="post-image-meta">
                                    <h3>JSConf Photos</h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>

                <section class="post">
                    <header class="post-header">
                        <img width="48" height="48" alt="Andrew Wooldridge&#x27;s avatar" class="post-avatar" src="${home}/images/blog/andrew-avatar.png">

                        <h2 class="post-title">YUI 3.10.2 Released</h2>

                        <p class="post-meta">
                            By <a class="post-author" href="#">Andrew Wooldridge</a> under <a class="post-category post-category-yui" href="#">YUI</a>
                        </p>
                    </header>

                    <div class="post-description">
                        <p>
                            We are happy to announce the release of YUI 3.10.2! You can find it now on the Yahoo! CDN, download it directly, or pull it in via npm. We’ve also updated the YUI Library website with the latest documentation.
                        </p>
                    </div>
                </section>
            </div>

		</div>
		<div class="col-md-4 column">
			<div class="panel panel-primary">
			    <div class="panel-heading">
			        <h3 class="panel-title">面板标题</h3>
			    </div>
			    <div class="panel-body">
			        这是一个基本的面板
			    </div>
			</div>
			<div class="panel panel-success">
			    <div class="panel-heading">
			        <h3 class="panel-title">面板标题</h3>
			    </div>
			    <div class="panel-body">
			        这是一个基本的面板
			    </div>
			</div>
			<div class="panel panel-info">
			    <div class="panel-heading">
			        <h3 class="panel-title">面板标题</h3>
			    </div>
			    <div class="panel-body">
			        这是一个基本的面板
			    </div>
			</div>
			<div class="panel panel-warning">
			    <div class="panel-heading">
			        <h3 class="panel-title">面板标题</h3>
			    </div>
			    <div class="panel-body">
			        这是一个基本的面板
			    </div>
			</div>
			<div class="panel panel-danger">
			    <div class="panel-heading">
			        <h3 class="panel-title">面板标题</h3>
			    </div>
			    <div class="panel-body">
			        这是一个基本的面板
			    </div>
			</div>

		</div>
	</div>

	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="footer">
                <div class="pure-menu pure-menu-horizontal">
                    <ul>
                        <li class="pure-menu-item"><a href="http://purecss.io/" class="pure-menu-link">About</a></li>
                        <li class="pure-menu-item"><a href="http://twitter.com/yuilibrary/" class="pure-menu-link">Twitter</a></li>
                        <li class="pure-menu-item"><a href="http://github.com/yahoo/pure/" class="pure-menu-link">GitHub</a></li>
                    </ul>
                </div>
            </div>
		</div>
	</div>
</div>
</body>
</html>