package pom;

import org.testng.annotations.Test;

public class TestScriptPom  extends BaseClass{
	@Test(dataProvider = "signupdata",dataProviderClass =DataProviderClass.class )
	public void signup(String fn,String ln,String mail,String pass)
	{
		PomClass pmc=new PomClass(driver);
		pmc.registerButton();
		pmc.firstNameField(fn);
		pmc.lastNameField(ln);
		pmc.emailField(mail);
		pmc.paswordField(pass);
		pmc.ConfirmPwdField(pass);
		pmc.regBtn();
		
	}
}
