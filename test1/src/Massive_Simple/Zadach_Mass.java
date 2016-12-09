package Massive_Simple;

/**
 * Created by y.onoprienko on 23.11.2016.
 */
public class Zadach_Mass {

    public static void main(String[] args) {

     int[] mas = {1, 87, 9, 2, 7, 34, 54, 8};

       //  int min = min(setMassive1_10());
       //  int max = max(setMassive1_10());
       //  changeVariables(max, min);
       //  sredneeZnachenie(setMassive1_10());
       //  task2();
       //  task5();
       //  task7();
       //  task13_1_10(mas);
       //  task13_1_16(mas);
        // task13_2_19(mas);
        // task13_2_24();
        // task13_2_30();
         //  task13_2_54();
     
     task13_2_55();
    }
    // ============================================================================================

    public static int[] setMassive1_10() {

        int[] mas1 = {23, 35, 67, 7, 78, 45, 34, 23, 1, 10};
        return mas1;
    }


    //****************************************lesson 1-10. zadacha 2 ****************************************
    public static int min(int[] mas1) {

        int min = mas1[0];

        for (int n = 1; n < 10; n++) {

            if (min > mas1[n])

                min = mas1[n];

        }
        System.out.println("min = " + min);
        return min;
    }

    //****************************************lesson 1-10. zadacha 3 ****************************************
    public static int max(int[] mas1) {

        int max = mas1[0];
        for (int n = 1; n < 10; n++) {
            if (max < mas1[n])
                max = mas1[n];
        }
        System.out.println("max = " + max);
        return max;
    }

    //  ****************************************lesson 1-10. zadacha 4 ****************************************
    public static void sredneeZnachenie(int[] mas1) {

        int sum0 = 0;
        for (int i = 0; i < mas1.length; i++) {
            sum0 = sum0 + mas1[i];
        }

        double average = (double) sum0 / mas1.length;
        System.out.println("sum = " + sum0);
        System.out.println("average = " + average);
    }

    //****************************************lesson 1-10. zadacha 3 ****************************************
    public static void changeVariables(int max, int min) {

        int min1 = max;
        int max1 = min;

        System.out.println("min_first = " + min1);
        System.out.println("max_second = " + max1);


    }

    //****************************************Abramyan2.Task2 ****************************************
    public static void task2() {

       int [] stepen=new int[8];

        for (int i=0; i<stepen.length;i++){

           stepen[i]=(int)(Math.pow(2,i));
            System.out.print(stepen[i]+",");
        }

    }

    //****************************************Abramyan2.Task5 ****************************************
    public static void task5() {

        int o = 9;

        int[] stepen = new int[o];

        stepen[0] = 2;
        stepen[1] = 3;
        System.out.print(stepen[0] + "," + stepen[1] + ",");
        for (int i = 2; i < stepen.length; i++) {

            stepen[i] = stepen[i - 1] + stepen[i - 2];
            System.out.print(stepen[i] + ",");

        }
    }

    //****************************************Abramyan2.Task7 ****************************************
    //Dan massiv razmera N. Vivesti vse ego elementy v obratnom pariadke
    public static void task7() {

        int [] obratn={4,6,7,9,0,3,2,5,6};
        System.out.println("first massive:");

        for(int p=0;p<obratn.length;p++) {
         System.out.print(obratn[p]+", ");
}
       int [] copy= {4,6,7,9,0,3,2,5,6};
        System.out.println("\nsecond massive");
        for(int y=0; y<obratn.length;y++ ){
            switch (y)
            {
                case 0:
                    obratn[y]=copy[8];
                    System.out.print(obratn[y]+", ");
                    break;
                case 1:
                    obratn[y]=copy[7];
                    System.out.print( obratn[y]+", ");
                    break;
                case 2:
                    obratn[y]=copy[6];
                    System.out.print(obratn[y]+", ");
                    break;
                case 3:
                    obratn[y]=copy[5];
                    System.out.print(obratn[y]+", ");
                    break;
                case 4:
                    obratn[y]=copy[4];
                    System.out.print(obratn[y]+", ");
                    break;
                case 5:
                    obratn[y]=copy[3];
                    System.out.print( obratn[y]+", ");
                    break;
                case 6:
                    obratn[y]=copy[2];
                    System.out.print(obratn[y]+", ");
                    break;
                case 7:
                    obratn[y]=copy[1];
                    System.out.print(obratn[y]+", ");
                    break;
                case 8:
                    obratn[y]=copy[0];
                    System.out.println(obratn[y]+", ");
                    break;
            }
        }            
            }
    
    //****************************************Abramyan2.task13_1_10 ****************************************
    //Dan massiv razmera N. Vivesti chentie v poriadke vozrastaniia pozitsii, nechetnie v poriadke ubivania
    
    public static void task13_1_10(int[] mas){
	
	System.out.print("chetnye elementy\n");
	
	for(int i=0;i<mas.length;i++){
	
	if(mas[i]%2==0)
	{
		System.out.println("i= "+i+"; znachenie= "+ mas[i]);
	}
	}	
	
	System.out.println("\nnechetnye elementy");
	
	for(int y=7;y>=0;y--){
		
		if(mas[y]%2!=0)
		{
			System.out.println("i= "+y+"; znachenie= "+ mas[y]);
		}
	
}
}

    //****************************************Abramyan2.task13_1_16****************************************
    //Dan massiv razmera N. Vivesti elementy v sleduyshchem poriadke A1, AN, A2, AN–1, A3, AN–2,

    public static void task13_1_16(int[] mas){

	
	int h=0;
	for (int i=0; i<4;i++){
		
		
					System.out.println("number i ="+i+"; znachenie= "+mas[i]);
		     h=7-i;
		     System.out.println("number y ="+h+"; znachenie= "+mas[h]);
			if(i==5)
			{System.out.println("5=" + i);}
	}
	}	

	//****************************************Abramyan2.task13_2_19****************************************
	

	public static void task13_2_19(int[] mas){
		
		int k= mas[0];
		int y=mas[7];
		
		for (int i=7;i>0;i--)
		{
			if(k<mas[i]&&mas[i]<y)
			{System.out.println("Ak="+mas[i]+"; i="+i);
					break;	}
		}
		
}
	
	//****************************************Abramyan2.task13_2_24******************************
	
	public static void task13_2_24(){
		
		int [] mas1={3,5,7,5,3,9};
		int [] mas2={2,4,6,8,10,12,14,16};
		
		 System.out.println("first-");
		 int raznitsia1=0;
		 
		for (int i=0; i<4;i++){
			if(mas1[i+1]-mas1[i]==mas1[i+2]-mas1[i+1])
			{ 				
				raznitsia1=mas2[i+1]-mas2[i];
			}
			else{raznitsia1=0;				
			break;}			
			}
		System.out.println("raznitsia1="+raznitsia1);
		System.out.println("second+");
	 
		int raznitsia=0;
	 
		for (int i=0; i<mas2.length-2;i++){
			if(mas2[i+1]-mas2[i]==mas2[i+2]-mas2[i+1])
				{ 			
			raznitsia=mas2[i+1]-mas2[i];
			}
		else{raznitsia=0;
			System.out.println("0");
		break;}
		}
		System.out.println("raznitsia="+raznitsia);
		}
	
	//****************************************Abramyan2.task13_2_19******************************
	
	public static void task13_2_30(){
		
		int [] mas2={2,1,6,8,7,6,5,2};
			
		for(int i =0; i<mas2.length-1;i++){
			if(mas2[i]>mas2[i+1])
			{System.out.println(" "+i);
			
		
			}}
		}
	
	//****************************************Abramyan2.task13_2_30******************************

	public static void task13_2_54(){
		
		int mas[]={3,6,8,4,8,5,9,2,1};
		
		int masB[]=new int[9];
		int sum=0;
		
		for(int i=0;i<mas.length;i++){
			
			if(mas[i]%2==0){
				masB[sum]=mas[i];
				sum=sum+1;
				System.out.println("masB "+masB[sum-1]);
			}		
					}		
	}	
	
	
public static void task13_2_55(){
		
		int mas[]={3,6,8,4,8,5,9,2,1,6,7,9,3};
		
		//int masB[]=new int[9];
		
		int sum=0;
		
		
		for(int i=1;i<mas.length-2;i=+2){
			
			int masB []= new int [i];
			
			for(int y=0; y<mas.length-3; y++){
				
			masB[y]=mas[i];
			
			System.out.println("B= "+ masB[sum] );
			sum=sum+1;
			break;
			}
			}		
					}		
	}	
	
	

		
	


