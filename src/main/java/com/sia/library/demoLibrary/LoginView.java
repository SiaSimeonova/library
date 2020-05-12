package com.sia.library.demoLibrary;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class LoginView extends VerticalLayout implements View {

	public TextField email;
	public PasswordField password;
	public Button submit;

	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
       
	
	public LoginView() {
		email = new TextField();
		email.setCaption("Email");
		email.setIcon(VaadinIcons.USER);
		email.setSizeFull();
		
		password = new PasswordField();
		password.setCaption("password");
		password.setIcon(VaadinIcons.KEY);
		password.setSizeFull();
		
		submit = new Button("Submit", VaadinIcons.CHECK);
		submit.addStyleName("primary");
		submit.setSizeFull();
		
		FormLayout formLogin = new FormLayout(email, password, submit);
		formLogin.setMargin(true);
		
		Panel loginpanel = new Panel("Wellcome", formLogin);
		loginpanel.setStyleName("primary");
		loginpanel.setWidth("450");
		loginpanel.setHeight("250");
		
		addComponent(loginpanel);
		setComponentAlignment(loginpanel, Alignment.MIDDLE_CENTER);
		setStyleName("login", true);
		setHeight("100%");
	}
}