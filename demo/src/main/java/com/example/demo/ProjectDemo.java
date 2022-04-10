package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Student;
import ar.edu.unju.edm.model.calculator;

@SpringBootApplication
public class ProjectDemo {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDemo.class, args);
		 String nombre = " Seba ";
	        System.out.println( nombre) ;
	        
	        Student astudent = new Student();
	        astudent.setDni("45327632");
	        astudent.setName("SEBASTIAN DIAZ");

	        System.out.println( "EL estudiante " + astudent.getName() + " dice HOLA!");
	   	
	        //crear un objeto de la clase calculadora

	        calculator acalculator = new calculator(); // metodo constructor
	        acalculator.setNumbera(4);
	        acalculator.setNumberb(2);
	        System.out.println( "El resultado de la suma es: " + acalculator.resolveplus());
	        //resta
	        System.out.println( "El resultado de la resta es: " + acalculator.resolveresta());
	        //division
	        System.out.println( "El resultado de la division es: " + acalculator.resolverdivision());
	        //multiplicacion
	        System.out.println( "El resultado de la multiplicacion es: " + acalculator.resolvermultiplicacion());

	}
	
}
