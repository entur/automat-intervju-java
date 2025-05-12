package org.entur.automat.oppgave;

import java.util.ArrayList;
import java.util.List;

public class UserList {

	List<String> userList = new ArrayList<>();

	public void addUser(String user) {
		userList.add(user);
	}

	@Override
	public String toString() {
		return String.join(", ", userList);
	}
}
