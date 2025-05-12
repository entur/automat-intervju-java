package org.entur.automat.oppgave;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserListTests {

	@Test
	void shouldConcatenateStrings() {
		UserList userList = new UserList();
		userList.addUser("foo");
		userList.addUser("bar");
		userList.addUser("faz");
		assertEquals("foo, bar, faz", userList.toString());
	}

}
