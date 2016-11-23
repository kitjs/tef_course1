package If_Case_While_Do;

public class MainIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c=3,d=3;
         
		if(a>=b&&a>=c&&a>=d) System.out.println("max= "+a);
		if(b>=a&&b>=c&&b>=d) System.out.println("max= "+b);
		if(c>=a&&c>=b&&c>=d) System.out.println("max= "+c);
		if(d>=a&&d>=c&&d>=b) System.out.println("max= "+d);
	}

}
