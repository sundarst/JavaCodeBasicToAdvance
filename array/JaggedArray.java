package array;

public class JaggedArray {

	public static void main(String[] args) {
		int jaggedArray[][]= {{1,2},{3,4,5},{6,7}};
		for(int i=0;i<jaggedArray.length;i++)
		{
			for(int j=0;j<jaggedArray[i].length;j++)
			{
				System.out.print(jaggedArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
/*Jagged Array row can have different column size
 * 
 *Eample in where we use jagged array in real time project 
 *
 *2. Storing different number of seats in cinema rows

Example:
Some rows have 10 seats, some 8, some 12 → jagged array fits perfectly.
 * 
 *
 */