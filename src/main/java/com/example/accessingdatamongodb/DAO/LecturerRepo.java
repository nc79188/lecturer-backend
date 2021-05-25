package com.example.accessingdatamongodb.DAO;

import com.example.accessingdatamongodb.Model.Lecturer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LecturerRepo extends MongoRepository<Lecturer,String> {
    List<Lecturer> getByName(String name);
    List<Lecturer> getByClassName(String className);
}
