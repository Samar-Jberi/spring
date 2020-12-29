package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Department;
import com.example.demo.entities.Employe;
import com.example.demo.entities.Entreprise;
import com.example.demo.repository.IEmployeRepository;
import com.example.demo.services.IDepartmentService;
import com.example.demo.services.IEntrepriseService;

@RestController
public class UserRestController {
	
	@Autowired
	IEntrepriseService es;
	
	@Autowired
	IDepartmentService Ds;
	
	@Autowired
	IEmployeRepository ERep;
	
	
	// Ajouter Entreprise : http://localhost:8081/SpringMVC/servlet/ajouterEntreprise
	 
	@PostMapping("/ajouterEntreprise")
	 @ResponseBody
	 public int addEntreprise(@RequestBody Entreprise e) {
	int id = es.ajouterEntreprise(e);
	 return id;
	 }

	
	
	// Ajouter Department : http://localhost:8081/SpringMVC/servlet/ajouterDepartment
	 
		@PostMapping("/ajouterDepartement")
		 @ResponseBody
		 public int addDepartment(@RequestBody Department d) {
		int id = es.ajouterDepartement(d);
		return id;
		 
		 }
	
		
		// affecterDepartementAEntreprise : http://localhost:8081/SpringMVC/servlet/affecterDepartementAEntreprise
		 
			@PostMapping("/affecterDepartementAEntreprise")
			 @ResponseBody
			 public void affecterDepartementAEntreprise(@RequestBody int depId, int entrepriseId) {
			 es.affecterDepartementAEntreprise(depId, entrepriseId);
			 }
			
			
			// http://localhost:8082/SpringMVC/servlet/getAllDepartementsNamesByEntreprise
			@GetMapping("/getAllDepartementsNamesByEntreprise")
			@ResponseBody
			public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
			List<String> list = es.getAllDepartementsNamesByEntreprise(entrepriseId);
		     return list;
		 }
			
			//http://localhost:8081/SpringMVC/servlet/deleteEntrepriseetDepartment/{ide}
			 @DeleteMapping("/deleteEntrepriseetDepartment/{ide}")
			 @ResponseBody
			  public void deleteEntrepriseetDepartment(@PathVariable("ide") int ide) {
			 es.deleteEntrepriseetDepartment(ide);
			  }
			
			
			// ajouterEtAffecterEntrepriseDepartment : http://localhost:8081/SpringMVC/servlet/ajouterEtAffecterEntrepriseDepartment
				 
					@PostMapping("/ajouterEtAffecterEntrepriseDepartment")
					 @ResponseBody
					 public void ajouterEtAffecterEntrepriseDepartment(@RequestBody Department dep, Entreprise e) {
					es.ajouterEtAffecterEntrepriseDepartment(dep, e);
					
					 }
			
			
					// aaffecterEmployeDepartement : http://localhost:8081/SpringMVC/servlet/affecterEmployeDepartement
					 
					@PostMapping("/affecterEmployeDepartement")
					 @ResponseBody
					 public void affecterEmployeDepartement(@RequestBody Employe user, Department dep) {
					es.affecterEmployeDepartement(user, dep);
					
					 }
			
					
					// http://localhost:8081/SpringMVC/servlet/getallEmployebyEntreprise
					@GetMapping("/getallEmployebyEntreprise")
					@ResponseBody
					public List<Employe> getallEmployebyEntreprise(int identr) {
					List<Employe> list = es.getallEmployebyEntreprise(identr);
				     return list;
				 }
					
					// http://localhost:8081/SpringMVC/servlet/getEmploye/{String nom, String pwd}
					 @GetMapping("/getEmploye/{String nom, String pwd}")
					 @ResponseBody
					 public Employe getEmploye(@PathVariable("String nom, String pwd") String nom, String pwd) {
					 return es.getEmploye(nom, pwd);
					}
					 
					 
					 
					 //http://localhost:8081/SpringMVC/servlet/ettreAjourEmailByEmployeId
					 @PutMapping("/mettreAjourEmailByEmployeId")
					 @ResponseBody
					 public void mettreAjourEmailByEmployeId(@RequestBody String email, int employeId) {
					 
					 }
			
	
}
