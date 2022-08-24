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

import routes from "routes.js";

import sidebarImage from "assets/img/sidebar-3.jpg";

function Home() {
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
          <AdminNavbar /><br /><br />
          <div>
            <div class="landing-page sidebar-collapse">
              <div class="page-header" data-parallax="true" >
              {/*<div class="page-header" data-parallax="true" style={{ backgroundImage: `url(${background})` }}>*/}
                <div class="container">
                  <div class="motto text-center">
                    <h1>Example page</h1>
                    <h3>Start designing your landing page here.</h3>
                    <br />
                    <a href="https://www.youtube.com/watch?v=dQw4w9WgXcQ" class="btn btn-outline-neutral btn-round"><i class="fa fa-play"></i>Watch video</a>
                    <button type="button" class="btn btn-outline-neutral btn-round">Download</button>
                  </div>
                </div>
              </div>
              <div class="main">
                <div class="section text-center">
                  <div class="container">
                    <div class="row">
                      <div class="col-md-8 ml-auto mr-auto">
                        <h2 class="title">Let's talk product</h2>
                        <h5 class="description">This is the paragraph where you can write more details about your product. Keep you user engaged by providing meaningful information. Remember that by this time, the user is curious, otherwise he wouldn't scroll to get here. Add a button if you want the user to see more.</h5>
                        <br />
                        <a href="#paper-kit" class="btn btn-danger btn-round">See Details</a>
                      </div>
                    </div>
                    <br />
                    <br />
                    <div class="row">
                      <div class="col-md-3">
                        <div class="info">
                          <div class="icon icon-danger">
                            <i class="nc-icon nc-album-2"></i>
                          </div>
                          <div class="description">
                            <h4 class="info-title">Beautiful Gallery</h4>
                            <p class="description">Spend your time generating new ideas. You don't have to think of implementing.</p>
                            <a href="javascript:;" class="btn btn-link btn-danger">See more</a>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-3">
                        <div class="info">
                          <div class="icon icon-danger">
                            <i class="nc-icon nc-bulb-63"></i>
                          </div>
                          <div class="description">
                            <h4 class="info-title">New Ideas</h4>
                            <p>Larger, yet dramatically thinner. More powerful, but remarkably power efficient.</p>
                            <a href="javascript:;" class="btn btn-link btn-danger">See more</a>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-3">
                        <div class="info">
                          <div class="icon icon-danger">
                            <i class="nc-icon nc-chart-bar-32"></i>
                          </div>
                          <div class="description">
                            <h4 class="info-title">Statistics</h4>
                            <p>Choose from a veriety of many colors resembling sugar paper pastels.</p>
                            <a href="javascript:;" class="btn btn-link btn-danger">See more</a>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-3">
                        <div class="info">
                          <div class="icon icon-danger">
                            <i class="nc-icon nc-sun-fog-29"></i>
                          </div>
                          <div class="description">
                            <h4 class="info-title">Delightful design</h4>
                            <p>Find unique and handmade delightful designs related items directly from our sellers.</p>
                            <a href="javascript:;" class="btn btn-link btn-danger">See more</a>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="section section-dark text-center">
                  <div class="container">
                    <h2 class="title">Let's talk about us</h2>
                    <div class="row">
                      <div class="col-md-4">
                        <div class="card card-profile card-plain">
                          <div class="card-avatar">
                            <a href="#avatar">
                              <img src="../Documentation/img/clem-onojeghuo-3.jpg" alt="..." />
                            </a>
                          </div>
                          <div class="card-body">
                            <a href="#paper-kit">
                              <div class="author">
                                <h4 class="card-title">Henry Ford</h4>
                                <h6 class="card-category">Product Manager</h6>
                              </div>
                            </a>
                            <p class="card-description text-center">
                              Teamwork is so important that it is virtually impossible for you to reach the heights of your capabilities or make the money that you want without becoming very good at it.
                            </p>
                          </div>
                          <div class="card-footer text-center">
                            <a href="#pablo" class="btn btn-link btn-just-icon btn-neutral"><i class="fa fa-twitter"></i></a>
                            <a href="#pablo" class="btn btn-link btn-just-icon btn-neutral"><i class="fa fa-google-plus"></i></a>
                            <a href="#pablo" class="btn btn-link btn-just-icon btn-neutral"><i class="fa fa-linkedin"></i></a>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-4">
                        <div class="card card-profile card-plain">
                          <div class="card-avatar">
                            <a href="#avatar">
                              <img src="../Documentation/img/joe-gardner-2.jpg" alt="..." />
                            </a>
                          </div>
                          <div class="card-body">
                            <a href="#paper-kit">
                              <div class="author">
                                <h4 class="card-title">Sophie West</h4>
                                <h6 class="card-category">Designer</h6>
                              </div>
                            </a>
                            <p class="card-description text-center">
                              A group becomes a team when each member is sure enough of himself and his contribution to praise the skill of the others. No one can whistle a symphony. It takes an orchestra to play it.
                            </p>
                          </div>
                          <div class="card-footer text-center">
                            <a href="#pablo" class="btn btn-link btn-just-icon btn-neutral"><i class="fa fa-twitter"></i></a>
                            <a href="#pablo" class="btn btn-link btn-just-icon btn-neutral"><i class="fa fa-google-plus"></i></a>
                            <a href="#pablo" class="btn btn-link btn-just-icon btn-neutral"><i class="fa fa-linkedin"></i></a>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-4">
                        <div class="card card-profile card-plain">
                          <div class="card-avatar">
                            <a href="#avatar">
                              <img src="../Documentation/img/erik-lucatero-2.jpg" alt="..." />
                            </a>
                          </div>
                          <div class="card-body">
                            <a href="#paper-kit">
                              <div class="author">
                                <h4 class="card-title">Robert Orben</h4>
                                <h6 class="card-category">Developer</h6>
                              </div>
                            </a>
                            <p class="card-description text-center">
                              The strength of the team is each individual member. The strength of each member is the team. If you can laugh together, you can work together, silence isn’t golden, it’s deadly.
                            </p>
                          </div>
                          <div class="card-footer text-center">
                            <a href="#pablo" class="btn btn-link btn-just-icon btn-neutral"><i class="fa fa-twitter"></i></a>
                            <a href="#pablo" class="btn btn-link btn-just-icon btn-neutral"><i class="fa fa-google-plus"></i></a>
                            <a href="#pablo" class="btn btn-link btn-just-icon btn-neutral"><i class="fa fa-linkedin"></i></a>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="section landing-section">
                  <div class="container">
                    <div class="row">
                      <div class="col-md-8 ml-auto mr-auto">
                        <h2 class="text-center">Keep in touch?</h2>
                        <form class="contact-form">
                          <div class="row">
                            <div class="col-md-6">
                              <label>Name</label>
                              <div class="input-group">
                                <div class="input-group-prepend">
                                  <span class="input-group-text">
                                    <i class="nc-icon nc-single-02"></i>
                                  </span>
                                </div>
                                <input type="text" class="form-control" placeholder="Name" />
                              </div>
                            </div>
                            <div class="col-md-6">
                              <label>Email</label>
                              <div class="input-group">
                                <div class="input-group-prepend">
                                  <span class="input-group-text">
                                    <i class="nc-icon nc-email-85"></i>
                                  </span>
                                </div>
                                <input type="text" class="form-control" placeholder="Email" />
                              </div>
                            </div>
                          </div>
                          <label>Message</label>
                          <textarea class="form-control" rows="4" placeholder="Tell us your thoughts and feelings..."></textarea>
                          <div class="row">
                            <div class="col-md-4 ml-auto mr-auto">
                              <button class="btn btn-danger btn-lg btn-fill">Send Message</button>
                            </div>
                          </div>
                        </form>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <Footer />
        </div>
      </div>
    </>
  );
}

export default Home;
