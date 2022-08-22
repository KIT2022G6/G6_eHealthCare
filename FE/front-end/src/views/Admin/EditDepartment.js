import React, { useEffect, useState } from 'react';
import { Link, useNavigate, useParams } from 'react-router-dom';
import { Button, Form } from "react-bootstrap";

const DepartmentEdit = () => {
    const params = useParams();
    const [product, setProduct] = useState(null);
    const [category, setCategory] = useState(null);
    const [countries, setCountries] = useState(null);

    useEffect(() => {
        if (params.depID != null && params.depID != 'new') {
            let product_url =
                'http://localhost:8080/api/v1/department/' + params.depID;

            fetch(product_url)
                .then((res) => res.json())
                .then((data) => {
                    setProduct(data);
                });
        } else {
            let initData = {};
            setProduct(initData);
        }

        window.scrollTo({
            top: 0,
            behavior: 'smooth',
        });
    }, []);

    const saveProduct = () => {
        console.log(product);
        let method = 'POST';
        let id = '';
        if (product.id) {
            method = 'PUT';
            id = product.depID;
        }

        const requestOptions = {
            method: method,
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(product),
        };
        fetch(
            'http://localhost:8080/api/v1/department/' + id,
            requestOptions
        )
            .then((response) => response.json())
            .then((data) => {
                console.log("DONE REQUEST");
                // navigate(-1);
            });
    };

    const handleChange = (event) => {
        const target = event.target;
        const value = target.value;
        const name = target.name;

        let data = { ...product };
        data[name] = value;
        setProduct(data);
    };
    return (
        <>
            {product != null ? (
                <div className="container">
                    <div className="container">
                        <div className="container">
                            <div className="col-lg-10 col-md-12 mx-auto col-sm-12">
                                <h1 className="text-center m3">{product.depID ? 'EDIT ' : 'NEW '}</h1>
                                <br />
                                <div className="table-responsive">
                                    <table className="table table-user-information">
                                        <tbody>
                                            <tr>
                                                <td>
                                                    <strong>Mã khoa khám</strong>
                                                </td>
                                                {product.depID ? (
                                                    <td>
                                                        <input
                                                            type="text"
                                                            className="form-control"
                                                            value={product.depID}
                                                            name="depID"
                                                            placeholder="Readonly input"
                                                        ></input>
                                                    </td>) : <td>
                                                    <input
                                                        type="text"
                                                        className="form-control"
                                                        value={product.depID}
                                                        name="depID"
                                                        onChange={(e) => handleChange(e)}
                                                    ></input>
                                                </td>}
                                            </tr>
                                            <tr>
                                                <td>
                                                    <strong>Tên khoa</strong>
                                                </td>
                                                <td>
                                                    <input
                                                        type="text"
                                                        className="form-control"
                                                        value={product.dName}
                                                        name="dName"
                                                        onChange={(e) => handleChange(e)}
                                                    ></input>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <strong>Price</strong>
                                                </td>
                                                <td>
                                                    <input
                                                        type="text"
                                                        className="form-control"
                                                        value={product.dCharge}
                                                        name="dCharge"
                                                        onChange={(e) => handleChange(e)}
                                                    ></input>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <strong>Mô tả</strong>
                                                </td>
                                                <td>
                                                    <input
                                                        type="text"
                                                        className="form-control"
                                                        value={product.dDes}
                                                        name="dDes"
                                                        onChange={(e) => handleChange(e)}
                                                    ></input>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <div className="m-3">
                                        <Button
                                            variant="outline-info"
                                            onClick={() => saveProduct()}
                                        >
                                            Save
                                        </Button>
                                        <span> </span>
                                        <Link to="/admin">
                                            <Button variant="outline-danger">
                                                Cancel
                                            </Button>
                                        </Link>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            ) : (
                <div><h1>(❁´◡`❁)&nbsp;Loading&nbsp;(❁´◡`❁)</h1></div>
            )}
        </>
    );
};

export default DepartmentEdit