package Massive;

/**
 * Created by y.onoprienko on 23.11.2016.
 */
public class Zadach_Mass {

    public static void main(String[] args) {

      //  int[] mas = {67, 87, 9, 2, 87, 34, 54, 8};

       // int min = min(setMassive1_10());
      //  int max = max(setMassive1_10());
       // changeVariables(max, min);
       // sredneeZnachenie(setMassive1_10());
      //  task2();
        task5();
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

        public static void task7() {

            int o =9;

            int [] obratn=new int[o];

            for (int i=0; i<obratn.length;i++) {

               

            }}
}



