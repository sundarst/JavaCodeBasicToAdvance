package array;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		//declare + create 2D array
//		int number[][]=new int [3][4];                
//		int count=3;
//		for(int i=0;i<number.length;i++) // outer loop //row
//		{
//			for(int j=0;j<number[i].length;j++) // inner loop // column
//			{
//				number[i][j]=count; //[0][0] =1 [0][1]=2 [0][2]=3  //[1][0]=4 [1][1]=5 [1][2]=6  //[2][0]=7 [2][1]=8 [2][2]=9
//				count++;
//			}
//			System.out.println(Arrays.toString(number[i]));
//		}
		
//		for(int i=0;i<number.length;i++)
//		{
//			for(int j=0;j<number[i].length;j++)
//			{
//				System.out.print(number[i][j]+" ");
//			}
//			System.out.println();
//		}
		
	
		
		//Declare + initialized
				int array[][]= {{1,2,3},
								{4,5,6},
								{7,8,9}}; // 3 row 3 column
				
				for(int i=0;i<array.length;i++)
				{
					for(int j=0;j<array[i].length;j++)
					{
						System.out.print(array[i][j]+" "); //[0][0]=1 [0][1]=2 [0][2]=3
															//[1][0]=4 [1][1]=5 [1][2]=6
															//[2][0]=7 [2][1]=8 [2][2]=9
					}
					System.out.println();
				}

	}

}
/* 1.2D Array where data are arrange in row and column
 * 
 * 
 * 
 * 
 */