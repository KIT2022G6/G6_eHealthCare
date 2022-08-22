import React from "react";

// react-bootstrap components
import {
    Badge,
    Button,
    Card,
    Form,
    Navbar,
    Nav,
    Table,
    Container,
    Row,
    Col,
} from "react-bootstrap";

function History() {
    return (
        <>
            <Container fluid>
                <Row>
                    <Col md="12">
                        <Card className="strpied-tabled-with-hover">
                            <Card.Header>
                                <Card.Title as="h4">Lịch sử khám bệnh</Card.Title>
                            </Card.Header>
                            <Card.Body className="table-full-width table-responsive px-0">
                                <Form>
                                    <Row>
                                        <Col className="pr-1" md="4">
                                            <Form.Group>
                                                <label>Mã tra cứu</label>
                                                <Form.Control
                                                    placeholder="xx x"
                                                    type="text"
                                                ></Form.Control>
                                            </Form.Group>
                                        </Col>
                                        <Col className="pl-1" md="2"></Col>
                                        <Col className="pl-1" md="4">
                                            <Form.Group>
                                                <label>Ngày khám</label>
                                                <Form.Control
                                                    type="date"
                                                ></Form.Control>
                                            </Form.Group>
                                        </Col>
                                    </Row><br></br>
                                    <Button
                                        className="btn-fill pull-right"
                                        type="submit"
                                        variant="info"
                                    >
                                        Tra cứu
                                    </Button>
                                </Form>

                                <Table className="table-hover table-striped">
                                    <thead>
                                        <tr>
                                            <th className="border-0">STT</th>
                                            <th className="border-0">Mã hồ sơ</th>
                                            <th className="border-0">Khoa khám</th>
                                            <th className="border-0">Bác sĩ khám</th>
                                            <th className="border-0">Ngày khám</th>
                                            <th className="border-0">Chẩn đoán</th>
                                            <th className="border-0">Tiểu sử</th>
                                            <th className="border-0">Đơn thuốc</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>ADM1</td>
                                            <td>Dakota Rice</td>
                                            <td>Dakota Rice</td>
                                            <td>20/01/2022</td>
                                            <td>$36,738</td>
                                            <td>$36,738</td>
                                            <td>
                                                <a>Xem chi tiết đơn thuốc</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>ADM2</td>
                                            <td>Dakota Rice</td>
                                            <td>Dakota Rice</td>
                                            <td>20/01/2022</td>
                                            <td>$36,738</td>
                                            <td>$36,738</td>
                                            <td>
                                                <a>Xem chi tiết đơn thuốc</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>ADM3</td>
                                            <td>Dakota Rice</td>
                                            <td>Dakota Rice</td>
                                            <td>20/01/2022</td>
                                            <td>$36,738</td>
                                            <td>$36,738</td>
                                            <td>
                                                <a>Xem chi tiết đơn thuốc</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>4</td>
                                            <td>ADM4</td>
                                            <td>Dakota Rice</td>
                                            <td>Dakota Rice</td>
                                            <td>20/01/2022</td>
                                            <td>$36,738</td>
                                            <td>$36,738</td>
                                            <td>
                                                <a>Xem chi tiết đơn thuốc</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>5</td>
                                            <td>ADM5</td>
                                            <td>Dakota Rice</td>
                                            <td>Dakota Rice</td>
                                            <td>20/01/2022</td>
                                            <td>$36,738</td>
                                            <td>$36,738</td>
                                            <td>
                                                <a>Xem chi tiết đơn thuốc</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>6</td>
                                            <td>ADM6</td>
                                            <td>Dakota Rice</td>
                                            <td>Dakota Rice</td>
                                            <td>20/01/2022</td>
                                            <td>$36,738</td>
                                            <td>$36,738</td>
                                            <td>
                                                <a>Xem chi tiết đơn thuốc</a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </Table>
                            </Card.Body>
                        </Card>
                    </Col>
                </Row>
            </Container>
        </>
    );
}

export default History;
