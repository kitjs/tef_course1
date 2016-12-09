package Projects.copy;

import java.util.Scanner;

/**
 * Created by y.onoprienko on 28.11.2016.
 */

    class Products {

        int weight;
        int price;
        String name;
        String type;

        Products(String type, String name, int weight, int price) {

            this.type=type;
            this.name=name;
            this.weight=weight;
            this.price=price;
        }

			public void print() {					    			
	    		System.out.println("type= "+type+"; name="+name +"; weight"+weight+"; price"+price);
		}
    }


    public class ProductConsole {   	
    	        	
        public static void main(String[] args) {
            // TODO Auto-generated method stub

        	Scanner sc= new Scanner(System.in);        	
        	System.out.println("vvedite kolich produktov(int)");        	
        	        	 
        	while (!sc.hasNextInt())
        		{ System.out.println("Not int. Try again.");
        		sc.nextLine(); 
        		}        	
        	
        	int n =  sc.nextInt();        	 
           
        	Products [] productsArray =new Products[n];
           
        	System.out.println("kolichestvo prod="+n);    
             
             for(int i =0; i<n;i++){
            	 
            	 System.out.println("type produktaString=");  
            	 String type = sc.next();
            	 System.out.println("name produktaString=");
            	 String name = sc.next();
            	 System.out.println("weight produkta (int)=");
            	 int weight = sc.nextInt();
            	 System.out.println("price produkta (int)=");
               	 int price = sc.nextInt();
             	
            	 productsArray[i]=new Products(type,name,weight,price);
             }
             
             
             for(int i=0; i<productsArray.length;i++) {
            	productsArray[i].print();
            	             	             }
             
                            
                
            
        }
              
        }
        
        
        
        
         
        
        
    



