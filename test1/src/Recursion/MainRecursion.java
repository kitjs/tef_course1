package Recursion;

/**
 * Created by y.onoprienko on 24.11.2016.
 */
public class MainRecursion {

    // n!= n*(n-q)!

    static int fact1(int n){
        if(n==0||n==1) return 1;
        int myFact=1;
        for(int i= i=2;i<=n;i++){
            myFact=i*myFact;
                    }
        return myFact;
    }
    static int fact2(int n){
        if(n==0||n==1) return 1;
        return n*fact2(n-1);

    }

    //F(n)= F(n-1)+F(n-22)

static int fib1(int n){

    if(n==0||n==1) return 1;
   int z=1,y=1,x=1;
    for(int i=2;i<=n;i++){
        z=y+x;
        x=y;
        y=z;
    }
    return z;
}

static int fib2(int n)
{
    if(n==0||n==1) return 1;
    return fib2(n-1)+fib2(n-2);

}


    public static void zad1()
    {
        int[] mas = {3,-6,8,-52,4,6,5,6};
        int sum=0;
            for(int j=0;j<mas.length;j++) {
                if (mas[j]<0){
                    sum=sum+mas[j];
                }
            }
        System.out.println("sum= "+sum);
             }

    public static void zad2()
    {
        int[] mas = {3,-6,8,-52,4,6,5,6};

        int max=0;
        int min=0;

       // int mas1=0;
        int mas2=mas[0];

        int iMin=0,iMax=0;


        for(int j=1; j<mas.length;j++) {



            if (mas[j] < mas[j - 1]&&mas[j]<min) {
                min = mas[j];
                iMin=j;
            }
            if (mas[j] > mas[j - 1]&&mas[j]>max) {
                max = mas[j];
                iMax=j;
            }
            mas2 = mas[j];


        }




       // System.out.println("= "+min+" "+ mas2);
        System.out.println("min,max= "+min+" "+ max+" "+iMin+" "+iMax);
    }

    public static void main(String[] args) {

     //   zad1();
        zad2();


//      int[] mas = {3,6,8,52,4,6,5,6};
//
//        for(int i=0;i<mas.length;i++){
//            for(int j=0;j<mas.length;i++){
//                if(mas[j]>mas[j+1]){
//                    int temp=mas[j];
//                    mas[j]=mas[j+1];
//                    mas[j+1]=temp;
//                }
//            }
 //       }




    }
}
