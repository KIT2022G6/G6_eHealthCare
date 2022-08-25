import { Badge, Button, Card, Form, Navbar, Nav, Container, Row, Col, Table } from "react-bootstrap";
import React, { useEffect, useState } from 'react';
import { Link } from "react-router-dom";
// import ReactPaginate from "react-paginate";
function Department() {


    return (
        <div className="container">
            <Row>
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
                                            <td className="border-0">{department.id}</td>
                                            <td className="border-0">{department.dName}</td>
                                            <td className="border-0">{department.dCharge}</td>
                                            <td className="border-0">{department.dDes}</td>
                                            <td className="border-0">{department.listDoctor}</td>
                                            <td><i class="fa fa-edit" aria-hidden="true"></i></td>
                                            <td><i class="fa fa-trash" aria-hidden="true"></i></td>
                                        </tr>

                                    </tbody>
                                </Table>
                            </Card.Body>
                        </Card>
                    </Col>
                </Row>
            </Container>
        </div>
    )
}

export default Department;