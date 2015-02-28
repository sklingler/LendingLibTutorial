/**
 * 
 */
package com.totalbeginner.newbie;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author sean
 *
 */
public class PersonTest {

	/**
	 * Test method for {@link com.totalbeginner.newbie.Person#Person()}.
	 */
	@Test
	public void testPerson() {
		Person aPerson = new Person();
		assertEquals("unknown person", aPerson.getName());
		assertEquals(3, aPerson.getMaxBooks() );
	}

	/**
	 * Test method for {@link com.totalbeginner.newbie.Person#setName(java.lang.String)}.
	 */
	@Test
	public void testSetName() {
		Person aPerson = new Person();
		aPerson.setName("Fred Flintstone");
		assertEquals("Fred Flintstone",aPerson.getName());
	}

	@Test 
	public void testSetMaximumBooks() {
		Person aPerson = new Person();
		aPerson.setMaxBooks(15);
		assertEquals(15, aPerson.getMaxBooks());
	}
}
