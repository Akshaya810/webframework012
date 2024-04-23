package com.example.day6cw3.Akshuservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.Akshumodel.AkshuProduct;
import com.example.day6cw3.Akshurepository.AkshuProductRepo;

@Service
public class AkshuProductService {
    public AkshuProductRepo productRepo;
    public AkshuProductService(AkshuProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AkshuProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AkshuProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AkshuProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AkshuProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
