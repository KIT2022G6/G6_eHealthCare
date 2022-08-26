import Profile from "views/Patient/Profile.js";
import Booking from "views/Patient/Booking.js";
import MedicalRecord from "views/Patient/MedicalRecord.js";
import History from "views/Patient/History.js";

const dashboardRoutes = [
  {
    path: "/Profile",
    name: "Thông tin cá nhân",
    icon: "nc-icon nc-circle-09",
    component: Profile,
    layout: "/patient"
  },
  {
    path: "/Booking",
    name: "Đặt lịch khám",
    icon: "nc-icon nc-tap-01",
    component: Booking,
    layout: "/patient"
  },
  {
    path: "/MedicalRecord",
    name: "Bệnh án của tôi",
    icon: "nc-icon nc-notes",
    component: MedicalRecord,
    layout: "/patient"
  },
  {
    path: "/History",
    name: "Lịch sử khám bệnh",
    icon: "nc-icon nc-notes",
    component:History,
    layout: "/patient"
  },
];

export default dashboardRoutes;