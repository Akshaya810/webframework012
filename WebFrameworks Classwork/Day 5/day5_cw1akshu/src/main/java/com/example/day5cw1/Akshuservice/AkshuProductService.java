package com.example.day5cw1.Akshuservice;

import org.springframework.stereotype.Service;

import com.example.day5cw1.Akshumodel.AkshuProduct;
import com.example.day5cw1.Akshurepository.AkshuProductRepo;

@Service
public class AkshuProductService {
    public AkshuProductRepo productRepo;
    public AkshuProductService(AkshuProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(AkshuProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AkshuProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public AkshuProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
