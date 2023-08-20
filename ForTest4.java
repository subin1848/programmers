import java.util.Scanner;
class ForTest4 
{
	public static void main (String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("10 이하의 정수를 입력하세요 : ");
		int i = sc.nextInt();	
		int j;
	
		if(i<=10)
		{

			for(j=0; j<i; j++)
			{
				System.out.println("MSG");
			}
		}	
		else
		{
				System.out.println("해당 범위에 값이 들어있지 않습니다. ");
		}


	}


}