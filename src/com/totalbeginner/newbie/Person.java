/**
 * 
 */
package com.totalbeginner.newbie;

/**
 * @author sean
 *
 */
public class Person {
	private String name;
	private int maxBooks;

	/**
	 * 
	 */
	public Person() {
		name = "unknown person";
		maxBooks = 3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxBooks() {
		return maxBooks;
	}

	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}
}
