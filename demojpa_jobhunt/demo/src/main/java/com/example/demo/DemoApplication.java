package com.example.demo;

import com.example.demo.model.City;
import com.example.demo.model.Employer;
import com.example.demo.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired EntityManager em;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
            var employer = Employer.builder().name("FPT")
                    .email("gmail")
                    .website("abc.com").build();
            em.persist(employer);

        for(int i = 0; i <10; i++){
            var article = Job.builder().employer(employer).title("Thai").description("ABC").city(City.HaNoi).build();
            em.persist(article);
        }


        em.flush();
    }

}
