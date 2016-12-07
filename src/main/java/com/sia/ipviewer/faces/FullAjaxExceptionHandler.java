package com.sia.ipviewer.faces;

import java.io.IOException;

import javax.faces.FacesException;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class FullAjaxExceptionHandler extends ExceptionHandlerWrapper {
	
	private ExceptionHandler wrapped;

	public FullAjaxExceptionHandler(ExceptionHandler wrapped) {
		this.wrapped = wrapped;
	}

	private static Throwable extractCustomException(Throwable ex) {
		return ex;
	}
	
	public static boolean handleException(Throwable original) {
		Throwable ex = extractCustomException(original);
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
	
		try {
			if (ex instanceof ViewExpiredException) {
				externalContext.redirect("login.jsf");
			} else {
					externalContext.redirect("/errors/notfound.jsf");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public void handle() throws FacesException {
		getWrapped().handle();
	}

	@Override
	public ExceptionHandler getWrapped() {
		return wrapped;
	}
}
