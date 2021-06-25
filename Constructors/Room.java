package Constructors;
import java.util.logging.Logger;

public class Room {
	static Logger log=Logger.getLogger(Room.class.getName());
	int roomNo;
	String roomType;
	float roomArea;
	String acMachine;
	
	public Room(int roomNo,String roomType,float roomArea,String acMachine)
	{
		this.roomNo=roomNo;
		this.roomType=roomType;
		this.roomArea=roomArea;
		this.acMachine=acMachine;
	}
	public void display()
	{
		log.info("\nDetails\n Room number : "+roomNo+"\n Room Type : "+roomType+"\n Room Area(in sqfeet): "+roomArea+"\n AcMachine Type :"+acMachine+"\n");
	}
	public static void main(String[] args) {
		Room r=new Room(112,"Master Bedroom",225,"SplitAc");
		Room r1=new Room(001,"Twin Bedroom",100,"WindowAc");
		r.display();
		r1.display();
	}
}
