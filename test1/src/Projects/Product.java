package Projects;


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
    }


    public class Product {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            Products [] productsArray =new Products[10];

            productsArray[0]=new Products("Fructs", "Apple", 2, 30);
            productsArray[1]=new Products("Fructs", "Peach", 1, 40);
            productsArray[2]=new Products("Vegitables", "Tomatoes",4, 50);
            productsArray[3]=new Products("Vegitables", "Onion", 2, 10);
            productsArray[4]=new Products("Vegitables", "Apple",3, 33);
            productsArray[5]=new Products("Technics", "PC", 2, 200);
            productsArray[6]=new Products("Technics", "laptop", 3, 600);
            productsArray[7]=new Products("Technics", "Apple", 1,500);
            productsArray[8]=new Products("Chemics", "cleaner",4, 700);
            productsArray[9]=new Products("Chemics", "voda", 2, 29);

            
            //************maxWeight************
            
            int maxWeight=productsArray[0].weight;
            for(int i=0; i<productsArray.length;i++){
                if(maxWeight<productsArray[i].weight){
                    maxWeight=productsArray[i].weight;
                }
            }
            System.out.println("maxWeight= "+maxWeight);
            
         //   *************maxPrice***********
        
        int maxPrice=productsArray[0].price;
        for(int i=0; i<productsArray.length;i++){
            if(maxPrice<productsArray[i].price){
            	maxPrice=productsArray[i].price;
            }
        }
        System.out.println("maxPrice= "+maxPrice);
        
   //   *************averageVeight***********
        
        
        int sumWeight=productsArray[0].weight;
        for(int i=1; i<productsArray.length;i++){
          
        	
        	sumWeight=productsArray[i].weight+sumWeight;
            }
        
       double averSumOfWeight=(double)sumWeight/10;
        
        System.out.println("averSumOfWeight= "+averSumOfWeight);
       
        
   //   *************averagePrice***********
        
        
        int sumprice=productsArray[0].price;
        for(int i=1; i<productsArray.length;i++){
          
        	
        	sumprice=productsArray[i].price+sumprice;
            }
        
       double averSumOfprice=(double)sumprice/10;
        
        System.out.println("averSumOfprice= "+averSumOfprice);
       
        //   *************findAllAllpes***********
        
        System.out.print("cells for apples = ");
        
        for(int i=0; i<productsArray.length;i++){
                  	        	
        	if(productsArray[i].name=="Apple"){
        		System.out.print( i+", ");
            }
        	
        }
        
        
        //   *************findAllpesWithMaxPrice***********
        
   System.out.println("\ncells for MaxPrice apples");
           
   int maxPriceAp=productsArray[0].price;
   int cell=0;
   
        for(int i=1; i<productsArray.length;i++){
                  	        	
        	if(productsArray[i].name=="Apple"&&productsArray[i].price>maxPriceAp){
        		      
        			maxPriceAp=productsArray[i].price;
        			cell=i;        			
        		}       		       		
        	
            }  System.out.println("cell= "+cell+"; price= "+ maxPriceAp);
       
            //   *************findAllTechnics***********
            
            
            System.out.print("findAllTechnics = ");
            
            for(int i=0; i<productsArray.length;i++){
                      	        	
            	if(productsArray[i].type=="Technics"){
            		System.out.print( i+", ");
                }
            	
            }
        
            
    
            
        }
              
        }
        
        
        
        
         
        
        
    



