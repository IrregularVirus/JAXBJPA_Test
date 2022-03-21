package com.example.jaxbjpa;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Unmarsh {
    public static void main(String[] args) {
        try {
            File file = new File("employee.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employee e = (Employee) jaxbUnmarshaller.unmarshal(file);
            System.out.println(e.getFirstName() + " " + e.getLastName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            File file = new File("employee2.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employee e = (Employee) jaxbUnmarshaller.unmarshal(file);
            System.out.println(e.getFirstName() + " " + e.getLastName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            File file = new File("employee3.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employee e = (Employee) jaxbUnmarshaller.unmarshal(file);
            System.out.println(e.getFirstName() + " " + e.getLastName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            File file = new File("employee4.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employee e = (Employee) jaxbUnmarshaller.unmarshal(file);
            System.out.println(e.getFirstName() + " " + e.getLastName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
