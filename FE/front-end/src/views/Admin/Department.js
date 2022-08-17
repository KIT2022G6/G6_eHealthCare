import { Badge, Button, Card, Form, Navbar, Nav, Container, Row, Col, Table } from "react-bootstrap";
import React, { useEffect, useState } from 'react';
import { Link } from "react-router-dom";
// import ReactPaginate from "react-paginate";
function Department() {
    return (
        <div className="container">
            <Row>
                {/* <Col xs={12} md={6}>

                    <div className="container">
                        <form className="form-inline">
                            <div className="input-group">
                                <input
                                    type="text"
                                    className="form-control"
                                    size="50"
                                    placeholder="Search"
                                    value={searchTerm}
                                    onChange={(e) => setSearchTerm(e.target.value)}
                                />
                                <button
                                    type="button"
                                    className="btn btn-info"
                                    onClick={doSearch}
                                >
                                    Search
                                </button>
                            </div>
                        </form>
                    </div>
                </Col> */}
                <Col xs={10} md={6} className="text-end">
                    <Link to='#'>
                        <Button variant="outline-info" className="mb-5">
                            Thêm mới khoa khám
                        </Button>
                    </Link>
                </Col>
            </Row>

            <Container fluid>
                <Row>
                    <Col md="12">
                        <Card className="strpied-tabled-with-hover">
                            <Card.Header>
                                <Card.Title as="h4">Danh sách khoa khám</Card.Title>
                                {/* <p className="card-category">
                                    Dữ liệu cập nhật mới nhất...
                                </p> */}
                            </Card.Header>
                            <Card.Body className="table-full-width table-responsive px-0">
                                <Table className="table-hover table-striped">
                                    <thead>
                                        <tr>
                                            <th className="border-0">STT</th>
                                            <th className="border-0">Mã khoa khám</th>
                                            <th className="border-0">Tên khoa</th>
                                            <th className="border-0">Phí khám</th>
                                            <th className="border-0">Mô tả</th>
                                            <th colSpan={2}>More</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>ADM1</td>
                                            <td>Dakota Rice</td>
                                            <td>$36,738</td>
                                            <td>Khoa chữa bệnh cho bác sĩ khoa khác</td>
                                            <td><i class="fa fa-edit" aria-hidden="true"></i></td>
                                            <td><i class="fa fa-trash" aria-hidden="true"></i></td>

                                            {/* <td><Link to={'/edit/' + item.id}><Button variant="outline-warning">
                                                Edit
                                            </Button></Link></td>
                                            <td><Button variant="outline-danger" onClick={() => deleteUser(item.id)}>Delete</Button></td> */}
                                        </tr>

                                    </tbody>
                                </Table>
                            </Card.Body>
                        </Card>
                    </Col>
                </Row>
            </Container>


            {/* <ReactPaginate
                previousLabel="Previous"
                nextLabel="Next"
                pageClassName="page-item"
                pageLinkClassName="page-link"
                previousClassName="page-item"
                previousLinkClassName="page-link"
                nextClassName="page-item"
                nextLinkClassName="page-link"
                breakLabel="..."
                breakClassName="page-item"
                breakLinkClassName="page-link"
                pageCount={pageCount}
                marginPagesDisplayed={2}
                pageRangeDisplayed={5}
                onPageChange={handlePageClick}
                containerClassName="pagination"
                activeClassName="active"
                forcePage={10}
            /> */}
        </div>
    )
}

export default Department;