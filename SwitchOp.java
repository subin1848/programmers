import java.util.Scanner;

class SwitchOp
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("수식 입력(수와 연산자 사이는 공백을 둘 것) : ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String op = " ";
		String result;

		op = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		switch (op)
		{	
			case "+":
				result = Integer.toString (num1 + num2);
				break;

			case "-":
				result = Integer.toString (num1 - num2);
				break;

			case "*":
				result = Integer.toString (num1 * num2);
				break;

			case "/":
				result = Integer.toString (num1 / num2);
				break;

			default :
				result = ("사칙연산자가 아닙니다.");

		}
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	
	}


}