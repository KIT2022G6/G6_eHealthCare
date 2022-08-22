import React, { useEffect, useState } from 'react'
import MedicalRecordService from '../../services/MedicalRecordService'
import { Link } from "react-router-dom";


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


const MedicalRecord = () => {
  const [data, setData] = useState();
  const [direction, setDirection] = useState(1);
  const [currentItems, setCurrentItems] = useState(null);
  const [pageCount, setPageCount] = useState(0);
  const [page, setPage] = useState(-1);
  const [searchTerm, setSearchTerm] = useState('');
  useEffect(() => {
    let url = 'http://localhost:8080/api/v1/department';
    console.log("url", url)
    // if (searchBook.length > 0) {
    //     url = url + '?search=' + searchBook;
    // }
    fetch(url)
      .then((res) => res.json())
      .then((data) => {
        setData(data);
        console.log('set data', data);
      })
  }, []);

  useEffect(() => {
    if (data != null) {
      setPage(0);
      console.log(page, 'set item offset');
    }
  }, [data]);

  useEffect(() => {
    if (data != null) {
      let itemsPerPage = 8;
      const starOffset = page * itemsPerPage;
      let endOffset = (page + 1) * itemsPerPage;
      if (endOffset > data.length) {
        endOffset = data.length;
      }
      setCurrentItems(data.slice(starOffset, endOffset));
      setPageCount(Math.ceil(data.length / itemsPerPage));
      window.scrollTo({
        top: 100,
        behavior: 'smooth',
      });
    }
  }, [page]);

  let listDepartment = [];
  if (currentItems != null) {
    listDepartment = currentItems.map((item, id) => (
      <tr>
        <td>{item.id}</td>
        <td>{item.depID}</td>
        {/* <td>{item.price}</td>
              <td>{item.category}</td>
              <td>{item.details_shorts}</td>
              <td>
                  <img src={item.image} style={{ height: "40px" }} />
              </td>
              <td>{item.publishingYear}</td>
              <td>{item.amount}</td>
              <td>
                  
              </td> */}

        {/*<td><Link to={'/book/' + item.id}><Button variant="outline-success">*/}
        {/*    Details*/}
        {/*</Button></Link></td>*/}
        <td><Link to="{'/edit/' + item.id}"><Button variant="outline-warning">
          Edit
        </Button></Link></td>
        <td><Button variant="outline-danger" onClick="{() => deleteUser(item.id)}">Delete</Button></td>
      </tr>
    )
    )
  };


  return (
    <>
      <Container fluid>
        <Row>
          <Col md="12">
            <Card className="strpied-tabled-with-hover">
              <Card.Header>
                <Card.Title as="h4">DS hồ sơ bệnh án</Card.Title>
              </Card.Header>
              <Card.Body className="table-full-width table-responsive px-0">
                <Form style={{ marginLeft: "33px" }}>
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
                <br></br>
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

export default MedicalRecord;





// function MedicalRecord() {
//   return (
//     <>
//       <Container fluid>
//         <Row>
//           <Col md="12">
//             <Card className="strpied-tabled-with-hover">
//               <Card.Header>
//                 <Card.Title as="h4">DS hồ sơ bệnh án</Card.Title>
//               </Card.Header>
//               <Card.Body className="table-full-width table-responsive px-0">
//                 <Form style={{ marginLeft: "33px" }}>
//                   <Row>
//                     <Col className="pr-1" md="4">
//                       <Form.Group>
//                         <label>Mã tra cứu</label>
//                         <Form.Control
//                           placeholder="xx x"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="pl-1" md="2"></Col>
//                     <Col className="pl-1" md="4">
//                       <Form.Group>
//                         <label>Ngày khám</label>
//                         <Form.Control
//                           type="date"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row><br></br>
//                   <Button
//                     className="btn-fill pull-right"
//                     type="submit"
//                     variant="info"
//                   >
//                     Tra cứu
//                   </Button>
//                 </Form>
//                 <br></br>
//                 <Table className="table-hover table-striped">
//                   <thead>
//                     <tr>
//                       <th className="border-0">STT</th>
//                       <th className="border-0">Mã hồ sơ</th>
//                       <th className="border-0">Khoa khám</th>
//                       <th className="border-0">Bác sĩ khám</th>
//                       <th className="border-0">Ngày khám</th>
//                       <th className="border-0">Chẩn đoán</th>
//                       <th className="border-0">Tiểu sử</th>
//                       <th className="border-0">Đơn thuốc</th>
//                     </tr>
//                   </thead>
//                   <tbody>
//                     <tr>
//                       <td>1</td>
//                       <td>ADM1</td>
//                       <td>Dakota Rice</td>
//                       <td>Dakota Rice</td>
//                       <td>20/01/2022</td>
//                       <td>$36,738</td>
//                       <td>$36,738</td>
//                       <td>
//                         <a>Xem chi tiết đơn thuốc</a>
//                       </td>
//                     </tr>
//                     <tr>
//                       <td>2</td>
//                       <td>ADM2</td>
//                       <td>Dakota Rice</td>
//                       <td>Dakota Rice</td>
//                       <td>20/01/2022</td>
//                       <td>$36,738</td>
//                       <td>$36,738</td>
//                       <td>
//                         <a>Xem chi tiết đơn thuốc</a>
//                       </td>
//                     </tr>
//                     <tr>
//                       <td>3</td>
//                       <td>ADM3</td>
//                       <td>Dakota Rice</td>
//                       <td>Dakota Rice</td>
//                       <td>20/01/2022</td>
//                       <td>$36,738</td>
//                       <td>$36,738</td>
//                       <td>
//                         <a>Xem chi tiết đơn thuốc</a>
//                       </td>
//                     </tr>
//                     <tr>
//                       <td>4</td>
//                       <td>ADM4</td>
//                       <td>Dakota Rice</td>
//                       <td>Dakota Rice</td>
//                       <td>20/01/2022</td>
//                       <td>$36,738</td>
//                       <td>$36,738</td>
//                       <td>
//                         <a>Xem chi tiết đơn thuốc</a>
//                       </td>
//                     </tr>
//                     <tr>
//                       <td>5</td>
//                       <td>ADM5</td>
//                       <td>Dakota Rice</td>
//                       <td>Dakota Rice</td>
//                       <td>20/01/2022</td>
//                       <td>$36,738</td>
//                       <td>$36,738</td>
//                       <td>
//                         <a>Xem chi tiết đơn thuốc</a>
//                       </td>
//                     </tr>
//                     <tr>
//                       <td>6</td>
//                       <td>ADM6</td>
//                       <td>Dakota Rice</td>
//                       <td>Dakota Rice</td>
//                       <td>20/01/2022</td>
//                       <td>$36,738</td>
//                       <td>$36,738</td>
//                       <td>
//                         <a>Xem chi tiết đơn thuốc</a>
//                       </td>
//                     </tr>
//                   </tbody>
//                 </Table>
//               </Card.Body>
//             </Card>
//           </Col>
//         </Row>
//       </Container>
//     </>
//   );
// }

// export default MedicalRecord;
