package com.sia.ipviewer;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("userBean")
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public String authenticate() {
		if (credenzialiAccettate()) {
			return "home.xhtml?faces-redirect=true";
		} else {
			aggiungiErroreCredenzialiNonCorrette();
			return "";
		}
	}
	
	public boolean credenzialiAccettate() {
		if (username.equals("appmaster") && password.equals("appmaster")) {
			return true;
		}
		
		return false;
	}
	
	private void aggiungiErroreCredenzialiNonCorrette() {
		FacesContext fc = FacesContext.getCurrentInstance();
		if (fc != null) {
			fc.addMessage(null, new FacesMessage("Credenziali errate."));
		}
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
