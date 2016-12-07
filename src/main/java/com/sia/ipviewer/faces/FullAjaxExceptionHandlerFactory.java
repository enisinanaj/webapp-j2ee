package com.sia.ipviewer.faces;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

public class FullAjaxExceptionHandlerFactory extends ExceptionHandlerFactory {

    private ExceptionHandlerFactory wrapped;

    /**
     * Construct a new full ajax exception handler factory around the given wrapped factory.
     * @param wrapped The wrapped factory.
     */
    public FullAjaxExceptionHandlerFactory(ExceptionHandlerFactory wrapped) {
            this.wrapped = wrapped;
    }

    /**
     * Returns a new instance of {@link FullAjaxExceptionHandler} which wraps the original exception handler.
     */
    @Override
    public ExceptionHandler getExceptionHandler() {
            return new FullAjaxExceptionHandler(wrapped.getExceptionHandler());
    }

    /**
     * Returns the wrapped factory.
     */
    @Override
    public ExceptionHandlerFactory getWrapped() {
            return wrapped;
    }

}
