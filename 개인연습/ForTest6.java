import java.util.Scanner;

class ForTest6
{
	public static void main (String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 10개를 입력하세요 : ");
		int i, num, result = 0;
		

		for(i = 0; i < 10; i++)
		{	
			num = sc.nextInt();

			if(num % 3 == 0 || num % 5 == 0)
			{
				result = result + 1;
				
			}
			
		
		}System.out.print("3과 5의 배수의 개수 : " + result);
				
	}


}