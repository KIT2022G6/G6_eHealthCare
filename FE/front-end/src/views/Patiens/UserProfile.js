import React from "react";

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

function User() {
  return (
    <>
      <Container fluid>
        <Row>
          <Col md="8">
            <Card>
              <Card.Header>
                <Card.Title as="h4">Edit Profile</Card.Title>
              </Card.Header>
              <Card.Body>
                <Form>
                  <Row>
                    <Col className="pr-1" md="6">
                      <Form.Group>
                        <label>First Name</label>
                        <Form.Control
                          defaultValue="Luu"
                          placeholder="First Name"
                          type="text"
                        ></Form.Control>
                      </Form.Group>
                    </Col>
                    <Col className="pl-1" md="6">
                      <Form.Group>
                        <label>Last Name</label>
                        <Form.Control
                          defaultValue="Nguyen"
                          placeholder="Last Name"
                          type="text"
                        ></Form.Control>
                      </Form.Group>
                    </Col>
                  </Row>

                  <Row>
                    <Col className="pr-1" md="6">
                      <Form.Group>
                        <div class="form-check">
                          <label>Gender</label>
                          <Row>
                            <Col xs={6}><div className="form-chec">
                              <input className="form-check-input" type="radio" name="flexRadioDefault" />
                              <label className="form-check-label" style={{ paddingLeft: "9px" }}>
                                Male
                              </label>
                            </div></Col>
                            <Col xs={6}><div className="form-chec">
                              <input className="form-check-input" type="radio" name="flexRadioDefault" />
                              <label className="form-check-label" style={{ paddingLeft: "9px" }}>
                                Female
                              </label>
                            </div></Col>
                          </Row>
                        </div>
                      </Form.Group>
                    </Col>
                    <Col className="pl-1" md="6">
                      <Form.Group>
                        <label>DOB</label>
                        <Form.Control
                          type="date"
                        ></Form.Control>
                      </Form.Group>
                    </Col>
                  </Row>

                  <Row>
                    <Col md="12">
                      <Form.Group>
                        <label>Address</label>
                        <Form.Control
                          defaultValue="Mỹ Đình"
                          placeholder="Home Address"
                          type="text"
                        ></Form.Control>
                      </Form.Group>
                    </Col>
                  </Row>

                  <Row>
                    <Col className="pr-1" md="4">
                      <Form.Group>
                        <label>Phone</label>
                        <Form.Control
                          placeholder="Phone"
                          type="text"
                        ></Form.Control>
                      </Form.Group>
                    </Col>
                    <Col className="px-1" md="4">
                      <Form.Group>
                        <label>Country</label>
                        <Form.Control
                          placeholder="Country"
                          type="text"
                        ></Form.Control>
                      </Form.Group>
                    </Col>
                  </Row>

                  <Row>
                    <Col className="pr-1" md="4">
                      <Form>
                        <label>Rhesus</label>
                        <Row>
                          <Col xs={6}><div className="form-chec">
                            <input className="form-check-input" type="radio" name="flexRadioDefault" />
                            <label className="form-check-label" style={{ paddingLeft: "9px" }}>
                              A
                            </label>
                          </div></Col>
                          <Col xs={6}><div className="form-chec">
                            <input className="form-check-input" type="radio" name="flexRadioDefault" />
                            <label className="form-check-label" style={{ paddingLeft: "9px" }}>
                              B
                            </label>
                          </div></Col>
                          <Col xs={6}><div className="form-chec">
                            <input className="form-check-input" type="radio" name="flexRadioDefault" />
                            <label className="form-check-label" style={{ paddingLeft: "9px" }}>
                              AB
                            </label>
                          </div></Col>
                          <Col xs={6}><div className="form-chec">
                            <input className="form-check-input" type="radio" name="flexRadioDefault" />
                            <label className="form-check-label" style={{ paddingLeft: "9px" }}>
                              O
                            </label>
                          </div></Col>
                        </Row>
                      </Form>
                    </Col>
                    <Col className="px-1" md="4">
                      <Form.Group>
                        <label>Rhesus</label>
                        <Row>
                          <Col xs={6}><div className="form-chec">
                            <input className="form-check-input" type="radio" name="flexRadioDefault" />
                            <label className="form-check-label" style={{ paddingLeft: "9px" }}>
                              RH+
                            </label>
                          </div></Col>
                          <Col xs={6}><div className="form-chec">
                            <input className="form-check-input" type="radio" name="flexRadioDefault" />
                            <label className="form-check-label" style={{ paddingLeft: "9px" }}>
                              RH-
                            </label>
                          </div></Col>
                        </Row>
                      </Form.Group>
                    </Col>
                  </Row>

                  <Row>
                    <Col>
                      <Form.Group>
                        <label>Weight</label>
                        <div class="input-group mb-6">
                          <input type="text" class="form-control" />
                          <span class="input-group-text">cm</span>
                        </div>
                      </Form.Group>
                    </Col>
                    <Col>
                      <Form.Group>
                        <label>Weight</label>
                        <div class="input-group mb-6">
                          <input type="text" class="form-control" />
                          <span class="input-group-text">kg</span>
                        </div>
                      </Form.Group>
                    </Col>
                    <Col>
                      <Form.Group>
                        <label>Heart rate</label>
                        <div class="input-group mb-6">
                          <input type="text" class="form-control" />
                          <span class="input-group-text">bpm</span>
                        </div>
                      </Form.Group>
                    </Col>
                  </Row>



                  <Row>
                    <Col md="12">
                      <Form.Group>
                        <label>About Me</label>
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
                    Update Profile
                  </Button>
                  <div className="clearfix"></div>
                </Form>
              </Card.Body>
            </Card>
          </Col>
          <Col md="4">
            <Card className="card-user">
              <div className="card-image">
                <img
                  alt="..."
                  src={require("assets/img/photo-1431578500526-4d9613015464.jpeg")}
                ></img>
              </div>
              <Card.Body>
                <div className="author">
                  <a href="#pablo" onClick={(e) => e.preventDefault()}>
                    <img
                      alt="..."
                      className="avatar border-gray"
                      src={require("assets/img/faces/face-3.jpg")}
                    ></img>
                    <h5 className="title">Nguyen2</h5>
                  </a>
                  <p className="description">michael24</p>
                </div>
                <p className="description text-center">
                  "Lamborghini Mercy <br></br>
                  Your chick she so thirsty <br></br>
                  I'm in that two seat Lambo"
                </p>
              </Card.Body>
              <hr></hr>
              <div className="button-container mr-auto ml-auto">
                <Button
                  className="btn-simple btn-icon"
                  href="#pablo"
                  onClick={(e) => e.preventDefault()}
                  variant="link"
                >
                  <i className="fab fa-facebook-square"></i>
                </Button>
                <Button
                  className="btn-simple btn-icon"
                  href="#pablo"
                  onClick={(e) => e.preventDefault()}
                  variant="link"
                >
                  <i className="fab fa-twitter"></i>
                </Button>
                <Button
                  className="btn-simple btn-icon"
                  href="#pablo"
                  onClick={(e) => e.preventDefault()}
                  variant="link"
                >
                  <i className="fab fa-google-plus-square"></i>
                </Button>
              </div>
            </Card>
          </Col>
        </Row>
      </Container>
    </>
  );
}
export default User;



//mẫu
// import React from "react";

// // react-bootstrap components
// import {
//   Badge,
//   Button,
//   Card,
//   Form,
//   Navbar,
//   Nav,
//   Container,
//   Row,
//   Col
// } from "react-bootstrap";

// function User() {
//   return (
//     <>
//       <Container fluid>
//         <Row>
//           <Col md="8">
//             <Card>
//               <Card.Header>
//                 <Card.Title as="h4">Edit Profile</Card.Title>
//               </Card.Header>
//               <Card.Body>
//                 <Form>
//                   <Row>
//                     <Col className="pr-1" md="5">
//                       <Form.Group>
//                         <label>Company (disabled)</label>
//                         <Form.Control
//                           defaultValue="Creative Code Inc."
//                           disabled
//                           placeholder="Company"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="px-1" md="3">
//                       <Form.Group>
//                         <label>Username</label>
//                         <Form.Control
//                           defaultValue="michael23"
//                           placeholder="Username"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="pl-1" md="4">
//                       <Form.Group>
//                         <label htmlFor="exampleInputEmail1">
//                           Email address
//                         </label>
//                         <Form.Control
//                           placeholder="Email"
//                           type="email"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Row>
//                     <Col className="pr-1" md="6">
//                       <Form.Group>
//                         <label>First Name</label>
//                         <Form.Control
//                           defaultValue="Mike"
//                           placeholder="Company"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="pl-1" md="6">
//                       <Form.Group>
//                         <label>Last Name</label>
//                         <Form.Control
//                           defaultValue="Andrew"
//                           placeholder="Last Name"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Row>
//                     <Col md="12">
//                       <Form.Group>
//                         <label>Address</label>
//                         <Form.Control
//                           defaultValue="Bld Mihail Kogalniceanu, nr. 8 Bl 1, Sc 1, Ap 09"
//                           placeholder="Home Address"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Row>
//                     <Col className="pr-1" md="4">
//                       <Form.Group>
//                         <label>City</label>
//                         <Form.Control
//                           defaultValue="Mike"
//                           placeholder="City"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="px-1" md="4">
//                       <Form.Group>
//                         <label>Country</label>
//                         <Form.Control
//                           defaultValue="Andrew"
//                           placeholder="Country"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="pl-1" md="4">
//                       <Form.Group>
//                         <label>Postal Code</label>
//                         <Form.Control
//                           placeholder="ZIP Code"
//                           type="number"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Row>
//                     <Col md="12">
//                       <Form.Group>
//                         <label>About Me</label>
//                         <Form.Control
//                           cols="80"
//                           defaultValue="Lamborghini Mercy, Your chick she so thirsty, I'm in
//                           that two seat Lambo."
//                           placeholder="Here can be your description"
//                           rows="4"
//                           as="textarea"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Button
//                     className="btn-fill pull-right"
//                     type="submit"
//                     variant="info"
//                   >
//                     Update Profile
//                   </Button>
//                   <div className="clearfix"></div>
//                 </Form>
//               </Card.Body>
//             </Card>
//           </Col>
//           <Col md="4">
//             <Card className="card-user">
//               <div className="card-image">
//                 <img
//                   alt="..."
//                   src={require("assets/img/photo-1431578500526-4d9613015464.jpeg")}
//                 ></img>
//               </div>
//               <Card.Body>
//                 <div className="author">
//                   <a href="#pablo" onClick={(e) => e.preventDefault()}>
//                     <img
//                       alt="..."
//                       className="avatar border-gray"
//                       src={require("assets/img/faces/face-3.jpg")}
//                     ></img>
//                     <h5 className="title">Mike Andrew</h5>
//                   </a>
//                   <p className="description">michael24</p>
//                 </div>
//                 <p className="description text-center">
//                   "Lamborghini Mercy <br></br>
//                   Your chick she so thirsty <br></br>
//                   I'm in that two seat Lambo"
//                 </p>
//               </Card.Body>
//               <hr></hr>
//               <div className="button-container mr-auto ml-auto">
//                 <Button
//                   className="btn-simple btn-icon"
//                   href="#pablo"
//                   onClick={(e) => e.preventDefault()}
//                   variant="link"
//                 >
//                   <i className="fab fa-facebook-square"></i>
//                 </Button>
//                 <Button
//                   className="btn-simple btn-icon"
//                   href="#pablo"
//                   onClick={(e) => e.preventDefault()}
//                   variant="link"
//                 >
//                   <i className="fab fa-twitter"></i>
//                 </Button>
//                 <Button
//                   className="btn-simple btn-icon"
//                   href="#pablo"
//                   onClick={(e) => e.preventDefault()}
//                   variant="link"
//                 >
//                   <i className="fab fa-google-plus-square"></i>
//                 </Button>
//               </div>
//             </Card>
//           </Col>
//         </Row>
//       </Container>
//     </>
//   );
// }

// export default User;






//Mẫu
// import React from "react";

// // react-bootstrap components
// import {
//   Badge,
//   Button,
//   Card,
//   Form,
//   Navbar,
//   Nav,
//   Container,
//   Row,
//   Col
// } from "react-bootstrap";

// function User() {
//   return (
//     <>
//       <Container fluid>
//         <Row>
//           <Col md="8">
//             <Card>
//               <Card.Header>
//                 <Card.Title as="h4">Edit Profile</Card.Title>
//               </Card.Header>
//               <Card.Body>
//                 <Form>
//                   <Row>
//                     <Col className="pr-1" md="5">
//                       <Form.Group>
//                         <label>Company (disabled)</label>
//                         <Form.Control
//                           defaultValue="Creative Code Inc."
//                           disabled
//                           placeholder="Company"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="px-1" md="3">
//                       <Form.Group>
//                         <label>Username</label>
//                         <Form.Control
//                           defaultValue="michael23"
//                           placeholder="Username"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="pl-1" md="4">
//                       <Form.Group>
//                         <label htmlFor="exampleInputEmail1">
//                           Email address
//                         </label>
//                         <Form.Control
//                           placeholder="Email"
//                           type="email"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Row>
//                     <Col className="pr-1" md="6">
//                       <Form.Group>
//                         <label>First Name</label>
//                         <Form.Control
//                           defaultValue="Mike"
//                           placeholder="Company"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="pl-1" md="6">
//                       <Form.Group>
//                         <label>Last Name</label>
//                         <Form.Control
//                           defaultValue="Andrew"
//                           placeholder="Last Name"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Row>
//                     <Col md="12">
//                       <Form.Group>
//                         <label>Address</label>
//                         <Form.Control
//                           defaultValue="Bld Mihail Kogalniceanu, nr. 8 Bl 1, Sc 1, Ap 09"
//                           placeholder="Home Address"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Row>
//                     <Col className="pr-1" md="4">
//                       <Form.Group>
//                         <label>City</label>
//                         <Form.Control
//                           defaultValue="Mike"
//                           placeholder="City"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="px-1" md="4">
//                       <Form.Group>
//                         <label>Country</label>
//                         <Form.Control
//                           defaultValue="Andrew"
//                           placeholder="Country"
//                           type="text"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                     <Col className="pl-1" md="4">
//                       <Form.Group>
//                         <label>Postal Code</label>
//                         <Form.Control
//                           placeholder="ZIP Code"
//                           type="number"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Row>
//                     <Col md="12">
//                       <Form.Group>
//                         <label>About Me</label>
//                         <Form.Control
//                           cols="80"
//                           defaultValue="Lamborghini Mercy, Your chick she so thirsty, I'm in
//                           that two seat Lambo."
//                           placeholder="Here can be your description"
//                           rows="4"
//                           as="textarea"
//                         ></Form.Control>
//                       </Form.Group>
//                     </Col>
//                   </Row>
//                   <Button
//                     className="btn-fill pull-right"
//                     type="submit"
//                     variant="info"
//                   >
//                     Update Profile
//                   </Button>
//                   <div className="clearfix"></div>
//                 </Form>
//               </Card.Body>
//             </Card>
//           </Col>
//           <Col md="4">
//             <Card className="card-user">
//               <div className="card-image">
//                 <img
//                   alt="..."
//                   src={require("assets/img/photo-1431578500526-4d9613015464.jpeg")}
//                 ></img>
//               </div>
//               <Card.Body>
//                 <div className="author">
//                   <a href="#pablo" onClick={(e) => e.preventDefault()}>
//                     <img
//                       alt="..."
//                       className="avatar border-gray"
//                       src={require("assets/img/faces/face-3.jpg")}
//                     ></img>
//                     <h5 className="title">Mike Andrew</h5>
//                   </a>
//                   <p className="description">michael24</p>
//                 </div>
//                 <p className="description text-center">
//                   "Lamborghini Mercy <br></br>
//                   Your chick she so thirsty <br></br>
//                   I'm in that two seat Lambo"
//                 </p>
//               </Card.Body>
//               <hr></hr>
//               <div className="button-container mr-auto ml-auto">
//                 <Button
//                   className="btn-simple btn-icon"
//                   href="#pablo"
//                   onClick={(e) => e.preventDefault()}
//                   variant="link"
//                 >
//                   <i className="fab fa-facebook-square"></i>
//                 </Button>
//                 <Button
//                   className="btn-simple btn-icon"
//                   href="#pablo"
//                   onClick={(e) => e.preventDefault()}
//                   variant="link"
//                 >
//                   <i className="fab fa-twitter"></i>
//                 </Button>
//                 <Button
//                   className="btn-simple btn-icon"
//                   href="#pablo"
//                   onClick={(e) => e.preventDefault()}
//                   variant="link"
//                 >
//                   <i className="fab fa-google-plus-square"></i>
//                 </Button>
//               </div>
//             </Card>
//           </Col>
//         </Row>
//       </Container>
//     </>
//   );
// }

// export default User;
