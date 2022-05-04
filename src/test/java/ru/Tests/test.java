package ru.Tests;

import static org.junit.Assert.*;
import static ru.model.User.ROLE.ADMIN;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Assert;
import org.junit.Test;

import ru.model.User;
import ru.realize.UserDAO;

public class test {
	final String login = "Admin";
	final String password = "12342";
	private AtomicReference<UserDAO> dao;
	@Test
	public void test() {
		 
		
		dao = new AtomicReference<>(new UserDAO());
		dao.get().add(new User(1, "Admin", "12342", ADMIN));
		final User.ROLE role = dao.get().getRoleByLoginPassword(login, password);
		
		Assert.assertEquals(User.ROLE.ADMIN, role);
		
	}

}
