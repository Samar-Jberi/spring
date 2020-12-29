package com.example.demo.controller;



import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.example.demo.entities.Employe;
import com.example.demo.entities.Role;
import com.example.demo.services.IEmployeService;

public class UserController {
	@Scope(value = "session")
	@Controller(value = "userController") // Name of the bean in Spring IoC
	@ELBeanName(value = "userController") // Name of the bean used by JSF
	@Join(path = "/", to = "/login.jsf")
	public class UserControllerImpl {

	@Autowired
	IEmployeService employeService;

	private String email; 
	private String password; 
	private Employe employe;
	private Boolean loggedIn;

	public IEmployeService getEmployeService() {
		return employeService;
	}
	public void setEmployeService(IEmployeService employeService) {
		this.employeService = employeService;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Boolean getLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	

	   public String doLogin() {
		String navigateTo = "null";
		Employe e = employeService.authenticate(email, password);
		if (e != null && e.getRole() == Role.ADMINISTRATEUR) {
		navigateTo = "/pages/admin/welcome.xhtml?faces-redirect=true";
		loggedIn = true; }
		else {
		FacesMessage facesMessage = new FacesMessage("Login Failed: please check your username/password and try again.");

		FacesContext.getCurrentInstance().addMessage("form:btn",facesMessage);
		}
		return navigateTo;
		}

		public String doLogout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login.xhtml?faces-redirect=true";
		}
	
	}	
	
}
