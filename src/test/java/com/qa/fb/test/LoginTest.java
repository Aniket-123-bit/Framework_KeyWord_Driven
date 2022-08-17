package com.qa.fb.test;
import org.testng.annotations.Test;

import com.qa.fb.keyword.engin.KeyWordEngin;

public class LoginTest {
public KeyWordEngin keyWordEngin;
	
	@Test
	public void loginTest(){
		keyWordEngin = new KeyWordEngin();
		keyWordEngin.startExecution("login");
	}
	
	@Test
	public void signUpTest(){
		keyWordEngin = new KeyWordEngin();
		keyWordEngin.startExecution("signup");
	}

}
