import axios from 'axios';

const MEDICALRECORD_API_BASE_URL = "http://localhost:8080/api/v1/record";

class MedicalRecordService {

    getDepartment() {
        return axios.get(MEDICALRECORD_API_BASE_URL);
    }
}

export default new MedicalRecordService()