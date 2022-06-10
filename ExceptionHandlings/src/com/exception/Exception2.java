package com.exception;

public class Exception2 {
	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.out.println(10 / 0);
		}
		// when catch is not present according to the type of exception in this
		// case exception is thrown after the finally block

		catch (NullPointerException npe) {
			System.out.println("in catch");
		} finally {
			System.out.println("in finally");
		}
		// this will not run
		System.out.println("after try cat finally");
	}
}
