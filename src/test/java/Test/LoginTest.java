package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import Pages.LoginPagesss;



public class LoginTest extends BaseClasss {
	@Test
	public void PostiveTestCase() throws FilloException {
		Recordset recordset = connection.executeQuery("Select * from Sheet1 where TestName='PostiveTestCase'");
		recordset.next();
		String UserName = recordset.getField("UserName");
		String Pasword = recordset.getField("Pasword");
		LoginPagesss Login1 = new LoginPagesss(driver);
		Login1.LoginFunction(UserName, Pasword);
		WebElement Ne = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
		String error = Ne.getText();
		String ActualError = recordset.getField("Errrmsg");
		Assert.assertEquals(error, ActualError);
	}

	@Test
	public void NegativeTestCase() throws FilloException {
		Recordset recordset = connection.executeQuery("Select * from Sheet1 where TestName='NegativeTestCase'");
		recordset.next();
		String UserName = recordset.getField("UserName");
		String Pasword = recordset.getField("Pasword");
		LoginPagesss Login2 = new LoginPagesss(driver);
		Login2.LoginFunction(UserName, Pasword);
		WebElement Ne = driver.findElement(By.id("login_button_container"));
		String Error = Ne.getText();
		String ActualError = recordset.getField("Errrmsg");
		Assert.assertEquals(Error, ActualError);
	}
}