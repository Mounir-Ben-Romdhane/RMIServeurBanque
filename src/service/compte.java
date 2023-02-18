package service;

import java.io.Serializable;

public class compte implements Serializable {
	private int code;
	private double soulde;
	
	public compte(int code,double soulde) {
		this.code=code;
		this.soulde=soulde;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public double getSoulde() {
		return this.soulde;
	}
	
	public String toString() {
		return "Code : "+code+" Soulde : "+soulde;
		
	}
public void crediter(double soulde) {
		
		this.soulde+=soulde;
		
	}
	
public void debiter(double soulde) {
		
		this.soulde-=soulde;
		
	}
}