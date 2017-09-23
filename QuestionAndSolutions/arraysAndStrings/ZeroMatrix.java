/**
 * Write an Algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and cloumn are set to 0
 */
package arraysAndStrings;

/**
 * @author deepakkhobragade
 *
 */
public class ZeroMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix = 
			  { {1,2,3,4,5},
				{1,2,0,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5}
			  };
		
		setZeros(matrix);
		
		for(int i = 0 ; i < matrix.length ; i++){
			for(int j = 0 ; j < matrix[0].length ; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for(int i = 0 ; i < matrix.length ; i++){
			for(int j = 0 ; j < matrix[0].length ; j++){
				if(matrix[i][j] == 0 ){
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		//nullify rows
		for(int i = 0 ; i < row.length ; i++){
			if(row[i]){
				nullifyRow(matrix, i);
			}
		}
		
		//nullify columns
		for(int i = 0 ; i < column.length ; i++){
			if(column[i]){
				nullifyColumns(matrix, i);
			}
		}
	}

	private static void nullifyColumns(int[][] matrix, int column) {
		for( int i = 0 ; i < matrix.length ; i++){
			matrix[i][column] = 0;
		}
	}

	private static void nullifyRow(int[][] matrix, int row) {
		for(int i = 0 ; i < matrix[0].length ; i++){
			matrix[row][i] = 0;
		}
	}

}
