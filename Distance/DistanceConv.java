package Distance;

public class DistanceConv {
	double metre,miles,km;
	public double metreToKm(double metre)
	{
		km=metre*0.001;
		return km;
	}
	public double milesToKm(double miles)
	{
		km=miles*1.60934;
		return km;
	}
	public double kmToMetre(double km)
	{
		metre=km*1000;
		return metre;
	}
	public double kmToMiles(double km)
	{
		miles=km*0.621371;
		return miles;
	}
}
