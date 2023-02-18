package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBanqueRemote extends Remote{

	public double Conv(double x)throws RemoteException;
	public void ajoutCompte(compte c1) throws RemoteException;
	public void getList()throws RemoteException;
	public String getInfo(int id)throws RemoteException;
	public compte[] getLists()throws RemoteException;
	public compte conselterCompte(int id)throws RemoteException;
	public void crediter(int code,double soulde)throws RemoteException;
	public void debiter(int code,double soulde)throws RemoteException;
	
}
