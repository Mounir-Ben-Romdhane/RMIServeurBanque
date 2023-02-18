package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BanqueImp extends UnicastRemoteObject implements IBanqueRemote {
	
	public static  compte Compte[]= new compte[100];
	public static  int i=0;

	protected BanqueImp() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double Conv(double x) throws RemoteException {
		// TODO Auto-generated method stub
		return x/3.1;
	}
	
	@Override
	public void ajoutCompte(compte c1)throws RemoteException {
		// TODO Auto-generated method stub
		Compte[i]=c1;
		i++;
		System.out.println("Compte ajouter avec secces!");
	}

	@Override
	public void getList() throws RemoteException {
		// TODO Auto-generated method stub
		int j=0;
		while(j<Compte.length) {
			
			System.out.println( Compte[j].toString());
				 j++;
		}
		
	}
	
	@Override
	public compte[] getLists() throws RemoteException {
		// TODO Auto-generated method stub
		return this.Compte;
		}
		
	

	@Override
	public String getInfo(int id) throws RemoteException {
		// TODO Auto-generated method stub
		int j=0;
		while(j<Compte.length) {
			if(Compte[j].getCode()==id) {
				return Compte[j].toString();
				
			}else {
				j++;
			}
		}
		return null;
		
		
	}

	@Override
	public compte conselterCompte(int id) throws RemoteException {
		// TODO Auto-generated method stub
		int j=0;
		while(j<Compte.length) {
			if(Compte[j].getCode()==id) {
				return Compte[j];
				
			}else {
				j++;
			}
		}
		return null;
		
	}

	@Override
	public void crediter(int code,double soulde) throws RemoteException {
		// TODO Auto-generated method stub
		int j=0;
		while(j<Compte.length) {
			if(Compte[j].getCode()==code) {
				Compte[j].crediter(soulde);
				break;
			}else {
				j++;
			}
		}
	}

	@Override
	public void debiter(int code,double soulde) throws RemoteException {
		// TODO Auto-generated method stub
		int j=0;
		while(j<Compte.length) {
			if(Compte[j].getCode()==code) {
				if(soulde<=Compte[j].getSoulde()) {
						Compte[j].debiter(soulde);
				break;}
			}else {
				j++;
			}
		}
	}

}
