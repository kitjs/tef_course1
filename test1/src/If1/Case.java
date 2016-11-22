package If1;

import java.io.IOException;

/**
 * Created by y.onoprienko on 21.11.2016.
 */
public class Case {


    public static void main(String args[]) throws IOException{
        test1();
    }



    public static void test1() throws IOException {
        System.out.println("set integer from 1 to 4");
   int j= System.in.read();
int x1=4;
        int x2=2;

        switch(j) {
                case 1:System.out.println(x1+x2);
                case 2:System.out.println(x1-x2);
                case 3:System.out.println(x1*x2);
                case 4:System.out.println(x1/x2);
        }

    }
    public void test2(){

    }
    public void test3(){

    }
    public void test4(){

    }
    public void test5(){

    }
}
