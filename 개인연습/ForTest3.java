class ForTest3 
{
	public static void main (String args[])
	{
		int num1 = 0;
		System.out.println("홀수 : ");

		for (num1 = 1; num1 <= 20; num1++)
		{
			if(num1 % 2 == 1)
			{
				System.out.println(num1);
			}	
		}

		System.out.println("짝수 : ");

		for (num1 = 1; num1 <= 20; num1++)
		{
			if (num1 % 2 == 0)
			{
				System.out.println(num1);
			}

		}

	}

}