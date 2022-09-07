package oops;

public class EncapsulationEx 
{
	private int id;
	public int  getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public static void main(String[] args) 
	{
		EncapsulationEx e = new EncapsulationEx();
		e.setId(2);
		System.out.println(e.getId());
	}
}
