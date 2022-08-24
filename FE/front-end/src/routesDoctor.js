import DoctorProfile from "views/Doctor/DoctorProfile";
import MedicalRecord2 from "views/Doctor/MedicalRecord";
import MakeMedicalRecords from "views/Doctor/MakeMedicalRecords";
import Schedule from "views/Doctor/Schedule";
import MedicalExaminationList from "views/Doctor/MedicalExaminationList";

const dashboardRoutes = [
  {
    path: "/profile",
    name: "Thông tin cá nhân",
    icon: "nc-icon nc-circle-09",
    component: DoctorProfile,
    layout: "/doctor"
  },
  {
    path: "/medicalRecord",
    name: "DS hồ sơ bệnh án",
    icon: "nc-icon nc-notes",
    component: MedicalRecord2,
    layout: "/doctor"
  },
  {
    path: "/MakeMedicalRecords",
    name: "Lập hồ sơ bệnh án",
    icon: "nc-icon nc-notes",
    component: MakeMedicalRecords,
    layout: "/doctor"
  },
  {
    path: "/schedule",
    name: "Lịch làm việc",
    icon: "nc-icon nc-notes",
    component: Schedule,
    layout: "/doctor"
  },
  {
    path: "/medicalExaminationList",
    name: "DS Lịch khám bệnh",
    icon: "nc-icon nc-notes",
    component: MedicalExaminationList,
    layout: "/doctor"
  }
];

export default dashboardRoutes;