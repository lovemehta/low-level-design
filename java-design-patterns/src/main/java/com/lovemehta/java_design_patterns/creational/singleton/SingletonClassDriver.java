package com.lovemehta.java_design_patterns.creational.singleton;

public class SingletonClassDriver {

	public static void main(String[] args) {

		SingletonClass s1 = SingletonClass.getInstance();

		SingletonClass s2 = SingletonClass.getInstance();

		s1.setInfoString("this is s1");

		System.out.println(s2.getInfoString());
	}
}
