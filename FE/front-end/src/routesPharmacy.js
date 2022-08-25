import Medicine from "views/Drugstores/Medicine";
import DrugstoresProfile from "views/Drugstores/DrugstoresProfile";
import MedicalRecord1 from "views/Drugstores/MedicalRecord";

const dashboardRoutes = [
  {
    path: "/profile",
    name: "Thông tin cá nhân",
    icon: "nc-icon nc-circle-09",
    component: DrugstoresProfile,
    layout: "/pharmacy"
  },
  {
    path: "/medicine",
    name: "DS các loại thuốc",
    icon: "nc-icon nc-notes",
    component: Medicine,
    layout: "/pharmacy"
  },
  {
    path: "/medicalRecord",
    name: "DS hồ sơ bệnh án",
    icon: "nc-icon nc-notes",
    component: MedicalRecord1,
    layout: "/pharmacy"
  },
];

export default dashboardRoutes;