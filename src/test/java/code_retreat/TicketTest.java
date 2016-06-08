package code_retreat;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TicketTest {
	
	private TicketTest GIVEN = this, THEN = this, WHEN = this, AND = this;
	
	@Test
	private void testCofeeDrinkerAddict() {
		GIVEN.coffeeAddict();
			WHEN.heJustAte();
		THEN.noPopCornButAddCffee();
	}
	

private void noPopCornButAddCffee() {
		// TODO Auto-generated method stub
		
	}


private void heJustAte() {
		// TODO Auto-generated method stub
		
	}


private void coffeeAddict() {
		// TODO Auto-generated method stub
		String person = Ticket.PERSON;
	}


@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
