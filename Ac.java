class Ac
{
	static String type;
	static String color;
	static double price;
	static boolean isConnected;
	
	public static boolean onOrOff()
	{
		System.out.println("inside onOrOff()");
		if(isConnected==false)
		{
		isConnected=true;
        System.out.println("Ac is on");
		}
		
  else if(isConnected==true)
		{
		isConnected=false;
        System.out.println("Ac is off");
		}
		return isConnected;
	}
}