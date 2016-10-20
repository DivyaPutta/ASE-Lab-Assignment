package com.visualstudio.DivyaPutta.experiment8;

import static org.junit.Assert.*;

import org.junit.Test;

public class Service2Test {
	Service2 serviceobj = new Service2();
	String name = "Divya";
	String t = serviceobj.helloName(name);
	String TestResult="Hello pioneer. Welcome to our groceries app, Saver n Saviour.";
	@Test
	public void test() {
		assertEquals(t, TestResult);
	}

}
