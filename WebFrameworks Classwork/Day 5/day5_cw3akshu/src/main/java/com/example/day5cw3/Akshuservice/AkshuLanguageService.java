package com.example.day5cw3.Akshuservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.Akshumodel.AkshuLanguage;
import com.example.day5cw3.Akshurepository.AkshuLanguageRepo;

@Service
public class AkshuLanguageService {
    private AkshuLanguageRepo languageRepo;
    public AkshuLanguageService(AkshuLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(AkshuLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AkshuLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,AkshuLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public AkshuLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
