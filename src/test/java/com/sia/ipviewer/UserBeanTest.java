package com.sia.ipviewer;

import org.junit.Before;
import org.junit.Test;

public class UserBeanTest {
	
	private UserBean bean;

	@Before
	public void prepare() {
		this.bean = new UserBean();
		bean.setUsername("appmaster");
		bean.setPassword("appmaster");
	}
	
	@Test
	public void credenzialiAccettateTestOK() {
		assert bean.credenzialiAccettate() == true;
	}
	
	@Test
	public void credenzialiAccettateTestKO() {
		bean.setUsername("appMaster");
		bean.setPassword("appMaster");
		assert bean.credenzialiAccettate() == false;
	}
	
	@Test
	public void aurthenticateTestOK() {
		assert bean.authenticate() instanceof String;
	}
	
	@Test
	public void aurthenticateTestLoggedInPage() {
		assert bean.authenticate().equals("home.xhtml?faces-redirect=true");
	}
	
	@Test
	public void aurthenticateTestCredenzialiScorrette() {
		bean.setUsername("appMaster");
		bean.setPassword("appMaster");
		assert !bean.authenticate().equals("home.xhtml?faces-redirect=true");
	}
}
