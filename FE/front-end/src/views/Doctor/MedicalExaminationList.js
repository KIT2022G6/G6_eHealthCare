import React from "react";

// react-bootstrap components
import {
  Badge,
  Button,
  Card,
  Navbar,
  Nav,
  Table,
  Container,
  Row,
  Col,
} from "react-bootstrap";

function MedicalExaminationList() {
  return (
    <>
      <Container fluid>
        <Row>
          <Col md="12">
            <Card className="strpied-tabled-with-hover">
              <Card.Header>
                <Card.Title as="h4">DS Lịch khám bệnh</Card.Title>
              </Card.Header>
              <Card.Body className="table-full-width table-responsive px-0">
                <Table className="table-hover table-striped">
                  <thead>
                    <tr>
                      <th className="border-0">ID</th>
                      <th className="border-0">Code Medicine</th>
                      <th className="border-0">Name</th>
                      <th className="border-0">Expiry</th>
                      <th className="border-0">Price</th>
                      <th className="border-0">Inventory</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1</td>
                      <td>ADM1</td>
                      <td>Dakota Rice</td>
                      <td>20/01/2022</td>
                      <td>$36,738</td>
                      <td>100</td>
                    </tr>
                    <tr>
                      <td>2</td>
                      <td>ADM2</td>
                      <td>Dakota Rice</td>
                      <td>20/01/2022</td>
                      <td>$36,738</td>
                      <td>100</td>
                    </tr>
                    <tr>
                      <td>3</td>
                      <td>ADM3</td>
                      <td>Dakota Rice</td>
                      <td>20/01/2022</td>
                      <td>$36,738</td>
                      <td>100</td>
                    </tr>
                    <tr>
                      <td>4</td>
                      <td>ADM4</td>
                      <td>Dakota Rice</td>
                      <td>20/01/2022</td>
                      <td>$36,738</td>
                      <td>100</td>
                    </tr>
                    <tr>
                      <td>5</td>
                      <td>ADM5</td>
                      <td>Dakota Rice</td>
                      <td>20/01/2022</td>
                      <td>$36,738</td>
                      <td>100</td>
                    </tr>
                    <tr>
                      <td>6</td>
                      <td>ADM6</td>
                      <td>Dakota Rice</td>
                      <td>20/01/2022</td>
                      <td>$36,738</td>
                      <td>100</td>
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

export default MedicalExaminationList;
