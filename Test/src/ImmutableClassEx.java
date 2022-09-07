public class ImmutableClassEx 
{
	private final String s;  
	ImmutableClassEx(final String s)
	{  
		this.s = s;  
    }  
    public final String getName() 
    {  
    	return s;  
    } 
    public static void main(String[] args) 
    {  
    	ImmutableClassEx obj = new ImmutableClassEx("Core Java Training");  
    	System.out.println(obj.getName());  
    } 
}
