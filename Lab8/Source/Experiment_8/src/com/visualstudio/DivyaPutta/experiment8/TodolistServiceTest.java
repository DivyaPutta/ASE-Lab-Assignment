package com.visualstudio.DivyaPutta.experiment8;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TodolistServiceTest extends TestCase {
   
   TodolistService serviceobj = new TodolistService();
	String name = "milk, bread";
	String m = serviceobj.todolist(name);
	String TestResult="eggs";
	@Test
	public void test() {
		assertEquals(m, TestResult);
	}

   
}