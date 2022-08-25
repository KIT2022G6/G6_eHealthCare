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

function MakeMedicalRecords() {
    return (
        <>
            <Container fluid>
                <Row>
                    <Col md="12">
                        <Card className="strpied-tabled-with-hover">
                            <Card.Header>
                                <Card.Title as="h4" className="text-center">Hồ sơ bệnh án</Card.Title>
                            </Card.Header>
                            <Card.Body>
                                <Form>
                                    <h4>Thông tin cá nhân của bệnh nhân</h4>
                                    <Row>
                                        <Col className="pr-1" md="6">
                                            <Form.Group>
                                                <label>Họ</label>
                                                <Form.Control
                                                    defaultValue="Mike"
                                                    placeholder="Company"
                                                    type="text"
                                                ></Form.Control>
                                            </Form.Group>
                                        </Col>
                                        <Col className="pl-1" md="6">
                                            <Form.Group>
                                                <label>Tên</label>
                                                <Form.Control
                                                    defaultValue="Andrew"
                                                    placeholder="Last Name"
                                                    type="text"
                                                ></Form.Control>
                                            </Form.Group>
                                        </Col>
                                    </Row>

                                    <Row>
                                        <Col className="pr-1" md="6">
                                            <Form.Group>
                                                <label>Mã bệnh nhân</label>
                                                <Form.Control
                                                    defaultValue="Mike"
                                                    placeholder="Company"
                                                    type="text"
                                                ></Form.Control>
                                            </Form.Group>
                                        </Col>
                                        <Col className="pl-1" md="6">
                                            <Form.Group>
                                                <label>Tuổi</label>
                                                <Form.Control
                                                    defaultValue="Andrew"
                                                    placeholder="Last Name"
                                                    type="text"
                                                ></Form.Control>
                                            </Form.Group>
                                        </Col>
                                    </Row>
                                    <br></br>
                                    <h4>Mời lựa chọn các thông tin bên dưới</h4>
                                    <Row>
                                        <Col md="12">
                                            <label>Danh sách khoa</label>
                                            <Form.Group>
                                                <select class="form-control">
                                                    <option>Khoa 1</option>
                                                    <option>Khoa 2</option>
                                                    <option>Khoa 3</option>
                                                    <option>Khoa 4</option>
                                                    <option>Khoa 5</option>
                                                </select>
                                            </Form.Group>
                                        </Col>
                                    </Row>

                                    <Row>
                                        <Col md="12">
                                            <label>Danh sách bác sĩ</label>
                                            <Table striped>
                                                <thead>
                                                    <tr>
                                                        <th className="border-0">#</th>
                                                        <th className="border-0">Họ và tên</th>
                                                        <th className="border-0">Khoa</th>
                                                        <th className="border-0">Số người chờ</th>
                                                        <th className="border-0">Chọn bác sĩ này</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td>1</td>
                                                        <td>Nguyen</td>
                                                        <td>1</td>
                                                        <td>11</td>
                                                        <td>
                                                            <div class="radio">
                                                                <label>
                                                                    <input type="radio" name="optionsRadios" id="optionsRadios1" />
                                                                </label>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>2</td>
                                                        <td>Nguyen2</td>
                                                        <td>2</td>
                                                        <td>12</td>
                                                        <td><div class="radio">
                                                            <label>
                                                                <input type="radio" name="optionsRadios" id="optionsRadios1" />
                                                            </label>
                                                        </div></td>
                                                    </tr>
                                                    <tr>
                                                        <td>3</td>
                                                        <td>Nguyen3</td>
                                                        <td>3</td>
                                                        <td>13</td>
                                                        <td><div class="radio">
                                                            <label>
                                                                <input type="radio" name="optionsRadios" id="optionsRadios1" />
                                                            </label>
                                                        </div></td>
                                                    </tr>
                                                </tbody>
                                            </Table>
                                        </Col>
                                    </Row>
                                    <h4>Chuẩn đoán bệnh</h4>
                                    <Row>
                                        <Col md="12">
                                            <Form.Control
                                                cols="80"
                                                defaultValue=""
                                                placeholder="Here can be your description"
                                                rows="4"
                                                as="textarea"
                                            ></Form.Control>
                                        </Col>
                                    </Row>
                                    <br></br>
                                    <Button
                                        className="btn-fill pull-right"
                                        type="submit"
                                        variant="info"
                                    >
                                        Thêm đơn thuốc
                                    </Button>
                                    &nbsp;&nbsp;&nbsp;
                                    <Button
                                        className="btn-fill pull-right"
                                        type="submit"
                                        variant="info"
                                    >
                                        Thêm hồ sơ mới
                                    </Button>
                                    <div className="clearfix"></div>
                                </Form>
                            </Card.Body>
                        </Card>
                    </Col>

                </Row>
            </Container>
        </>
    );
}
export default MakeMedicalRecords;