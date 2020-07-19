package com.javatpoint.controller.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EmpDAO {
    @Autowired
    EmpRepository empRepository ;

    public List<Emp> getEmp() {
        return empRepository.findAll();
    }

    public Emp addEmp(Emp emp) { return empRepository.insert(emp);}

    public Emp updateEmp(Emp emp) {return empRepository.save(emp); }

    public void deleteEmp(String id) { empRepository.deleteById(id);}

    public List<Emp> getEmpByFirstName(String firstname)
    {
        return empRepository.findByFirstName(firstname);
    }

    public List<Emp> getEmpByCity(String city)
    {
        return empRepository.findByAddressCity(city);
    }


    public List<Emp> getEmpBySalaryGreaterThan(float salary)
    {
        return empRepository.getEmpBySalaryGreaterThan(salary);
    }
}
