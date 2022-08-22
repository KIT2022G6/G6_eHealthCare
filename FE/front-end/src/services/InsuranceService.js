import axios from 'axios';
import Insurance from '../views/Admin/Insurance';

const INSURANCE_API_BASE_URL = "http://localhost:8080/api/v1/insurance";

class InsuranceService {

    getInsurance(){
        return axios.get(INSURANCE_API_BASE_URL);
    }


    // createEmployee(insurance){
    //     return axios.post(INSURANCE_API_BASE_URL, insurance);
    // }

    // getEmployeeById(employeeId){
    //     return axios.get(INSURANCE_API_BASE_URL + '/' + employeeId);
    // }

    // getEmployeeByDepartmentID(departmentID){
    //     return axios.get(INSURANCE_API_BASE_URL + '/departmentID/' + departmentID);
    // }

    // getEmployeeByDepartmentNameBirthDate(DepartmentName, BirthDate){
    //     return axios.get(INSURANCE_API_BASE_URL + '/departmentName/' + DepartmentName +'/'+ BirthDate);
    // }


    // updateEmployee(employee, employeeId){
    //     return axios.put(INSURANCE_API_BASE_URL + '/' + employeeId, employee);
    // }

    // deleteEmployee(employeeId){
    //     return axios.delete(INSURANCE_API_BASE_URL + '/' + employeeId);
    // }
}

export default new InsuranceService()