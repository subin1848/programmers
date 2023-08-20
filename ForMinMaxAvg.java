import java.util.Scanner;

class ForMinMaxAvg
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count, score;

		System.out.println("**********************");
		System.out.println("*       반평균       *");
		System.out.println("**********************");
		System.out.println();
		System.out.println(); 
		System.out.print("입력받을 반의 개수 (2~4) ==> ");
		count = sc.nextInt();
		
		while(true)
		{
			if(count > 1 && count < 5)
			{
				System.out.println("[ 총 " + count + "개의 반이 존재합니다. ]");
				break;
			}
			else
			{
				System.out.println();
				System.out.println("[ 입력 가능한 반은 2~4반입니다. 다시 입력해주세요. ]");
				System.out.print("입력받을 반의 개수 (2~4) ==> ");
				count = sc.nextInt();
			}
		}	
		System.out.println();
		int classCount[] = new int[count*2];

		for(int i = 0; i < count * 2 ; i++)
		{
			System.out.print("[" + (i+1) +"]" + (i%count+1) + "반 학생 점수 입력 (0~100) ==> ");
			classCount[i] = sc.nextInt();
	
				while( classCount[i] < 0 || classCount[i] > 100)
				{
					System.out.println();
					System.out.println("[ 잘못된 범위의 점수가 입력되었습니다. 다시 입력하세요. ]");	
					System.out.print("[" + (i+1) +"]" + (i%2+1) + "반 학생 점수 입력 (0~100) ==> ");
					classCount[i] = sc.nextInt();
				}
		}
				
		double classAvg[] = new double[count];

		for(int i = 0; i < count; i++)
		{
			classAvg[i] = (double)(classCount[i] + classCount[i+count])/2;
		}
		
		int max = 0;
		int min = 0;

		for(int i = 0; i < count; i++)
		{
			if(classAvg[max] < classAvg[i]) 
			{
				max = i;
			}
			if(classAvg[min] >= classAvg[i])
			{
				min = i;
			}
		}
		System.out.println();
		System.out.printf("[ 제일 잘한 반은 %d반이며, %d반의 평균 점수는 %.2f점으로, 제일 점수가 낮은 %d의 반의 평균은 %.2f점보다 %.2f점 높습니다. ]", max+1, max+1, classAvg[max], min+1, classAvg[min], classAvg[max] - classAvg[min]);
		
	}
}