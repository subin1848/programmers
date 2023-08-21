import java.util.Scanner;

class ForAvgRank
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count, student;

		System.out.println("**********************");
		System.out.println("*       반평균       *");
		System.out.println("**********************");
		System.out.println();
		System.out.println(); 
		System.out.print("입력받을 반의 개수 (2~4) ==> ");
		count = sc.nextInt();		//반 개수
		System.out.print("입력받을 학생 수 (2~4) ==> ");
		student = sc.nextInt();		//학생 수
		while(true)
		{
			if(count > 1 && count < 5)
			{	
				System.out.println();
				System.out.println("[ 총 " + count + "개의 반이 존재합니다. ]");
				System.out.println("[ 각 학습별 학생 수는 " + student + "명 입니다. ]");
				break;
			}
			else
			{
				System.out.println();
				System.out.println("[ 입력 가능한 반은 2~4반입니다. 다시 입력해주세요. ]");
				System.out.print("입력받을 반의 개수 (2~4) ==> ");
				count = sc.nextInt();
				System.out.print("입력받을 학생 수 (2~4) ==> ");
				student = sc.nextInt();
				
			}
		}	

		System.out.println();
		int classCount[] = new int[count*student];	//입력한 점수
		int sum[] = new int[count];		//각 반의 평균 합계

		for(int i = 0; i < classCount.length; i++)	
		{
			System.out.print("[" + (i+1) +"]" + (i%count+1) + "반 학생 점수 입력 (0~100) ==> ");	
			classCount[i] = sc.nextInt();

			if(classCount[i] < 0 || classCount[i] > 100)
			{
				do 
				{
					System.out.println();
					System.out.println("[ 잘못된 범위의 점수가 입력되었습니다. 다시 입력하세요. ]");	
					System.out.print("[" + (i+1) +"]" + (i%2+1) + "반 학생 점수 입력 (0~100) ==> ");
					classCount[i] = sc.nextInt();

				} while (classCount[i] < 0 || classCount[i] > 100);

			}

			sum[i%count] += classCount[i];	//sum[출력된 반] += score[입력한 점수]	//
		}

		double classAvg[] = new double[count];	//각 반 평균

		for(int i = 0; i < classAvg.length; i++)
		{
			classAvg[i] = sum[i]/(double)(student);
		}

		double maxAvg = classAvg[0], minAvg = classAvg[0];
		int maxCount = 1, minCount = 1;

		for(int i = 1; i < sum.length; i++)
		{
			if(maxAvg < classAvg[i])
			{
				maxAvg = classAvg[i];
				maxCount = (i + 1);
			} 
			else if(minAvg >= classAvg[i])
			{
				minAvg = classAvg[i];
				minCount = (i + 1);
			}
		}
		System.out.println();

		int classRank[] = new int[count];	//반 랭킹
		for(int i = 0; i < classRank.length; i++)
		{
			classRank[i] = 1;
		}

		for(int i = 0; i < classRank.length; i++)
		{
			for(int j = 0; j < classRank.length; j++)
			{
				if (classAvg[i] < classAvg[j])
				{
					classRank[i]++;
				}	
			}

		}


		for(int i = 0; i < classRank.length; i++)
		{
			System.out.printf("[%d반] 점수: %.2f - [%d등]\n", (i+1), classAvg[i], classRank[i]);
		}
		System.out.println();
		System.out.printf("[ 제일 잘한 반은 %d반이며, %d반의 평균 점수는 %.2f점으로, 제일 점수가 낮은 %d의 반의 평균은 %.2f점보다 %.2f점 높습니다. ]", maxCount, maxCount, maxAvg, minCount, minAvg, (maxAvg - minAvg));
		
	}
}
