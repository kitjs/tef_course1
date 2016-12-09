package Massive_Simple;


 class  NewMassive {
	
	 int [] mas;
			 
	NewMassive(int n){
		
	this.mas = new int [n];

	}
}

public class ZadachiMasMultiple {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		task13_3_55();
		
	}
		
	
	public static void task13_3_51(){
		
		int a[]={2,6,4,8,6,4,5,8,3};
		int b[]={3,7,4,9,5,7,6,4,2};
		
		int c[]=new int [9];
		
		System.arraycopy(a, 0, c, 0,9);
		
		//for(int i=0;i<a.length;i++){
		//	System.out.print(", " + c[i]);
		//}
		
		System.arraycopy(b, 0, a, 0, 9);
		System.arraycopy(c, 0, b, 0, 9);
		
		for(int i=0;i<a.length;i++){
			System.out.print(", " + a[i]);
		}
		System.out.print("\n");
		
		for(int i=0;i<a.length;i++){
			System.out.print(", " + b[i]);
		}
		
	}

	
	public static void task13_3_53(){		
		
		int a[]={2,6,4,8,6,4,5,8,3};
		int b[]={3,7,4,9,5,7,6,4,2};		
		int c[]=new int [9];			
		
		for(int i=0; i<a.length; i++)
		{			
			
			if(a[i]<b[i]){
				System.arraycopy(b, i, c, i,1);	
			
			}
			if(a[i]>=b[i]){
				System.arraycopy(a, i, c, i,1 );	
			}					
		
					}	
		for(int i=0; i<a.length; i++){
			System.out.print(" , "+c[i]);
		}				
	}

public static void task13_3_55(){		
		
		int a[]={2,6,4,8,6,4,5,8,3};
			
		int b[]=new int [9];
		
		int k=0;
		for(int i=1;i<a.length;i+=2)
		{							
			System.arraycopy(a, i, b, k, 1);	
						
			System.out.print(" ,"+ b[k]);
			k=k+1;
		}
		System.out.println("\ndlina mas="+k);
}



}
