package Inheritance;
abstract class Telephone
{
	abstract void lift();
	abstract void disconnected();
}
class SmartTelephone extends Telephone
{

	@Override
	void lift() {
		System.out.println("The person is in call");
		
	}

	@Override
	void disconnected() {
		System.out.println("The call has been disconnected");
		
	}
	
}

public class PhoneDemo {

	public static void main(String[] args) {
		SmartTelephone smart=new SmartTelephone();
		smart.lift();
		smart.disconnected();

	}

}
