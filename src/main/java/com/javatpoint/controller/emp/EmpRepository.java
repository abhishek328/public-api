package com.javatpoint.controller.emp;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmpRepository extends MongoRepository<Emp, String> {
    List<Emp> findByFirstNameStartingWith (String  firstname);
    List<Emp> findByFirstName (String  firstname);
    List<Emp> findByAddressCity(String city);

    @Query(value="{'salary':{$gte:?0 } }" ,fields = "{'id':0,'firstName':1,'salary':1}")
    List<Emp> getEmpBySalaryGreaterThan(float salary);



}
