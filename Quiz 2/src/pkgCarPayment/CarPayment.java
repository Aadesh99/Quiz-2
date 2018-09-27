package pkgCarPayment;

public class CarPayment{
	
	private int PriceofCar;
	private int LoanLength;
	private int dPayment;
	private double irate;
	
	public CarPayment (int PriceofCar, int LoanLength, int dPayment, double irate) {
		
		super();
		
		this.PriceofCar=PriceofCar;
		this.LoanLength=LoanLength;
		this.dPayment=dPayment;
		this.irate= irate;
		
	}
	public double MonthPayments() {
		return (double) ((irate/12)*(PriceofCar-dPayment))/((1-Math.pow((1+irate/12), (-1*LoanLength))));
	}
	
	public double InterestPaid() {
		return (double)((irate/12)*(PriceofCar-dPayment))*(LoanLength)/(1-Math.pow((1+irate/12),(-1*LoanLength)))-(PriceofCar-dPayment);
	}
	
	
	
}
