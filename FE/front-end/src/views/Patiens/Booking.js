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

function Booking() {
    return (
        <>
            <Container fluid>
                <Row>
                    <Col md="8">
                        <Card>
                            <Card.Header>
                                <Card.Title as="h4">Booking</Card.Title>
                            </Card.Header>
                            <Card.Body>
                                <Form>
                                    <Row>
                                        <Col className="pr-1" md="6">
                                            <Form.Group>
                                                <label>Hello ...</label>
                                                <Form.Control
                                                    defaultValue="Luu Nguyen"
                                                    disabled
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
                                                        <th className="border-0">Full Name</th>
                                                        <th className="border-0">Room</th>
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
                                                                    <input type="radio" name="optionsRadios" id="optionsRadios1"/>
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
                                                                <input type="radio" name="optionsRadios" id="optionsRadios1"/>
                                                            </label>
                                                        </div></td>
                                                    </tr>
                                                </tbody>
                                            </Table>
                                        </Col>
                                    </Row>

                                    <Row>
                                        <Col md="12">
                                            <Form.Group>
                                                <label>Note</label>
                                                <Form.Control
                                                    cols="80"
                                                    defaultValue=""
                                                    placeholder="Here can be your description"
                                                    rows="4"
                                                    as="textarea"
                                                ></Form.Control>
                                            </Form.Group>
                                        </Col>
                                    </Row>
                                    <Button
                                        className="btn-fill pull-right"
                                        type="submit"
                                        variant="info"
                                    >
                                        Save
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
export default Booking;