package com.ds.finals;

interface Franchise{
	public void option();
	public void cost();
}

class KFCFranchise implements Franchise{
	
	public void option() {
		System.out.println("KFC");
	}
	public void cost() {
		System.out.println("10,00,000");
	}
}

class Dominos implements Franchise{
	public void option() {
		System.out.println("Dominos");
	}
	public void cost() {
		System.out.println("20,00,000");
	}
}
class McDonalds implements Franchise{
	public void option() {
		System.out.println("McDonalds");
	}
	public void cost() {
		System.out.println("30,00,000");
	}
}

class FacadeReg{
	private Franchise KFC;
	private Franchise Dominos;
	private Franchise McDonalds;
	public FacadeReg() {
		KFC=new KFCFranchise();
		Dominos=new Dominos();
		McDonalds=new McDonalds();
	}
	
	public void buyKFC() {
		KFC.cost();
		KFC.option();
	}
	public void buyMCD() {
		McDonalds.cost();
		McDonalds.option();
	}
	public void buyDominos() {
		Dominos.cost();
		Dominos.option();
	}
	
	
}


public class FacadeDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeReg fr=new FacadeReg();
		fr.buyDominos();

	}

}
