package Inheritance;



	abstract class Pen
	{
		abstract void write();
		abstract void refill();
	}
	class Fountain extends Pen
	{
		void write()
		{
			System.out.println("This Pen Writes Smoothly");
		}
		void refill()
		{
			System.out.println("My Ink is Over!!Trying to use refill() to Refill My Ink");
		}
		void nib()
		{
			System.out.println("Fountain has Smooth-Ended Nib");
		}
	}
	public class pen {

		public static void main(String[] args) {
		Fountain f=new Fountain();
		f.write();
		f.nib();
		f.refill();

		}

	}

