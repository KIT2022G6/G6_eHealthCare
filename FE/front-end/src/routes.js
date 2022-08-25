/*!

=========================================================
* Light Bootstrap Dashboard React - v2.0.1
=========================================================

* Product Page: https://www.creative-tim.com/product/light-bootstrap-dashboard-react
* Copyright 2022 Creative Tim (https://www.creative-tim.com)
* Licensed under MIT (https://github.com/creativetimofficial/light-bootstrap-dashboard-react/blob/master/LICENSE.md)

* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

*/
import Medicine from "views/Drugstores/Medicine";
import DrugstoresProfile from "views/Drugstores/DrugstoresProfile";
import MedicalRecord1 from "views/Drugstores/MedicalRecord";
import DoctorProfile from "views/Doctor/DoctorProfile";
import MedicalRecord2 from "views/Doctor/MedicalRecord";
import MakeMedicalRecords from "views/Doctor/MakeMedicalRecords";
import Schedule from "views/Doctor/Schedule";
import MedicalExaminationList from "views/Doctor/MedicalExaminationList";

import Insurance from "views/Admin/Insurance";
import Prescription from "views/Admin/Prescription";
import Doctor from "views/Admin/Doctor";
import TotalInvoice from "views/Admin/TotalInvoice";
import MedInvoice from "views/Admin/MedInvoice";
import Pharmacy from "views/Admin/Pharmacy";


import Login from "layouts/Login";
import Logout from "layouts/Logout";

const dashboardRoutes = [
  {
    path: "/Admin/Department",
    path: "/insurance",
    name: "Bảo hiểm",
    icon: "nc-icon nc-notes",
    component: Insurance,
    layout: "/admin"
  },
  {
    path: "/layouts/Login",
    name: " Đăng nhập",
    icon: "nc-icon nc-notes",
    component: Login,
    layout: "/admin"
  },
  {
    path: "/layouts/Logout",
    name: " Đăng xuất",
    icon: "nc-icon nc-notes",
    component: Logout,
    layout: "/admin"
  },
  {
    path: "/edit/:depID",
    layout: "/admin"
  },
  {
    path: "/edit/new",
    layout: "/admin"
  },
];

export default dashboardRoutes;
