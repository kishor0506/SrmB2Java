package Currency;

public class Currencyconv {
	double rupee;
	double dollar,euro,yen;
	
	public double dollarToINR(double dollar)
	{
		rupee=dollar*74.15;
		return rupee;
	}
	public double euroToINR(double euro)
	{
		rupee=euro*88.55;
		return rupee;
	}
	public double yenToINR(double yen)
	{
		rupee=yen*0.67;
		return rupee;
	}
	public double rupeeToDollar(double rupee)
	{
		dollar=rupee*0.013;
		return dollar;
	}
	public double rupeeToEuro(double rupee)
	{
		euro=rupee*0.011;
		return euro;
	}
	public double rupeeToYen(double rupee)
	{
		yen=rupee*1.50;
		return yen;
	}
}
