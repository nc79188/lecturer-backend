package com.example.accessingdatamongodb;

import com.example.accessingdatamongodb.DAO.LecturerRepo;
import com.example.accessingdatamongodb.Model.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8000")
@RestController
public class AppController {

    @Autowired
    private LecturerRepo repo;

    @GetMapping(value = "/")
    public List<Lecturer> getAll() {
        List<Lecturer> list = repo.findAll();
        return list;
    }

    @PostMapping("/add")
    public Lecturer getLecturer(@RequestBody Lecturer lecturer) {
        repo.save(lecturer);
        return lecturer;
    }

    @GetMapping("/get/{name}")
    public List<Lecturer> getByName(@PathVariable String name) {

        List<Lecturer> list = repo.getByName(name);
        return list;
    }
}