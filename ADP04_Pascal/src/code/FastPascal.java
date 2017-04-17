package Test;


/**
 * This class imlpements the Pascal's triangle with binominal-coefficient-method. (Up to 65'th row)
 * 
 * @author Martin
 *
 */
public class FastPascal extends APascal {

	  
	/**
	 * This method gives a int-array of whole numbers with the N'th row of the Pascal's triangle.
	 * 
	 * @param N
	 * @return
	 */
	public int[] calcNRow(int N){
		int[] ergArray = new int[N+1];
		if(N == 0){
			ergArray[0] = 1;
		} else {
			for(int i = 0; i < ergArray.length; i++){
				ergArray[i] = binomialCoefficient(N, i);
			}
		}		
		return ergArray;
	}
	
	/**
	 * n over k 
	 * @param n and k must be whole numbers.
	 */
	private int binomialCoefficient(int n, int k){
		int erg = 0;
		if(k == 0){
			return 1;
		} else {
			long zaehler = 1;
			long nenner = 1;
			for(int i = 1; i <= k; i++){
				globalCount++;
				zaehler = zaehler * n;
				n--;
			}
			for(int i = 1; i <= k; i++){
				globalCount++;
				nenner = nenner * i;
			}
			erg = (int) (zaehler/nenner);
		}
		return erg;
	}
	
	public static void printArr(int[] arr){
	    for (int i=0; arr.length > i; i++){
	      System.err.print(arr[i]);
	    }
	    System.err.println();
	  }
	
	public static void main(String [] args){
		FastPascal fp = new FastPascal();
		fp.calcNRow(65);
		System.err.println(String.format("%d", globalCount));
	}

}
