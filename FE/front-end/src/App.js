import React, { useEffect, useState } from 'react'
import { Route, Switch, Redirect, Link } from "react-router-dom";

import "bootstrap/dist/css/bootstrap.min.css";
import "./assets/css/animate.min.css";
import "./assets/scss/light-bootstrap-dashboard-react.scss?v=2.0.0";
import "./assets/css/demo.css";
import "@fortawesome/fontawesome-free/css/all.min.css";
import AuthService from "./services/auth.service";
import Home from "components/Home.js";
import Login from "./components/Login";
import Register from "./components/Register";
import AdminLayout from "layouts/Admin.js";
import PatientLayout from "layouts/Patient.js";
import DoctorLayout from "layouts/Doctor.js";
import PharmacyLayout from "layouts/Pharmacy.js";

const App = () => {
    const [showModeratorBoard, setShowModeratorBoard] = useState(false);
    const [showAdminBoard, setShowAdminBoard] = useState(false);
    const [currentUser, setCurrentUser] = useState(undefined);
    useEffect(() => {
        const user = AuthService.getCurrentUser();
        if (user) {
            setCurrentUser(user);
            setShowModeratorBoard(user.roles.includes("ROLE_MODERATOR"));
            setShowAdminBoard(user.roles.includes("ROLE_ADMIN"));
        }
    }, []);
    const logOut = () => {
        AuthService.logout();
    };
    return (
        <div>
            {/* <nav className="navbar navbar-expand navbar-dark bg-dark">
                <Link to={"/"} className="navbar-brand">
                    eHealthCare
                </Link>
                <div className="navbar-nav mr-auto">
                    <li className="nav-item">
                        <Link to={"/home"} className="nav-link">
                            Home
                        </Link>
                    </li>
                    {showModeratorBoard && (
                        <li className="nav-item">
                            <Link to={"/mod"} className="nav-link">
                                Moderator Board
                            </Link>
                        </li>
                    )}
                    {showAdminBoard && (
                        <li className="nav-item">
                            <Link to={"/admin"} className="nav-link">
                                Admin Board
                            </Link>
                        </li>
                    )}
                    {currentUser && (
                        <li className="nav-item">
                            <Link to={"/user"} className="nav-link">
                                User
                            </Link>
                        </li>
                    )}
                </div>
                {currentUser ? (
                    <div className="navbar-nav ml-auto">
                        <li className="nav-item">
                            <Link to={"/profile"} className="nav-link">
                                {currentUser.username}
                            </Link>
                        </li>
                        <li className="nav-item">
                            <a href="/login" className="nav-link" onClick={logOut}>
                                LogOut
                            </a>
                        </li>
                    </div>
                ) : (
                    <div className="navbar-nav ml-auto">
                        <li className="nav-item">
                            <Link to={"/login"} className="nav-link">
                                Login
                            </Link>
                        </li>
                        <li className="nav-item">
                            <Link to={"/register"} className="nav-link">
                                Sign Up
                            </Link>
                        </li>
                    </div>
                )}
            </nav> */}
            <div>
                <Switch>
                    {/* <Route path="/" element={<Home />} />
                    <Route path="/home" element={<Home />} />
                    <Route path="/login" element={<Login />} />
                    <Route path="/register" element={<Register />} /> */}
                    <Route path="/admin" render={(props) => <AdminLayout {...props} />} />

                    {/* <Redirect from="/" to="/admin/dashboard" />
                    <Redirect from="/" to="/dashboard" /> */}

                    <Route path="/patient" render={(props) => <PatientLayout {...props} />} />
                    {/* <Redirect from="/patient" to="/patient/profile" /> */}

                    <Route path="/doctor" render={(props) => <DoctorLayout {...props} />} />

                    <Route path="/pharmacy" render={(props) => <PharmacyLayout {...props} />} />
                </Switch>
            </div>
        </div>
    );
};
export default App;