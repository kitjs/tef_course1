package Massive_Matrix;

public class MatrixMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matr={{1,2,3},
					  {7,40,8}};
		int myMax=matr[0][0];
		int sum=0;		
		for(int i=0;i<matr.length;i++){
			sum=0;
			myMax=matr[i][0];
			for(int j=0; j<matr[i].length; j++){
				if(myMax<matr[i][j])
					myMax=matr[i][j];
				sum=sum+matr[i][j];
			}
			if(myMax>20) System.out.println("i= "+i+" max= "+myMax);
			System.out.println(sum);
			System.out.println(sum/matr[i].length);
		}
	}

}
