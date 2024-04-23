package com.example.day5cw2.Akshuservice;

import org.springframework.stereotype.Service;

import com.example.day5cw2.Akshumodel.AkshuEmployee;
import com.example.day5cw2.Akshurepository.AkshuEmployeeRepo;

@Service
public class AkshuEmployeeService {
    public AkshuEmployeeRepo employeeRepo;
    public AkshuEmployeeService(AkshuEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(AkshuEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AkshuEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public AkshuEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
