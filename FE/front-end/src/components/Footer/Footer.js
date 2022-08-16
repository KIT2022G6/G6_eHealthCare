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
import { Container } from "react-bootstrap";

class Footer extends Component {
  render() {
    return (
      <footer className="footer px-0 px-lg-3">
        <Container fluid>
          <section className="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
            <div className="me-5 d-none d-lg-block">
              <span>Kết nối với chúng tôi trên các mạng xã hội:</span>
            </div>

            <div>
              <a href="" className="me-4 text-reset">
                <i className="fab fa-facebook-f"></i>
              </a>
              <a href="" className="me-4 text-reset">
                <i className="fab fa-twitter"></i>
              </a>
              <a href="" className="me-4 text-reset">
                <i className="fab fa-google"></i>
              </a>
              <a href="" className="me-4 text-reset">
                <i className="fab fa-instagram"></i>
              </a>
              <a href="" className="me-4 text-reset">
                <i className="fab fa-linkedin"></i>
              </a>
              <a href="" className="me-4 text-reset">
                <i className="fab fa-github"></i>
              </a>
            </div>
          </section>

          <nav>
            <ul className="footer-menu">
              <li>
                <div class="widget-column footer-active-4">
                  <section id="text-3" class="widget widget_text">
                    <h4 class="widget-title">Về chúng tôi</h4>
                    <div class="textwidget"><br />
                      <p>
                        eHealthCare là chủ đề sức khỏe đáp ứng <br/>
                        cho các bác sĩ, bệnh viện, phòng khám y tế, <br/>
                        nhi khoa, nha khoa, phụ khoa, bác sĩ trị liệu <br/>
                        tổng quát và tất cả các trang web trung gian. <br/>
                        Hoàn thiện, trang web hiện đại và chuyên nghiệp <br/>
                        không có kiến ​​thức mã hóa. Tạo trang web của riêng <br/>
                        bạn dễ dàng hơn bao giờ hết với eHealthCare.
                      </p>
                    </div>
                  </section>
                </div>
              </li>

              <li>
                <div class="widget-column footer-active-4">
                  <section id="recent-posts-3" class="widget widget_recent_entries">
                    <h4 class="widget-title" className="text-center">Bài đăng gần đây</h4>
                    <ul><br />
                      <p>Aliquam mollis consequat est</p>
                      <p>Quisque pretium sodales arcu</p>
                      <p>Nibh dignissim ornare egestas</p>
                      <p>Donec pretium aliquet dapibus</p>
                    </ul>
                  </section>
                </div>
              </li>

              <li>
                <div class="widget-column footer-active-4">
                  <section id="text-2" class="widget widget_text">
                    <h4 class="widget-title" className="text-center">Giờ mở cửa</h4>
                    <div class="textwidget">
                      <ul><br />
                        <p> Thứ Hai - Thứ Sáu: 06:00 Sáng - 08:00 Chiều </p>
                        <p> Thứ Bảy: 08:00 sáng - 04:00 chiều </p>
                        <p> Chủ nhật: 10:00 sáng - 02:00 chiều </p>
                        <p> Khẩn cấp: (gọi cho chúng tôi bất cứ lúc nào) </p>
                      </ul>
                    </div>
                  </section>
                </div>
              </li>

              <li>
                <div class="widget-column footer-active-4">
                  <section id="search-3" class="widget widget_search">
                    <h4 class="widget-title" className="text-center">Liên hệ chúng tôi</h4>
                    <ul><br />
                      <p>
                        <i className="fas fa-home me-3"></i> 36 Hoàng Cầu, Q.Đống Đa, Hà
                        Nội
                      </p>
                      <p>
                        <i className="fas fa-envelope me-3"></i> eHealthCare@gmail.com.vn
                      </p>
                      <p>
                        <i className="fas fa-phone me-3"></i> + 01 234 567 88
                      </p>
                      <p className="text-center">
                        © {new Date().getFullYear()}{" "}, được thực hiện với tình yêu cho một web tốt hơn
                      </p>
                    </ul>
                  </section>
                </div>
              </li>
            </ul>
          </nav>
        </Container>
      </footer >
    );
  }
}

export default Footer;