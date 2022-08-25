import React, { useEffect, useState } from 'react'
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import { Button, Table } from "react-bootstrap";
import { Link } from "react-router-dom";


const Prescription = () => {
    const [data, setData] = useState();
    const [direction, setDirection] = useState(1);
    const [currentItems, setCurrentItems] = useState(null);
    const [pageCount, setPageCount] = useState(0);
    const [page, setPage] = useState(-1);
    const [searchTerm, setSearchTerm] = useState('');
    useEffect(() => {
        let url = 'http://localhost:8080/api/v1/prescription';
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
            let itemsPerPage = 100;
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

    let listPrescription = [];
    if (currentItems != null) {
        listPrescription = currentItems.map((item, id) => (
            <tr>
                <td>{item.id}</td>
                <td>{item.precriptionID}</td>
                <td>{item.pAmo}</td>
                <td>{item.pDos}</td>
                <td>{item.pDet}</td>
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
        <div className="container">
            <hr />
            <h1>QL Đơn thuốc</h1>
            <Row>
                <Col xs={12} md={6}>

                    <div className="container">
                        <form className="form-inline">
                            <div className="input-group">
                                <input
                                    type="text"
                                    className="form-control"
                                    size="50"
                                    placeholder="Search"
                                    value=""
                                    onChange=""
                                // {(e) => setSearchTerm(e.target.value)}
                                />
                                <button
                                    type="button"
                                    className="btn btn-info"
                                // onClick={doSearch}
                                >
                                    Search
                                </button>
                            </div>
                        </form>
                    </div>
                </Col>
                <Col xs={10} md={6} className="text-end">
                    <Link to='/edit/new'>
                        <Button variant="outline-info" className="mb-5">
                            Add new
                        </Button>
                    </Link>
                </Col>
            </Row>

            <Table striped bordered hover>
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Mã đơn thuốc</th>
                        <th>Số lượng (Hộp)</th>
                        <th>Liều lượng (Viên)</th>
                        <th>Thời gian uống</th>
                    </tr>
                </thead>
                <tbody>
                    {listPrescription}
                </tbody>
            </Table>
        </div>
    )
}

export default Prescription
