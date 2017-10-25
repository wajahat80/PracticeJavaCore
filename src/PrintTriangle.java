
public class PrintTriangle {

	public PrintTriangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		for(int l=1 ; l<=5 ; l++){
			for(int k=0 ; k<l ; k++)
				System.out.print("*");
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i=5 ; i>=0 ; i--){
			for(int j=0 ; j<=i ; j++)
				System.out.print("*");
			System.out.println("");
		}

	}

}
