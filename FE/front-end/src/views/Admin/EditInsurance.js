const InsuranceEdit = () => {
    return (
        <>
            {product != null ? (
                <div className="container">
                    <div className="container">
                        <div className="container">
                            <div className="col-lg-10 col-md-12 mx-auto col-sm-12">
                                <h1 className="text-center m3">{product.id ? 'EDIT ' : 'NEW '}</h1>
                                <br />
                                <div className="table-responsive">
                                    <table className="table table-user-information">
                                        <tbody>
                                            <tr>
                                                {product.id ? (
                                                    <td>
                                                        <strong>STT</strong>
                                                    </td>
                                                ) : null}
                                                <td className="text-primary">
                                                    {product.id}
                                                    </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <strong>Mã bảo hiểm</strong>
                                                </td>
                                                <td>
                                                    <input
                                                        type="text"
                                                        className="form-control"
                                                        value={product.name}
                                                        name="name"
                                                        onChange={(e) => handleChange(e)}
                                                    ></input>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <strong>Loại bảo hiểm</strong>
                                                </td>
                                                <td>
                                                    <input
                                                        type="text"
                                                        className="form-control"
                                                        value={product.price}
                                                        name="price"
                                                        onChange={(e) => handleChange(e)}
                                                    ></input>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <strong>Mô tả</strong>
                                                </td>
                                                <td>
                                                    <select
                                                        name="category"
                                                        value={product.category}
                                                        onChange={(e) => {
                                                            handleChange(e);
                                                        }}
                                                    >
                                                        {category != null
                                                            ? category.map((item) => (
                                                                <option value={item.category}>{item.category}</option>
                                                            ))
                                                            : 'loading'}
                                                    </select>
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

export default InsuranceEdit

