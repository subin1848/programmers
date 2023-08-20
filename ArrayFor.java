import java.util.Scanner;

class ArrayFor
{
	public static void main(String args[])
	{		
		Scanner sc = new Scanner(System.in);

		int num[] = new int[3];	

		for(int i = 0; i < num.length; i++)
		{
			System.out.print("수를 입력하세요 : ");
			num[i] = sc.nextInt();
		}
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + "\t");
		}
	}
}