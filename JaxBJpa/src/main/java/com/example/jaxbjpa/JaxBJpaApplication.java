package com.example.jaxbjpa;

import  org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@SpringBootApplication
public class JaxBJpaApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JaxBJpaApplication.class, args);

        JAXBContext contextObj = JAXBContext.newInstance(Employee.class);

        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        Employee emp1=new Employee("I", "I");
        Employee emp2=new Employee("D", "M");
        Employee emp3=new Employee("A", "T");
        Employee emp4=new Employee("A", "M");

        marshallerObj.marshal(emp1, new FileOutputStream("employee.xml"));
        marshallerObj.marshal(emp2, new FileOutputStream("employee2.xml"));
        marshallerObj.marshal(emp3, new FileOutputStream("employee3.xml"));
        marshallerObj.marshal(emp4, new FileOutputStream("employee4.xml"));
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args -> {
            insertJavaAdvocates(repository);
            System.out.println(repository.findAll());

//            System.out.println(repository.deleteAllByLastNameContaining("I"));
        });
    }

    private void insertJavaAdvocates(EmployeeRepository repository){
        repository.save(new Employee("A", "M"));
    }

}
