import java.util.Scanner;

class Prime
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println("소수가 아닙니다.");
				break;
			}
			else 
			{	
				System.out.println("소수입니다.");
				break;
			}
				
		}

	}
	
	

}