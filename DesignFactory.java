package com.ds.finals;

abstract class Plan{
	 protected int rate;
	 abstract void getRate();
	 public void processBill(int mins) {
		 System.out.println(mins*rate);
	 }
}

class Verizon extends Plan{
	void getRate() {
		rate=2;
	}
}

class Mint extends Plan{
	void getRate() {
		rate=1;
	}
}
class NetworkFactory{
	public Plan getPlan(String inp) {
		
		if(inp.equals("mint")) return new Mint();
		else if(inp.equals("verizon")) return new Verizon();
		
		return null;
	}	
	
}

class DesignFactory{
	public static void main(String[] a) {
		NetworkFactory nf=new NetworkFactory();
		Plan p=nf.getPlan("verizon");
		p.getRate();
		p.processBill(1);
	}
}
