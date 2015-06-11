//https://www.hackerrank.com/challenges/cavity-map


import java.util.Scanner; 

class CavityMap {
	public static void main(String []args) {
		int n;
		String m ;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		String[] map = new String[n];
		for ( int i = 0 ; i < n ; i++ ){
			m = input.next();
			map[i] = m;
		}
		String[] resultmap = new String[n];
		for(int i=0; i<n; i++){
			resultmap[i] = map[i];
		}
		for(int i=1;i<n-1;i++){
			String row = map[i];
			String prevRow = map[i-1];
			String nextRow = map[i+1];

			for(int j=1;j<n-1;j++){
				int digit = Integer.parseInt(row.substring(j, j+1));
				int south = Integer.parseInt(nextRow.substring(j, j+1));
				int north = Integer.parseInt(prevRow.substring(j, j+1));
				int east = Integer.parseInt(row.substring(j+1, j+2));
				int west = Integer.parseInt(row.substring(j-1, j));

				if(digit>south & digit >north & digit>east & digit>west){
					resultmap[i] = resultmap[i].substring(0, j) + 'X' + resultmap[i].substring(j+1, n);
				}
			}

		}
		for(int i =0;i<n;i++){
			System.out.println(resultmap[i]);
		}
	}

}




