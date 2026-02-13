package array;

import java.util.Arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		int [][][] bulding =new int [3][2][4];
		int room=1;
		
		for(int layer=0;layer<bulding.length;layer++) // layer
		{
			for(int row=0;row<bulding[layer].length;row++) //row
			{
				for(int col=0;col<bulding[layer][row].length;col++) // column
				{
					bulding [layer][row][col]=room; //[0][0][0] =1 [0][0][1]=2 [0][0][2]=3 [0][0][3]=5
					room++;							//[0][1][0] =6 [0][1][1]=7 [0][1][2]=8 [0][1][3]=9
													
					                                //[1][0][0] =9 [1][0][1]=10 [1][0][2]=11 [1][0][3]=12
													//[1][1][0] =13 [1][1][1]=14 [1][1][2]=15 [1][1][3]=16
				}
			}
					
		}
		for(int layer=0;layer<bulding.length;layer++)
		{
			System.out.println("Floor " +(layer+1)+": ");
			for(int row=0;row<bulding[layer].length;row++)
			{
				for(int col=0;col<bulding[layer][row].length;col++)
				{
					System.out.print(bulding[layer][row][col]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
				
		}

	}

}
/* 3D array store layer--> row--> column
 * 
 * 
 * 
 * */
