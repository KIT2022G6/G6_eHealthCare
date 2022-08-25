import DepartmentTest from "views/Admin/DepartmentTest";
import Insurance from "views/Admin/Insurance";
import Prescription from "views/Admin/Prescription";
import Doctor from "views/Admin/Doctor";
import TotalInvoice from "views/Admin/TotalInvoice";
import MedInvoice from "views/Admin/MedInvoice";
import Pharmacy from "views/Admin/Pharmacy";

import Home from "layouts/Home";
import Login from "layouts/Login";
import Logout from "layouts/Logout";

const dashboardRoutes = [
  {
    path: "/insurance",
    name: "Bảo hiểm",
    icon: "nc-icon nc-notes",
    component: Insurance,
    layout: "/admin"
  },
  {
    path: "/department",
    name: "Khoa khám",
    icon: "nc-icon nc-notes",
    component: DepartmentTest,
    layout: "/admin"
  },
  {
    path: "/prescription",
    name: " QL Đơn thuốc",
    icon: "nc-icon nc-notes",
    component: Prescription,
    layout: "/admin"
  },
  {
    path: "/doctor",
    name: " DS Bác sĩ",
    icon: "nc-icon nc-notes",
    component: Doctor,
    layout: "/admin"
  },
  {
    path: "/totalInvoice",
    name: " DS Hóa đơn",
    icon: "nc-icon nc-notes",
    component: TotalInvoice,
    layout: "/admin"
  },
  {
    path: "/medInvoice",
    name: " DS Hóa đơn thuốc",
    icon: "nc-icon nc-notes",
    component: MedInvoice,
    layout: "/admin"
  },
  {
    path: "/pharmacy",
    name: " DS Quầy thuốc",
    icon: "nc-icon nc-notes",
    component: Pharmacy,
    layout: "/admin"
  },
  {
    path: "/layouts/Home",
    name: " Trang chủ",
    icon: "nc-icon nc-notes",
    component: Home,
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
