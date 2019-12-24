<!DOCTYPE HTML
        <head>
<title>电影详情</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="../css/style.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="../js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="../js/move-top.js"></script>
<script type="text/javascript" src="../js/easing.js"></script>
</head>
<body>
<div class="header">
    <div class="headertop_desc">
        <div class="wrap">
            <div class="nav_list">
                <ul>
                    <li><a href="index.html">首页</a></li>
                    <li><a href="contact.html">Sitemap</a></li>
                    <li><a href="contact.html">Contact</a></li>
                </ul>
            </div>
            <div class="account_desc">
                <ul>
                    <li><a href="contact.html">Register</a></li>
                    <li><a href="contact.html">Login</a></li>
                    <li><a href="preview.html">Delivery</a></li>
                    <li><a href="#">Checkout</a></li>
                    <li><a href="#">My Account</a></li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <div class="wrap">
        <div class="header_top">
            <div class="logo">
                <a href="index.html"><img src="images/logo.png" alt=""/></a>
            </div>
            <div class="header_top_right">
                <div class="cart">
                    <p><span>Cart</span>
                    <div id="dd" class="wrapper-dropdown-2"> (empty)
                        <ul class="dropdown">
                            <li>you have no items in your Shopping cart</li>
                        </ul>
                    </div>
                    </p>
                </div>
                <div class="search_box">
                    <form>
                        <input type="text" value="Search" onfocus="this.value = '';"
                               onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
                    </form>
                </div>
                <div class="clear"></div>
            </div>
            <script type="text/javascript">
                function DropDown(el) {
                    this.dd = el;
                    this.initEvents();
                }

                DropDown.prototype = {
                    initEvents: function () {
                        var obj = this;

                        obj.dd.on('click', function (event) {
                            $(this).toggleClass('active');
                            event.stopPropagation();
                        });
                    }
                }

                $(function () {

                    var dd = new DropDown($('#dd'));

                    $(document).click(function () {
                        // all dropdowns
                        $('.wrapper-dropdown-2').removeClass('active');
                    });

                });
            </script>
            <div class="clear"></div>
        </div>
    </div>
</div>
<div class="main">
    <div class="wrap">
        <div class="content_top">
            <div class="back-links">
                <p><a href="index.html">首页</a>电影详情<a href="#" class="active">English</a></p>
            </div>
            <div class="clear"></div>
        </div>
        <div class="section group">
            <div class="cont-desc span_1_of_2">
                <div class="product-details">
                    <div class="grid images_3_of_2">
                        <img width="400px" height="400px" src="${movie.movPic1}" alt=""/>
                    </div>
                    <div class="desc span_3_of_2">
                        <h2>电影展示</h2>
                        <#--<div class="price">
                            <p>Price: <span>$500</span></p>
                        </div>-->
                        <div class="available">
                            <ul>
                                <li><span>影片名:</span>${movie.movName}</li>
                                <li><span>上映时间:</span>${movie.movIndate?datetime}</li>
                                <li><span>时长:</span>&nbsp${movie.movTime}分钟</li>
                                <li><span>类型:</span>&nbsp${movie.movStyle}</li>
                                <li><span>国家:</span>&nbsp${movie.country}</li>
                            </ul>
                        </div>
                        <div class="share-desc">
                            <#--							<div class="share">-->
                            <#--								&lt;#&ndash;<p>Number of units :</p>&ndash;&gt;<input class="text_box" type="text">-->
                            <#--							</div>-->
                            <div class="button"><span><a href="#">去购票</a></span></div>
                            <div class="clear"></div>
                        </div>
                        <#--<div class="wish-list">
                            <ul>
                                <li class="wish"><a href="#">Add to Wishlist</a></li>
                                <li class="compare"><a href="#">Add to Compare</a></li>
                            </ul>
                        </div>-->
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="product_desc">
                    <h2>简介 :</h2>
                    <p>${movie.movIntroduce}</p>
                </div>
                <hr>
                <hr>
                <div class="product_desc">
                    <style>
                        .director {
                            float: left;
                            padding-left: 10px;
                        }

                        .directorImg {
                            width: 120px;
                            height: 170px;
                        }

                        .parent {
                            height: 600px;
                            width: 500px;
                            float: none;
                        }
                    </style>
                    <h2>导演:</h2>
                    <#assign directorList="${movie.movDirector}">
                    <#list directorList?eval as director >
                        <div class="director">
                            <img class="directorImg" src="${director.img}"/>
                            <p align="center">${director.name}</p>
                        </div>
                    </#list>

                    <div style="clear: both;">
                        <hr>
                    </div>

                    <h2>导演:</h2>

                    <#assign performerList="${movie.movPerformer}">
                    <#list performerList?eval as performer >
                        <div class="director">
                            <img class="directorImg" src="${performer.img}"/>
                            <p align="center">${performer.name}</p>
                        </div>
                    </#list>


                    <div style="clear: both;">
                        <hr>
                    </div>

                    <h2>图集:</h2>

                    <#assign pic2List="${movie.movPic2}">
                    <#list pic2List?eval as pic2 >
                        <div class="director">
                            <img class="directorImg" src="${pic2}"/>
                        </div>
                    </#list>
                </div>
            </div>

            <div class="rightsidebar span_3_of_1 sidebar">
                <h2>热播电影</h2>
<#--                <#assign hotMovieList="${hotMovie}"/>-->
                <#list hotMovie as movie >
                <div class="special_movies">
                    <div class="movie_poster">
                        <a href="#"><img src="${movie.movPic1!''}" alt=""/></a>
                    </div>
                    <div class="movie_desc">
                        <h3><a href="preview.html">${movie.movName}</a></h3>
                        <span><a href="#">去购票</a></span>
                    </div>
                    <div class="clear"></div>
                </div>
                </#list>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <div class="wrap">
        <div class="section group">
            <div class="col_1_of_4 span_1_of_4">
                <h4>Information</h4>
                <ul>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Customer Service</a></li>
                    <li><a href="#">Advanced Search</a></li>
                    <li><a href="#">Orders and Returns</a></li>
                    <li><a href="contact.html">Contact Us</a></li>
                </ul>
            </div>
            <div class="col_1_of_4 span_1_of_4">
                <h4>Why buy from us</h4>
                <ul>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Customer Service</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="contact.html">Site Map</a></li>
                    <li><a href="#">Search Terms</a></li>
                </ul>
            </div>
            <div class="col_1_of_4 span_1_of_4">
                <h4>My account</h4>
                <ul>
                    <li><a href="contact.html">Sign In</a></li>
                    <li><a href="index.html">View Cart</a></li>
                    <li><a href="#">My Wishlist</a></li>
                    <li><a href="#">Track My Order</a></li>
                    <li><a href="contact.html">Help</a></li>
                </ul>
            </div>
            <div class="col_1_of_4 span_1_of_4">
                <h4>Contact</h4>
                <ul>
                    <li><span>+91-123-456789</span></li>
                    <li><span>+00-123-000000</span></li>
                </ul>
                <div class="social-icons">
                    <h4>Follow Us</h4>
                    <ul>
                        <li><a href="#" target="_blank"><img src="images/facebook.png" alt=""/></a></li>
                        <li><a href="#" target="_blank"><img src="images/twitter.png" alt=""/></a></li>
                        <li><a href="#" target="_blank"><img src="images/skype.png" alt=""/> </a></li>
                        <li><a href="#" target="_blank"> <img src="images/linkedin.png" alt=""/></a></li>
                        <div class="clear"></div>
                    </ul>
                </div>
            </div>
        </div>
        <div class="copy_right">
            <p>Copyright &copy; 2014.Company name All rights reserved.<a target="_blank"
                                                                         href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
            </p>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(document).ready(function () {
        $().UItoTop({easingType: 'easeOutQuart'});

    });
</script>
<a href="#" id="toTop"><span id="toTopHover"> </span></a>
<div style="display:none">
    <script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script>
</div>
</body>
</html>

