import java.util.Scanner;

public class borrador4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner input = new Scanner(System.in);
			Fraction fraction_1 = new Fraction();
			Fraction fraction_2 = new Fraction();
			System.out.print("Enter first fraction: ");
			String first = input.nextLine().trim();
		
			// partial validation for fraction 1
			while(true) {
				int count = 0;
				for(int i = 0; i < first.length(); i++) {
					if(first.charAt(i)=='/') {
						count++;
					}
					
				}
				if(count > 1) {
					System.out.print("Re-enter first fraction: ");
					first = input.nextLine().trim();
				}
				if(count == 1) {
			
					break;
					
				}
				
			}
			
			System.out.print("Enter second fraction: ");
			String second = input.nextLine().trim();
			
			// partial validation for fraction 2
			while(true) {
				int count = 0;
				for(int i = 0; i < second.length(); i++) {
					if(second.charAt(i)=='/') {
						count++;
					}
					
				}
				if(count > 1) {
					System.out.print("Re-enter second fraction: ");
					second = input.nextLine().trim();
				}
				if(count == 1) {
			
					break;
					
				}
				
			}
			fraction_1 = getFraction(first);
			fraction_2 = getFraction(second);
			// operations
			System.out.println("");
			System.out.println("Sum : "+fraction_1.add(fraction_2));
			System.out.println("Difference: "+fraction_1.subtract(fraction_2));
			System.out.println("Product: "+fraction_1.multiply(fraction_2));
			System.out.println("Quotient: "+fraction_1.divide(fraction_2));
		}
		public static Fraction getFraction(String fraction) {
			String part_1 = fraction.substring(0, fraction.indexOf("/")).trim();
			String part_2 = fraction.substring(fraction.indexOf("/")+1).trim();
			int num = Integer.parseInt(part_1);
			int denom = Integer.parseInt(part_2);
			return new Fraction(num,denom);

		}
		
}
