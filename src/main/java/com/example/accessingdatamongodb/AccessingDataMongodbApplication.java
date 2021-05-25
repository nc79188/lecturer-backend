package com.example.accessingdatamongodb;

import com.example.accessingdatamongodb.DAO.LecturerRepo;
import com.example.accessingdatamongodb.Model.Lecturer;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner{

	@Autowired
	private LecturerRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Lecturer test = new Lecturer("test","testing", LocalDate.now());
		System.out.println("============saving the lecturer=====================");
		repo.save(test);
		System.out.println("======================saved the lecturer===================");
		for(Lecturer lecturer: repo.findAll()) {
			System.out.println(lecturer);
		}
	}
}
