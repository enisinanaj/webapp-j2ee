package com.sia.ipviewer.faces;

import java.util.Locale;

import javax.faces.application.ViewHandler;
import javax.faces.application.ViewHandlerWrapper;
import javax.faces.context.FacesContext;

public class IPViewerViewHandler extends ViewHandlerWrapper {
	
	private ViewHandler handler;
	
	public IPViewerViewHandler(ViewHandler handler) {
		this.handler = handler;
	}
	
	@Override
	public Locale calculateLocale(FacesContext context) {
		return super.calculateLocale(context);	
	}

	@Override
	public ViewHandler getWrapped() {
		return handler;
	}

}
