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
import UserProfile from "views/Patiens/UserProfile.js";
import Booking from "views/Patiens/Booking.js";
import MedicalRecord from "views/Patiens/MedicalRecord.js";
import Medicine from "views/Drugstores/Medicine";
import DrugstoresProfile from "views/Drugstores/DrugstoresProfile";
import MedicalRecord1 from "views/Drugstores/MedicalRecord";
import DoctorProfile from "views/Doctor/DoctorProfile";
import MedicalRecord2 from "views/Doctor/MedicalRecord";
import Schedule from "views/Doctor/Schedule";
import MedicalExaminationList from "views/Doctor/MedicalExaminationList";
import Insurance from "views/Admin/Insurance";
import Department from "views/Admin/Department";

const dashboardRoutes = [
  {
    path: "/user",
    name: "User Profile",
    icon: "nc-icon nc-circle-09",
    component: UserProfile,
    layout: "/admin"
  },
  {
    path: "/booking",
    name: "Booking",
    icon: "nc-icon nc-tap-01",
    component: Booking,
    layout: "/admin"
  },
  {
    path: "/medicalmecord",
    name: "Medical Record",
    icon: "nc-icon nc-album-2",
    component: MedicalRecord,
    layout: "/admin"
  },
  {
    path: "/Drugstores/DrugstoresProfile",
    name: "Drugstores Profile",
    icon: "nc-icon nc-circle-09",
    component: DrugstoresProfile,
    layout: "/admin"
  },
  {
    path: "/Drugstores/Medicine",
    name: "Medicine",
    icon: "nc-icon nc-notes",
    component: Medicine,
    layout: "/admin"
  },
  {
    path: "/Drugstores/MedicalRecord",
    name: "Medical Record",
    icon: "nc-icon nc-notes",
    component: MedicalRecord1,
    layout: "/admin"
  },
  {
    path: "/Doctor/DoctorProfile",
    name: "Doctor Profile",
    icon: "nc-icon nc-circle-09",
    component: DoctorProfile,
    layout: "/admin"
  },
  {
    path: "/Doctor/MedicalRecord",
    name: "Medical Record",
    icon: "nc-icon nc-notes",
    component: MedicalRecord2,
    layout: "/admin"
  },
  {
    path: "/Doctor/Schedule",
    name: "Schedule",
    icon: "nc-icon nc-notes",
    component: Schedule,
    layout: "/admin"
  },
  {
    path: "/Doctor/MedicalExaminationList",
    name: "Medical Examination List",
    icon: "nc-icon nc-notes",
    component: MedicalExaminationList,
    layout: "/admin"
  },
  {
    path: "/Admin/Insurance",
    name: "Bảo hiểm",
    icon: "nc-icon nc-notes",
    component: Insurance,
    layout: "/admin"
  },
  {
    path: "/Admin/Department",
    name: "Khoa khám",
    icon: "nc-icon nc-notes",
    component: Department,
    layout: "/admin"
  }
];

export default dashboardRoutes;
