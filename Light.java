class Light
{
	public static void main (String args[])
	{
		long light = 0;
		
		for(int i = 1; i <= 60; i++)
		{
			for(int j = 1; j <= 60; j++)
			{
				for(int k = 1; k <= 24; k++)
				{
					light += 300000;
				}
			}
		}
			System.out.println("빛이 하루 동안 가는 거리 : " + light +"km");

	}


}