import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {



//		        Scanner scan = new Scanner(System.in);
//		        int a = scan.nextInt();
//		        int b = scan.nextInt();
//		        int c = scan.nextInt();
//
//		        System.out.println(a);
//		        System.out.println(b);
//		        System.out.println(c);
		
		
		/*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else{
        
           if(n>=2 && n<=5) ans="Not Weird";
           else if(n>=6 && n<=20) ans="Weird";
           else if(n>20) ans = "Not Weird";
            
        }
        System.out.println(ans);*/
		
		try{
			 Scanner scan = new Scanner(System.in);
			 
			 while(true){
				 String temp = scan.nextLine();
				 System.out.println(temp);
				 if(temp.equalsIgnoreCase("Exit")) break;
			 }
		 
		 
		 
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
