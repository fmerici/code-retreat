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
	
	private Ticket ticket;
	private TicketTest GIVEN = this, THEN = this, WHEN = this, AND = this;
	
	@Test
	private void testCofeeDrinkerAddict() {
		GIVEN.coffeeAddict();
			WHEN.heJustAte();
		THEN.noPopCornButAddCoffee();
	}
	

	private void noPopCornButAddCoffee() {
		// TODO Auto-generated method stub
		System.out.println("I WANT COFFEE: " + ticket.getCoffee() +", but NO POPCORN");
	}


	private void heJustAte() {
		// TODO Auto-generated method stub
	new Ticket().setWhenDinner(true);
	}


	private void coffeeAddict() {
		// TODO Auto-generated method stub
		System.out.println(ticket.getPerson());
	}


@Test(enabled = false, dataProvider = "dp")
  public void ftest(Integer n, String s) {
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
	  ticket = new Ticket();
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
