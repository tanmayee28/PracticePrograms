package extraProgram;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Play {

	static int row=10,col=10;
	public static void main(String[] args) {
		
		//int []arr= {1,2,3,4,5,6,7,8,9,10};
		
		int [][]arr=new int[row][col]; 
		for(int i=1;i<arr.length;i++)
		{
			for(int j=1;j<arr[i].length;j++)
			{
				arr[i][j]=j;
			}
			
		}
		runGame(arr);
		
		
	}
	static void runGame(int[][] arr)
	{
		
		Scanner sc=new Scanner(System.in);
		int cnt=1;
		 int chance=1;
		int no=ThreadLocalRandom.current().nextInt(1,(row*col));
		Target t=setTarget(no);
		System.out.println("Lets start the game !!! ");
		System.out.println(t);
		while(true)
		{
			System.out.println("Enter your no :");
			int uno=sc.nextInt();
			if(uno==t.x || uno==t.y || uno== t.z)
			{
				System.out.println("Hit the target..");
				
				if(cnt==3)
				{
					System.out.println(" You hit the target in "+chance+" "+"chances" );
					break;
				}
				cnt++;
			}else {
				System.out.println("You miss the target");
				
			}
			chance++;
		}
		}
	static Target setTarget(int no)
	{
		Target target=new Target(no,no+1,no+2);
		return target;
	}
}
class Target
{
	int x=0;
	int y=0;
	int z=0;
	public Target(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		return "Target [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}