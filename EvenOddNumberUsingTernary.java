package Programs;

import java.util.Scanner;

public class EvenOddNumberUsingTernary {

	public static void main(String ap[]) {
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
		reader.close();
	}
}
