import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import test.RetTypes;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (!br.readLine().equals("x")) {
			System.out.println("next");

			RetTypes retTypes = new RetTypes();
			retTypes._void();
			retTypes._int();
			retTypes._intArray();
			retTypes._long();
			retTypes._char();
			retTypes._String();
			retTypes._StringArray();
			retTypes._double();
			retTypes._Object();
			retTypes._Integer();
			retTypes._IntegerArray();
			retTypes._Long();
			retTypes._Char();
			retTypes._Double();
		}

	}
}
