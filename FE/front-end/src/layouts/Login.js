/*!

=========================================================
* Light Bootstrap Dashboard React - v2.0.1
=========================================================

* Product Page: https://www.creative-tim.com/product/light-bootstrap-dashboard-react
* Copyright 2022 Creative Tim (https://www.creative-tim.com)
* Licensed under MIT (https://github.com/creativetimofficial/light-bootstrap-dashboard-react/blob/master/LICENSE.md)

* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

*/
import React, { Component } from "react";
import { useLocation, Route, Switch } from "react-router-dom";

import AdminNavbar from "components/Navbars/AdminNavbar";
import Footer from "components/Footer/Footer";
import Sidebar from "components/Sidebar/Sidebar";
import FixedPlugin from "components/FixedPlugin/FixedPlugin";

import routes from "routes.js";

import sidebarImage from "assets/img/sidebar-3.jpg";

function Login() {
    const [image, setImage] = React.useState(sidebarImage);
    const [color, setColor] = React.useState("black");
    const [hasImage, setHasImage] = React.useState(true);
    const location = useLocation();
    const mainPanel = React.useRef(null);
    const getRoutes = (routes) => {
        return routes.map((prop, key) => {
            if (prop.layout === "/admin") {
                return (
                    <Route
                        path={prop.layout + prop.path}
                        render={(props) => <prop.component {...props} />}
                        key={key}
                    />
                );
            } else {
                return null;
            }
        });
    };
    React.useEffect(() => {
        document.documentElement.scrollTop = 0;
        document.scrollingElement.scrollTop = 0;
        mainPanel.current.scrollTop = 0;
        if (
            window.innerWidth < 993 &&
            document.documentElement.className.indexOf("nav-open") !== -1
        ) {
            document.documentElement.classList.toggle("nav-open");
            var element = document.getElementById("bodyClick");
            element.parentNode.removeChild(element);
        }
    }, [location]);
    return (
        <>
            <div className="wrapper">
                <div className="main-panel" ref={mainPanel}>
                    <br /><br />
                    <div className="wrapper">
                        <div class="register-page sidebar-collapse">
                            <nav class="navbar navbar-expand-lg fixed-top navbar-transparent " color-on-scroll="300">
                                <div class="container">
                                    <div class="navbar-translate">
                                        <a class="navbar-brand" href="https://demos.creative-tim.com/paper-kit/index.html" rel="tooltip" title="Coded by Creative Tim" data-placement="bottom" target="_blank">
                                            Paper Kit 2
                                        </a>
                                        <button class="navbar-toggler navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                                            <span class="navbar-toggler-bar bar1"></span>
                                            <span class="navbar-toggler-bar bar2"></span>
                                            <span class="navbar-toggler-bar bar3"></span>
                                        </button>
                                    </div>
                                    <div class="collapse navbar-collapse justify-content-end" id="navigation">
                                        <ul class="navbar-nav">
                                            <li class="nav-item">
                                                <a href="../index.html" class="nav-link"><i class="nc-icon nc-layout-11"></i> Components</a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="https://demos.creative-tim.com/paper-kit-2/docs/1.0/getting-started/introduction.html" target="_blank" class="nav-link"><i class="nc-icon nc-book-bookmark"></i> Documentation</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" rel="tooltip" title="Follow us on Twitter" data-placement="bottom" href="https://twitter.com/CreativeTim" target="_blank">
                                                    <i class="fa fa-twitter"></i>
                                                    <p class="d-lg-none">Twitter</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" rel="tooltip" title="Like us on Facebook" data-placement="bottom" href="https://www.facebook.com/CreativeTim" target="_blank">
                                                    <i class="fa fa-facebook-square"></i>
                                                    <p class="d-lg-none">Facebook</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" rel="tooltip" title="Follow us on Instagram" data-placement="bottom" href="https://www.instagram.com/CreativeTimOfficial" target="_blank">
                                                    <i class="fa fa-instagram"></i>
                                                    <p class="d-lg-none">Instagram</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" rel="tooltip" title="Star on GitHub" data-placement="bottom" href="https://www.github.com/CreativeTimOfficial" target="_blank">
                                                    <i class="fa fa-github"></i>
                                                    <p class="d-lg-none">GitHub</p>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </nav>
                            <div class="page-header">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-lg-4 ml-auto mr-auto">
                                            <div class="card card-register">
                                                <h3 class="title mx-auto">Mời bạn đăng nhập</h3>
                                                <div class="social-line text-center">
                                                    <a href="#pablo" class="btn btn-neutral btn-facebook btn-just-icon">
                                                        <i className="fab fa-facebook-f"></i>
                                                    </a>
                                                    <a href="#pablo" class="btn btn-neutral btn-google btn-just-icon">
                                                        <i className="fab fa-google"></i>
                                                    </a>
                                                    <a href="#pablo" class="btn btn-neutral btn-twitter btn-just-icon">
                                                        <i className="fab fa-twitter"></i>
                                                    </a>
                                                </div>
                                                <form class="register-form">
                                                    <label>Email</label>
                                                    <input type="text" class="form-control" placeholder="Email" />
                                                    <label>Mật khẩu</label>
                                                    <input type="password" class="form-control" placeholder="Password" /><br/>
                                                    <button class="btn btn-danger btn-block btn-round">Đăng nhập</button>
                                                </form><br/>
                                                <div class="forgot text-center">
                                                    <a href="#" class="btn btn-link btn-danger">Quên mật khẩu?</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="footer register-footer text-center">
                                    <h6>©
                                        <script>
                                            document.write(new Date().getFullYear())
                                        </script>, made with <i class="fa fa-heart heart"></i> by Creative Tim</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}

export default Login;
