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
                                NLTDH RESTAURANT mong mu???n tr??? th??nh kh??ng ch??? l?? m???t c?? s??? ??n u???ng cao c???p hay m???t qu???y bar ph???c v??? cocktail hi???n ?????i.
                                N???n t???ng c???a ch??ng t??i ???????c l???y c???m h???ng t??? ch??nh ngu???n c???m h???ng.
                                ???? l?? ?????ng l???c ????? t??m ki???m v??? ?????p b???t c??? n??i n??o n?? c?? th??? ???n.
                                Nh??ng vi???c theo ??u???i c??i ?????p l?? hi???u ???????c qu?? tr??nh ?????ng sau n??.
                                H??nh tr??nh t??? con s??? kh??ng ?????n s??? ho??n h???o. V?? ???? l?? nh???ng g?? ch??ng t??i c??? g???ng ?????t ???????c ??? ????y.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container-fluid" style={{ backgroundColor: '#fff', height: 'auto' }}>
                <section style={{ paddingTop: "7rem" }} />
                <font style={{ verticalAlign: "inherit" }}>
                    <p style={{ color: "#2A606D", fontWeight: "bold", textAlign: "center", fontSize: "32px" }}>C?? g?? m???i</p>
                </font>
                <div className="row mb-3">
                    <div className="col-md-6">
                        <div class="container">
                            <img src={anhnhat} className="rounded-circle rounded mx-auto d-block p-5 img-fluid" style={{ width: '60%', height: undefined, aspectRatio: 1 / 1, }}></img>
                        </div>
                        <p style={{ fontWeight: "bold", fontSize: "32px" }} className="text-center "> NLTDH RESTAURANT gi???i thi???u c??ng <br /> th???c n???u ??n m???i kh??ng bi??n gi???i </p>
                        <p style={{ fontSize: "24px", justifyContent: "left" }} className="text-center ">Tr???i nghi???m ???m th???c t???i nh?? h??ng NLTDH RESTAURANT <br /> c?? l??? s??? th???a l??ng mong ?????i c???a th???c kh??ch ... </p>
                        <div class="d-grid gap-2 col-6 mx-auto">
                            <button type="button" class="btn btn-outline-warning" style={{ fontSize: "24px" }}>Xem ti???p</button>
                        </div>
                    </div>
                    <div className="col-md-6">
                        <div class="container">
                            <img src={anhnhat2} className="rounded-circle rounded mx-auto d-block p-5 img-fluid" style={{ width: '60%', height: undefined, aspectRatio: 1 / 1, }}></img>
                        </div>
                        <p style={{ fontWeight: "bold", fontSize: "32px" }} className="text-center "> NLTDH RESTAURANT: t??? ????? s??n m??i <br />?????n th????ng hi???u phong c??ch s???ng</p>
                        <p style={{ fontSize: "24px", justifyContent: "left" }} className="text-center ">  Nh???m mang ?????n nhi???u tr???i nghi???m phong c??ch <br /> s???ng cho kh??ch h??ng, Hanoia s??? ra m???t La Table ... </p>
                        <div class="d-grid gap-2 col-6 mx-auto">
                            <button type="button" class="btn btn-outline-warning" style={{ fontSize: "24px" }}>Xem ti???p</button>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}
export default Home;