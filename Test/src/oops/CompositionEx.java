package oops;
class Sim{
	int simNo;
	public Sim(int simNo) {
		this.simNo=simNo;
	}
	public void simMethod() {
		System.out.println("call connected...");
	}
}
class Mobile{
	Sim s;
	int imeNo;
	public Mobile(Sim s,int imeNo) {
		this.imeNo=imeNo;
		this.s=s;
		
	}
	public void mobileMethod() {
		s.simMethod();
		System.out.println("make a call ");
		System.out.println("ime NO : "+imeNo);
		System.out.println("sim no :  "+s.simNo);
	}
}
class CompositionEx 
{
	public static void main(String[] args) {
		Sim s = new Sim(5555);
		Mobile m = new Mobile(s,9999);
		m.mobileMethod();
	}
}
