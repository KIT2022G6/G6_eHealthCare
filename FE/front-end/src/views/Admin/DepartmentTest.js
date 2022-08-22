import React, { useEffect, useState } from 'react'
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import DepartmentService from '../../services/DepartmentService'
import { Button, Table } from "react-bootstrap";
import { Link } from "react-router-dom";


const DepartmentTest = () => {
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

    const deleteUser = (id) => {
        fetch('http://localhost:8080/api/v1/department/' + id, {
            method: 'DELETE',
        }).then(() => {
            console.log('delete successful!!');
            let result = [...data];
            result = result.filter((item) => {
                return item.id != id;
            });
            setData(result);
        });
    };
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
                <td>{item.depID}</td>
                <td>{item.dName}</td>
                <td>{item.dCharge}</td>
                <td>{item.dDes}</td>
                <td><Link to={'./edit/' + item.depID}><Button variant="outline-warning">
                    Edit
                </Button></Link></td>
                <td><Button variant="outline-danger" onClick={() => deleteUser(item.depID)}>Delete</Button></td>
            </tr>
        )
        )
    };
    return (
        <div className="container">
            <hr />
            <h1>Admin</h1>
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
                    <Link to='./edit/new'>
                        <Button variant="outline-info" className="mb-5">
                            Add new
                        </Button>
                    </Link>
                </Col>
            </Row>

            <Table striped bordered hover>
                <thead>
                    <tr>
                        <th>Mã khoa</th>
                        <th>Tên khoa</th>
                        <th>Phí khám</th>
                        <th>Mô tả</th>
                    </tr>
                </thead>
                <tbody>
                    {listDepartment}
                </tbody>
            </Table>
        </div>
    )
}

export default DepartmentTest
