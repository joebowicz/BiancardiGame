/*
 * Joe Gavin Charlie
 * 
 */

public class Self extends Contestant{

	private int points;
	private String name;
	private int height;
	private int weight;
	private int IQ;
	private double GPA;
	
	public Self(int p,String name, int h,int w, int iq, double gpa)
	{
		super(p, getName(), h, w, iq, gpa);
	}
	
	public void answer()
	{
		
	}
	
	public static String getName()
	{
		return "Joe";
	}
	
}
