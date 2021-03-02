
public class DmvSimulator {

	public static void main(String[] args) {

		System.out.println("Hello, welcome to DMV simulator! Generating your number to wait in line.");

		int Usernum = (int) (Math.random() * 100);
		System.out.println("Your number is " + Usernum + ". Please wait until your number is called.");

		System.out.println("The next number is....");

		for (int i = Usernum + 1; i <= 101; i++) {
			int count = i;

			if (count == 101) {
				i = 0;
				
			}

			if (count == Usernum) {

				System.out.println(" It's your turn");
				break;
			}

			System.out.println(count);

		}
		System.out.println("You do not have the correct paperwork. Go to the back of the line.");

	}
}
