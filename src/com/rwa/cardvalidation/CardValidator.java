package com.rwa.cardvalidation;

public class CardValidator {

	
	public static void validate(String[] cardNos){
		for(int i=0 ; i<cardNos.length ; i++){
			String cardNo = cardNos[i];
			validateCard(cardNo);
		}
	}
	
	private static String validateCard(String cardNo){
		
		// Replace the whitespace or hyphen
		cardNo = cardNo.replaceAll("\\s+","").replaceAll("[-]+",""); 
		
		// Validate: Card Must be number
		boolean isNumber = cardNo.matches("[0-9]+");
		
		//System.out.print(cardNo+"-");
		//System.out.print(isNumber+"-");
		
		if(isNumber){
			if((cardNo.matches("3[47][0-9]+")) && cardNo.length()==15){// AMEX | 34 or 37 | 15 |
				System.out.print("AMEX: ");
			}
			else if(cardNo.startsWith("6011") && cardNo.length()==16){// Discover | 6011 | 16 |
				System.out.print("Discover: ");
			}
			else if(cardNo.matches("5[1-5][0-9]+") && cardNo.length()==16){// MasterCard | 51-55 | 16 |
				System.out.print("MasterCard: ");
			}
			else if(cardNo.startsWith("4") && (cardNo.length()==16||cardNo.length()==13)){ // Visa | 4 | 13 or 16
				System.out.print("VISA: ");
			}
			else{
				System.out.print("UNKNOWN: ");
			}
			
			System.out.print(cardNo);
			validateLuhn(cardNo);

		}
		
		
		
		
		
		
		
		return "Invalid";
	}
	
	
	private static void validateLuhn(String str){
		int[] intArr = str.chars().map(x -> x - '0').toArray();
		//System.out.println("==="+intArr.length);
		int sum=0;
		for (int i = intArr.length-1; i >= 0 ; i--) {
			if(i%2==0){
				if(intArr[i]*2<=9){
					sum+=intArr[i]*2;
				}
				else{
					int temp[] = Integer.toString((intArr[i]*2)).chars().map(x->x-'0').toArray();
					sum += (temp[0]+temp[1]);
				}
			}
			else{
				sum+=intArr[i];
			}
		}
				
		if(sum% 10 == 0){
			System.out.println("(VALID)");
		}
		else{
			System.out.println("(INVALID)");
		}
		
	}
	
	
}
