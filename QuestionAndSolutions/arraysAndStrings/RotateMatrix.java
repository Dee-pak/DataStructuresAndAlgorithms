/**
 * Given an image represented by an NxN matrix, where each pixel in the 
 * image is 4 bytes,write a method to rotate the image by 90 degress. 
 * Can you do this in place.
 */
package arraysAndStrings;

/**
 * @author deepakkhobragade
 *
 */
public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] mat = { {1,2,3,4},
						{1,2,3,4},
						{1,2,3,4},
						{1,2,3,4}
					  };
		rotate(mat);
		for(int i = 0 ; i < 4 ; i++)
		{
			for( int j = 0 ; j < 4 ; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean rotate(int[][] mat) {
		if(mat.length == 0 || mat.length != mat[0].length)
			return false;
		int n = mat.length;
		for(int layer = 0 ; layer < n/2 ; layer++){
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last ; i++){
				int offset = i - first;
				int top = mat[first][i]; //save top
				
				//left-> top
				mat[first][i] = mat[last-offset][first];
				
				//bottom -> left
				mat[last-offset][first] = mat[last][last-offset];
				
				//right -> bottom
				mat[last][last - offset] = mat[i][last];
				
				//top -> right
				mat[i][last] = top; //right <- saved top
			}
		}
		return true;
	}

}
