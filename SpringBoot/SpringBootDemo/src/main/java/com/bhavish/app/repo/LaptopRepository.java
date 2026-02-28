package com.bhavish.app.repo;

import com.bhavish.app.model.Laptop;
import org.springframework.stereotype.Repository;


@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Save in DB...");
    }
}
