package service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class serveur {

	public static void main(String[] args) throws RemoteException {
		try {
		LocateRegistry.createRegistry(5590);
		BanqueImp od=new BanqueImp();
		System.out.println(od.toString());
		Naming.rebind("rmi://localhost:5590/BK",od);
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}
