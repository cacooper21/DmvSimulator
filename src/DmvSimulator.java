
public class DmvSimulator {

	public static void main(String[] args) {

		System.out.println("Hello, welcome to DMV simulator! Generating your number to wait in line.");

		int Usernum = (int) (Math.random() * 200);
		System.out.println("Your number is " + Usernum + ". Please wait until your number is called.");

		System.out.println("The next number is....");

		for (int i = Usernum + 1; i <= 201; i++) {
			int count = i;

			if (count == 201) {
				i = 0;

			}

			if (count == Usernum) {

				System.out.println(" It's your turn");
				break;
			}

			System.out.println(count);

		}
		int Usernum2 = (int) (Math.random() * 100);

		if (Usernum2 == 1) {
			System.out.println("You have the correct paperwork. You are all set.");
		}

		else {
			System.out.println("You do not have the correct paperwork. Go to the back of the line. muahahahahah!");
		}
	}
}
