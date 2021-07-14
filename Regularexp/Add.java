
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Add extends Remote {
    double add(double a,double b) throws RemoteException ;
}
