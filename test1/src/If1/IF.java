package If1;

/**
 * Created by y.onoprienko on 16.11.2016.
 */
public class IF {
    public static void main(String args[]) {


        //*******************1******************************
        System.out.println("task 1");

        //int x =((int) Math.floor((Math.random()*10)));
        //System.out.println(x);

        int y = ((int) (Math.random() * 100 - 50));
        System.out.println(y);

        if (y > 0) {
            y = y + 1;
            System.out.println("2y= " + y);
        } else {
            System.out.println(y);
        }

        //*******************3******************************
        System.out.println("task 3");

        int y2 = ((int) (Math.random() * 100 - 50));
        System.out.println(y2);

        if (y2 > 0) {
            y2 = y2 + 1;
            System.out.println("2y= " + y2);
        }
        if (y2 == 0) {
            y2 = 10;
            System.out.println("y2= " + y2);
        }
        if (y2 < 0) {
            y2 = y2 - 2;
            System.out.println("-y2= " + y2);
        }

        //*******************4******************************
        System.out.println("task 4");

        int x1;
        int x2;
        int x3;

        x1 = ((int) (Math.random() * 100 - 50));
        x2 = ((int) (Math.random() * 100 - 50));
        x3 = ((int) (Math.random() * 100 - 50));

        System.out.println("x1= " + x1);
        System.out.println("x2= " + x2);
        System.out.println("x3= " + x3);

        //1
        int h = 0;

        if (x1 > 0) {
            h = +1;
        }
        if (x2 > 0) {
            h = +1;
        }
        if (x1 > 0) {
            h = h + 1;
        }
        System.out.println("count= " + h);

        //*******************5******************************
        System.out.println("task 5");
        int v1;
        int v2;
        int v3;

        v1 = ((int) (Math.random() * 100 - 50));
        v2 = ((int) (Math.random() * 100 - 50));
        v3 = ((int) (Math.random() * 100 - 50));

        System.out.println("v1= " + v1);
        System.out.println("v2= " + v2);
        System.out.println("v3= " + v3);

        //1
        int k = 0;
        int j = 0;

        if (v1 > 0) {
            k = +1;
        } else {
            j = j + 1;
        }

        if (v2 > 0) {
            k = +1;
        } else {
            j = j + 1;
        }
        if (v1 > 0) {
            k = k + 1;
        } else {
            j = j + 1;
        }
        System.out.println("count+= " + k + "\ncount-= " + j);


        //*******************9******************************
        System.out.println("task 9");

        double t= Math.random()*100;
        double r=Math.random()*100;

        System.out.println("r="+r +" t="+ t);
        if(t>r){
           double l=r;
            double m=t;
            System.out.println("rm=" + m + " tl=" + l);

        }else {
            System.out.println("r=" + r + " t=" + t);
        }


        //*******************10******************************
        System.out.println("task 10");

        int h1=((int)(Math.random()*10));
        int h2=((int)(Math.random()*10));

        System.out.println("h1=" + h1);
        System.out.println("h2=" +h2);

        if(h1!=h2){
           int summ= h1+h2;
            h1=summ;
            h2=summ;

        }else{
            h1=0;
            h2=0;
        }
        System.out.println("after: h1=" + h1);
        System.out.println("after: h2=" +h2);



        //*******************19******************************
        System.out.println("task 19");

        double  b1=-3.565;
    double b2;
        if(b1>0) {
            b2 = 2 * (Math.sin(b1));
        }  else{
                b2=6-b1;
            }
        System.out.println("b2= "+ b2);

        //*******************28******************************
        System.out.println("task 28");

   int u =2017;

        if(u%4==0) {
            if (u % 100 == 0 && u % 400 != 0) {
                System.out.println("365+");
            } else {
                System.out.println("366+++");
            }

        } else{  System.out.println("365++");   }



    }}

