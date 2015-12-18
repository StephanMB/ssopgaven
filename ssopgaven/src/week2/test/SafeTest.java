package week2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import week2.hotel.Safe;
import week2.hotel.Password;

public class SafeTest {
	
	private Safe safe;
	private Password rightPass;
	private Password wrongPass;

	@Before
	public void setUp() {
		rightPass = new Password();
		rightPass.setWord("password", "wrongwrong");
		wrongPass = new Password();
		wrongPass.setWord("password", "wrongwrong");

		safe = new Safe(rightPass);
	}

	@Test
	public void constructorTtest() {
		assertEquals(safe.getPassword(), rightPass);
		assertFalse(safe.isActive());
		assertFalse(safe.isOpen());
	}
	
	@Test
	public void activeTest() {
		assertFalse(safe.isActive());
		safe.activate();
		assertTrue(safe.isActive());
		assertFalse(safe.isOpen());
		safe.activate();
		assertTrue(safe.isActive());
		assertFalse(safe.isOpen());
	}
	@Test
	public void deactivateTest() {
		assertFalse(safe.isActive());
		safe.activate();
		assertTrue(safe.isActive());
		assertFalse(safe.isOpen());
		safe.deactivate();
		assertFalse(safe.isActive());
		assertFalse(safe.isOpen());
		safe.deactivate();
		assertFalse(safe.isActive());
		assertFalse(safe.isOpen());
	}
	
	@Test
	public void openTest() {
		assertFalse(safe.isActive());
		assertFalse(safe.isOpen());
		
		safe.open(rightPass.getWord());
		assertFalse(safe.isActive());
		assertFalse(safe.isOpen());

		safe.open(wrongPass.getWord());
		assertFalse(safe.isActive());
		assertFalse(safe.isOpen());

		safe.activate();
		assertTrue(safe.isActive());
		assertFalse(safe.isOpen());

		safe.open(wrongPass.getWord());
		assertTrue(safe.isActive());
		assertFalse(safe.isOpen());

		safe.open(rightPass.getWord());
		assertTrue(safe.isActive());
		assertTrue(safe.isOpen());
	}


}
