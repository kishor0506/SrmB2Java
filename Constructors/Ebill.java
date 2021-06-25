package Constructors;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ebill {
	static Logger log=Logger.getLogger(Ebill.class.getName());
	int consumerNo;
	String consumerName;
	int prevMonReading;
	int currMonReading;
	String TypeofConn;
	double costperunit;
	int actUnit;
	double amt=0;
	
	public void getData(int consumerNo, String consumerName, int actUnit, String typeofConn,double amt) {
		
		this.consumerNo = consumerNo;
		this.consumerName = consumerName;
		this.prevMonReading = prevMonReading;
		this.currMonReading = currMonReading;
		this.TypeofConn = typeofConn;
		this.actUnit=actUnit;
		this.amt=amt;
	}
	public double calc(String Type,int actUnit)
	{
		if(Type.equalsIgnoreCase("domestic"))
		{
			if(actUnit<=100)
			{
				amt+=actUnit*1;
			}
			else if(actUnit>101 && actUnit<200)
			{
				amt+=actUnit*2.50;
			}
			else if(actUnit>201 && actUnit<500)
			{
				amt+=actUnit*4.00;
			}
			else if(actUnit>501)
			{
				amt+=actUnit*6;
			}
			else
			{
				log.info("Provide valid units");
			}
		}
		else if(Type.equalsIgnoreCase("commercial"))
		{
			if(actUnit<=100)
			{
				amt=amt+(actUnit*2);
			}
			else if(actUnit>101 && actUnit<200)
			{
				amt=amt+(actUnit*4.50);
			}
			else if(actUnit>201 && actUnit<500)
			{
				amt=amt+(actUnit*6.00);
			}
			else if(actUnit>501)
			{
				amt=amt+(actUnit*7);
			}
			else
			{
				log.info("Provide valid units");
			}
		}
		return amt;
	}

	void display()
	{
		log.info("\nELETRICITY BILL");
		log.info("\n************");
		log.info("\nConsumer Number: "+consumerNo);
		log.info("\nConsumer Name: "+consumerName);
		log.info("\nType of Connection: "+TypeofConn);
		log.info("\nUnits: "+actUnit);
		log.info("\nBill Amount: "+amt);
		log.info("\n************");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		log.info("Please enter consumer details...");
		log.info("Enter Consumer Number: ");
		int no=sc.nextInt();
		log.info("Enter Consumer Name: ");
		String name=sc.next();
		log.info("Enter Previous month reading: ");
		int pmr=sc.nextInt();
		log.info("Enter Current month reading: ");
		int cmr=sc.nextInt();
		log.info("Type of Connection (domestic or commercial): ");
		String type=sc.next();
		int actUnit=cmr-pmr;
		Ebill e=new Ebill();
		double billamt=e.calc(type,actUnit);
		e.getData(no,name,actUnit,type,billamt);
		e.display();
	}

}