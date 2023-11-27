package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(1992, Month.AUGUST,13));
            Student alex2 = new Student(
                    "alex2",
                    "alex2@gmail.com",
                    LocalDate.of(1990, Month.AUGUST,13));
            Student alex3 = new Student(
                    "alex3",
                    "alex3@gmail.com",
                    LocalDate.of(1994, Month.AUGUST,13));
            Student alex4 = new Student(
                    "alex4",
                    "alex4@gmail.com",
                    LocalDate.of(1996, Month.AUGUST,13));
            Student alex5 = new Student(
                    "alex5",
                    "alex5@gmail.com",
                    LocalDate.of(1998, Month.AUGUST,13));
            repository.saveAll(
                    List.of(alex,alex2,alex3,alex4,alex5)
            );
        };
    }
}
