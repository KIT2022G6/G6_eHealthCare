import axios from "axios";

const EMP_API_BASE_URL = "http://localhost:8080/api/v1/department";

class EmpServices{
    getALLDepartment(stringSearch){
        var text ="";
        if(stringSearch!=""){
            text="?dName" +stringSearch;
        }
        return axios.get(EMP_API_BASE_URL+text);
    }

    addNewDepartment(department){
        return axios.post(EMP_API_BASE_URL, department);
    }

    getDepartmentById(department){
        return axios.get(EMP_API_BASE_URL + '/' + department);
    }

    updateDepartment(departmentid, department){
        return axios.put(EMP_API_BASE_URL + '/' + departmentid, department);
    }

    deleteDepartment(department){
        return axios.delete(EMP_API_BASE_URL + '/' + department);
    }
}