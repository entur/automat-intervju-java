package org.entur.automat.oppgave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntervjuOppgaveApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String: ");
		String input = br.readLine();
		System.out.println("hello world, " + input);
	}

}
