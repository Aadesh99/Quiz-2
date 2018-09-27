package pkgCarPayment;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


class TestCase {

	

	@Test
	void testInterestPaid() {
		CarPayment test =new CarPayment(35000,60,0,0.10);
		double value= 9618.79;
		double result= test.InterestPaid();
		assertEquals (value,result,.01);
		
	}
	@Test
	void testInterestPaid_2() {
		CarPayment test =new CarPayment(35000,60,15000,0.10);
		double value= 5496.45;
		double result= test.InterestPaid();
		assertEquals (value,result,.01);
	}
	@Test
	void testMonthPayments() {
		CarPayment test =new CarPayment(35000,60,15000,0.10);
		double value= 424.94;
		double result= test.MonthPayments();
		assertEquals (value,result,.01);
	}
	
	@Test
	void testMonthPayments_2() {
		CarPayment test =new CarPayment(35000,60,0,0.10);
		double value= 743.65;
		double result= test.MonthPayments();
		assertEquals (value,result,.01);
	}
}
