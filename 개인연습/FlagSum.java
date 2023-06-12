import java.util.Scanner;

class FlagSum
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;

		for(int i=0; i<=n; i++)
		{
			if(i%2 == 0)
			{
				sum = sum - i;
			}
			else
			{
				sum = sum + i;
			}
		}
		System.out.println("결과 : " + sum);
			


	}


}