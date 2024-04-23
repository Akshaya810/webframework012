package com.example.class_exercise_1.Akshuservice;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.Akshumodel.AkshuChildren;
import com.example.class_exercise_1.Akshurepository.AkshuChildrenRepo;

@Service
public class ChildrenService {

     @Autowired
     public AkshuChildrenRepo childrenRepo;

     public List<AkshuChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public AkshuChildren save(AkshuChildren children) {
          return childrenRepo.save(children);

     }

     public List<AkshuChildren> sortedPage(int offset, int pagesize, String field) {
          Page<AkshuChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<AkshuChildren> pagination(int offset, int pagesize) {
          Page<AkshuChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
