package Time;

public class TimeConv {

	double min,sec,hour;
public double hourToMin(double hour)
{
	min=hour*60;
	return min;
}
public double hourToSec(double hour)
{
	sec=hour*60*60;
	return sec;
}
public double minToHour(double min)
{
	hour=min/60;
	return hour;
}
public double secToHour(double sec)
{
	hour=sec/3600;
	return hour;
}
}
