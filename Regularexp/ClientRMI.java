
import java.rmi.Naming;


public class ClientRMI {
   public static void main(String args[]){  
try{  
Add mul=(Add)Naming.lookup("rmi://localhost:1900/remoteData");  
System.out.println(" Result : "+mul.add(25.5,8.7));  
}catch(Exception e){}  
}   
}
