package com.javatpoint.controller.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpService {
    @Autowired
    EmpDAO empDAO ;

    public List<Emp> getEmp() {
        return empDAO.getEmp();
    }

    public Emp addEmp(Emp emp) { return empDAO.addEmp(emp); }

    public Emp updateEmp(Emp emp) { return empDAO.updateEmp(emp); }

    public void deleteEmp(String id) {  empDAO.deleteEmp(id);}

    public List<Emp> getEmpByFirstName(String firstname)
    {
        return empDAO.getEmpByFirstName(firstname);
    }

    public List<Emp> getEmpByCity(String city)
    {
        return empDAO.getEmpByCity(city);
    }

    public List<Emp> getEmpBySalaryGreaterThan(float salary)
    {
        return empDAO.getEmpBySalaryGreaterThan(salary);
    }
}
