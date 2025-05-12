package org.entur.automat.oppgave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntervjuOppgaveApplication {

	public static void main(String[] args) throws IOException {
		UserList userList = new UserList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("Enter name, or blank to end: ");
			String name = br.readLine();
			if (name.isBlank()) {
				break;
			}
			userList.addUser(name);
		}
		System.out.println("All users: " + userList);
	}

}
