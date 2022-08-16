import React from "react";
import Table from 'react-bootstrap/Table';

// react-bootstrap components
import {
    Badge,
    Button,
    Card,
    Form,
    Navbar,
    Nav,
    Container,
    Row,
    Col
} from "react-bootstrap";

function MedicalRecord() {
    return (
        <>
            <Container fluid>
                <Row>
                    <Col md="8">
                        <Card>
                            <Card.Header>
                                <Card.Title as="h4">Tra cứu hồ sơ bệnh án</Card.Title>
                            </Card.Header>
                            <Card.Body>
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

                                <hr></hr>

                                <Table className="table-hover table-striped">
                                    <thead>
                                        <tr>
                                            <th className="border-0">#</th>
                                            <th className="border-0">Mã hóa đơn</th>
                                            <th className="border-0">Ngày khám</th>
                                            <th className="border-0">Chi tiết</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>xx-xx</td>
                                            <td>03/08/2022</td>
                                            <td>button</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>xx-xx</td>
                                            <td>03/08/2022</td>
                                            <td>button</td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>xx-xx</td>
                                            <td>03/08/2022</td>
                                            <td>button</td>
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
export default MedicalRecord;