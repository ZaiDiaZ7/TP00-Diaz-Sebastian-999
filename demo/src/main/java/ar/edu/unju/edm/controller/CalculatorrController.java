package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.calculator;

@Controller
public class CalculatorrController {

	@GetMapping("/menu")
	public String MenuCalculadora() {
		
		return "index";
	}
	
	
	// Tomamos los parametros enviados desde la peticion "calculoSuma" con @RequestParam (name="nombre_parametro") luego indicamos que tipo es el parametro
	// el Model va a alojar el resultado, es un elemento para hacer entrada y salida
	@GetMapping("/calculoSuma")
	public String getResultsPage( @RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model ) {
		int result = 0;
		// creamos el objeto
		calculator newcalculator = new calculator();
		newcalculator.setNumbera(num1);
		newcalculator.setNumberb(num2);
		result = newcalculator.resolverplus();
		model.addAttribute("resultSum",result); // se agregan atributos al modelo que se van a recepcionar en la vista, el result como "resultSum"
		
		return "resultado";
	}
	
	@GetMapping("/calculoResta")
	public String getResultsPage2( @RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model ) {
		int result = 0;
		calculator newcalculator = new calculator();
		newcalculator.setNumbera(num1);
		newcalculator.setNumberb(num2);
		result = newcalculator.resolveresta();
		model.addAttribute("resultSub",result);
				
		return "resultado";
	}
	
	@GetMapping("/calculoMult")
	public String getResultsPage3( @RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model ) {
		int result = 0;
		calculator newcalculator = new calculator();
		newcalculator.setNumbera(num1);
		newcalculator.setNumberb(num2);
		result = newcalculator.resolvermultiplicacion();
		model.addAttribute("resultMult",result);
				
		return "resultado";
	}
	@GetMapping("/calculoDiv")
	public String getResultsPage4( @RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model ) {
		int result = 0;
		calculator newcalculator = new calculator();
		newcalculator.setNumbera(num1);
		newcalculator.setNumberb(num2);
		result = newcalculator.resolverdivision();
		model.addAttribute("resultDiv",result);
				
		return "resultado";
	}
	@GetMapping("/calculoPot")
	public String getResultsPage5( @RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model ) {
		double result = 0;
		calculator newcalculator = new calculator();
		newcalculator.setNumbera(num1);
		newcalculator.setNumberb(num2);
		result = newcalculator.resolverpot();
		model.addAttribute("resultPot",result);
				
		return "resultado";
	}
	@GetMapping("/calculoRaiz")
	public String getResultsPage6( @RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model ) {
		float result = 0;
		calculator newcalculator = new calculator();
		newcalculator.setNumbera(num1);
		newcalculator.setNumberb(num2);
		result = (float) newcalculator.resolversqroot3();
		model.addAttribute("resultRaiz",result);
				
		return "resultado";
	}
}

