import java.util.Scanner;

public class Studienberatung {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\tHast du ein Abitur(j/n): ");
		String a = scanner.next();
		
		
		if(a.equals("j")){
			System.out.print("\n\tBist du wissbegierig?(j/n)?: ");

			a = scanner.next();
				if(a.equals("j")){
				System.out.print("\n\tAuf jeden Fall studieren.");
				}
				else if(a.equals("n")){
				System.out.print("\n\tNicht studieren.");
				}
		}
		
		else if(a.equals("n")){
			
			System.out.print("\n\tHast du ein Fachabitur(j/n)?: ");
			a = scanner.next();
				if(a.equals("j")){
					
					System.out.print("\n\tHast du eine Berufsausbildung(j/n)?: ");
					a = scanner.next();
						if(a.equals("j")){
							
							System.out.print("\n\tWillst du sofort Geld verdienen(j/n)?: ");
							a = scanner.next();
								if(a.equals("j")){
									System.out.print("\n\tDu kannst spaeter noch studieren.");
								}
								else if(a.equals("n")){
									System.out.print("\n\tDann studier doch.");
								}
						}
						else if(a.equals("n")){
							System.out.print("\n\tBesser noch studieren.");
						}
				}
				else if(a.equals("n")) {
				System.out.print("\n\tNicht studieren.");
				}
		}
	}
	
}

