
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImpl extends UnicastRemoteObject implements Add{
    AddImpl() throws RemoteException
    {
        super();
    }
    @Override
    public double add(double a,double b)
    {
        return a+b;
    }
}
