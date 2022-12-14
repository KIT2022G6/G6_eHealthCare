import React, { Component } from "react";
import { useLocation, Route, Switch } from "react-router-dom";

import AdminNavbar from "components/Navbars/AdminNavbar";
import Footer from "components/Footer/Footer";

import routes from "routes.js";

function Home() {
    return (
        <>
            <div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                    <div class="carousel-item active" data-bs-interval="10000}">
                        <img src={anh1} class="d-block w-100" alt="..." />
                    </div>
                    <div class="carousel-item" data-bs-interval="2000">
                        <img src={anh2} class="d-block w-100" alt="..." />
                    </div>
                    <div class="carousel-item">
                        <img src={daubep} class="d-block w-100" alt="..." />
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
            <div class="container-fluid" style={{ backgroundColor: '#E3DBD7', height: 'auto' }}>
                <div className="row">
                    <div className="rounded float-right col-md-4">
                        <img src={chicken} alt=".." className='rounded mx-auto d-block mt-5 mb-5' style={{ width: "100%" }}></img>
                    </div>
                    <div class="col-ms-12 col-md-8">
                        <div class="container-fluid" style={{ paddingTop: "auto", margin: "auto" }}>
                            <p class="text-start mt-5 fs-3 ">
                                NLTDH RESTAURANT mong muốn trở thành không chỉ là một cơ sở ăn uống cao cấp hay một quầy bar phục vụ cocktail hiện đại.
                                Nền tảng của chúng tôi được lấy cảm hứng từ chính nguồn cảm hứng.
                                Đó là động lực để tìm kiếm vẻ đẹp bất cứ nơi nào nó có thể ẩn.
                                Nhưng việc theo đuổi cái đẹp là hiểu được quá trình đằng sau nó.
                                Hành trình từ con số không đến sự hoàn hảo. Và đó là những gì chúng tôi cố gắng đạt được ở đây.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container-fluid" style={{ backgroundColor: '#fff', height: 'auto' }}>
                <section style={{ paddingTop: "7rem" }} />
                <font style={{ verticalAlign: "inherit" }}>
                    <p style={{ color: "#2A606D", fontWeight: "bold", textAlign: "center", fontSize: "32px" }}>Có gì mới</p>
                </font>
                <div className="row mb-3">
                    <div className="col-md-6">
                        <div class="container">
                            <img src={anhnhat} className="rounded-circle rounded mx-auto d-block p-5 img-fluid" style={{ width: '60%', height: undefined, aspectRatio: 1 / 1, }}></img>
                        </div>
                        <p style={{ fontWeight: "bold", fontSize: "32px" }} className="text-center "> NLTDH RESTAURANT giới thiệu công <br /> thức nấu ăn mới không biên giới </p>
                        <p style={{ fontSize: "24px", justifyContent: "left" }} className="text-center ">Trải nghiệm ẩm thực tại nhà hàng NLTDH RESTAURANT <br /> có lẽ sẽ thỏa lòng mong đợi của thực khách ... </p>
                        <div class="d-grid gap-2 col-6 mx-auto">
                            <button type="button" class="btn btn-outline-warning" style={{ fontSize: "24px" }}>Xem tiếp</button>
                        </div>
                    </div>
                    <div className="col-md-6">
                        <div class="container">
                            <img src={anhnhat2} className="rounded-circle rounded mx-auto d-block p-5 img-fluid" style={{ width: '60%', height: undefined, aspectRatio: 1 / 1, }}></img>
                        </div>
                        <p style={{ fontWeight: "bold", fontSize: "32px" }} className="text-center "> NLTDH RESTAURANT: từ đồ sơn mài <br />đến thương hiệu phong cách sống</p>
                        <p style={{ fontSize: "24px", justifyContent: "left" }} className="text-center ">  Nhằm mang đến nhiều trải nghiệm phong cách <br /> sống cho khách hàng, Hanoia sẽ ra mắt La Table ... </p>
                        <div class="d-grid gap-2 col-6 mx-auto">
                            <button type="button" class="btn btn-outline-warning" style={{ fontSize: "24px" }}>Xem tiếp</button>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}
export default Home;