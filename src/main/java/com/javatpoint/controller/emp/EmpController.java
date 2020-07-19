package com.javatpoint.controller.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService ;

    @GetMapping ("/emp")
    public List<Emp> getEmp ()
    {
        return empService.getEmp();
    }

    @PostMapping("/emp")
    public Emp addEmp(@RequestBody Emp emp) {return empService.addEmp(emp);}

    @PutMapping("/emp")
    public Emp updateEmp(@RequestBody Emp emp) {return empService.updateEmp(emp);}

    @DeleteMapping ("/emp/{id}")
    public void deleteEmp(@PathVariable String id) { empService.deleteEmp(id);}

    @GetMapping ("/firstname")
    public List<Emp> getEmpByFirstName (@RequestParam String firstname)
    {
        return empService.getEmpByFirstName (firstname);
    }

    @GetMapping ("/city")
    public List<Emp> getEmpByCity (@RequestParam String city)
    {
        return empService.getEmpByCity (city);
    }
    @GetMapping ("/salary")
    public List<Emp> getEmpBySalaryGreaterThan (@RequestParam float salary)
    {
        return empService.getEmpBySalaryGreaterThan (salary);
    }






}
