package Projects.copy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by y.onoprienko on 28.11.2016.
 */


    public class ProductFile2 {   	
    	        	
        public static void main(String[] args) throws FileNotFoundException {
           
             Scanner scan = new Scanner(new File("D:\\Work_course_Idea\\in\\products.txt"));
             
             Products [] prod= new Products[scan.nextInt()];
             
            for(int i=0; i<prod.length;i++){
            	
            	prod[i]= new Products (scan.next(),scan.next(),scan.nextInt(),scan.nextInt());
            }
            for(int i=0; i<prod.length;i++){
            	
            	prod[i].print();
            }
        }
              
        }
        
        
        
        
         
        
        
    



