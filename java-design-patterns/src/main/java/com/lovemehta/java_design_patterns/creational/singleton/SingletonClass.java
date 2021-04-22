package com.lovemehta.java_design_patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;

// Useful when classes are expensive to create or have a shared form of state across application - db connections, loggers, app configurations etc

@Getter
@Setter
public class SingletonClass {

	private String infoString = "default string";

	private SingletonClass() {

	}

	private static class SingletonHolder {
		public static final SingletonClass instance = new SingletonClass();
	}

	public static SingletonClass getInstance() {
		return SingletonHolder.instance;
	}
}
