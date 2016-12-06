<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>test</title>
    <link rel="stylesheet" href="${home}/css/blog/email.css">
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
    <script src="https://yui-s.yahooapis.com/3.18.1/build/yui/yui-min.js"></script>
<script>
    YUI().use('node-base', 'node-event-delegate', function (Y) {

        var menuButton = Y.one('.nav-menu-button'),
            nav        = Y.one('#nav');

        // Setting the active class name expands the menu vertically on small screens.
        menuButton.on('click', function (e) {
            nav.toggleClass('active');
        });

        // Your application code goes here...

    });
</script>
</head>
<style type="text/css">
	body{
        
    }
    .container{
        
    }
    .row {
        float:left;
        width:25%;
    }
    .col-md-9{
        right: -300px
    }
    #nav{
        margin-left: 0px;
    }
</style>
<body>

    <div class="container">
        <div class="row clearfix">
        <div id="nav" class="pure-u">
            <div class="nav-inner">
                <button class="primary-button pure-button">Compose</button>
                <div class="pure-menu">
                    <ul class="pure-menu-list">
                        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Inbox <span class="email-count">(2)</span></a></li>
                        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Important</a></li>
                        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Sent</a></li>
                        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Drafts</a></li>
                        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Trash</a></li>
                        <li class="pure-menu-heading">Labels</li>
                        <li class="pure-menu-item"><a href="#" class="pure-menu-link"><span class="email-label-personal"></span>Personal</a></li>
                        <li class="pure-menu-item"><a href="#" class="pure-menu-link"><span class="email-label-work"></span>Work</a></li>
                        <li class="pure-menu-item"><a href="#" class="pure-menu-link"><span class="email-label-travel"></span>Travel</a></li>
                    </ul>
                </div>
            </div>
            </div>
        </div>
           
        <div class="col-sm-9 col-md-9 column">
           
                <div class="email-content">
                    <div class="email-content-header pure-g">
                        <div class="pure-u-1-2">
                            <h1 class="email-content-title">Hello from Toronto</h1>
                            <p class="email-content-subtitle">
                                From <a>Tilo Mitra</a> at <span>3:56pm, April 3, 2012</span>
                            </p>
                        </div>

                        <div class="email-content-controls pure-u-1-2">
                            <button class="secondary-button pure-button">Reply</button>
                            <button class="secondary-button pure-button">Forward</button>
                            <button class="secondary-button pure-button">Move to</button>
                        </div>
                    </div>

                    <div class="email-content-body">
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                        </p>
                        <p>
                            Duis aute irure dolor in reprehenderit in voluptate velit essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                        <p>
                            Aliquam ac feugiat dolor. Proin mattis massa sit amet enim iaculis tincidunt. Mauris tempor mi vitae sem aliquet pharetra. Fusce in dui purus, nec malesuada mauris. Curabitur ornare arcu quis mi blandit laoreet. Vivamus imperdiet fermentum mauris, ac posuere urna tempor at. Duis pellentesque justo ac sapien aliquet egestas. Morbi enim mi, porta eget ullamcorper at, pharetra id lorem.
                        </p>
                        <p>
                            Donec sagittis dolor ut quam pharetra pretium varius in nibh. Suspendisse potenti. Donec imperdiet, velit vel adipiscing bibendum, leo eros tristique augue, eu rutrum lacus sapien vel quam. Nam orci arcu, luctus quis vestibulum ut, ullamcorper ut enim. Morbi semper erat quis orci aliquet condimentum. Nam interdum mauris sed massa dignissim rhoncus.
                        </p>
                        <p>
                            Regards,<br>
                            Tilo
                        </p>
                    </div>
                </div>
            
        </div>
    </div>  

</body>