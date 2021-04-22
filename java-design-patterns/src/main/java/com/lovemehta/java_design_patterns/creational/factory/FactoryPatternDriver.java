package com.lovemehta.java_design_patterns.creational.factory;

import com.lovemehta.java_design_patterns.creational.factory.factories.ShapeFactory;
import com.lovemehta.java_design_patterns.creational.factory.interfaces.MyShape;

public class FactoryPatternDriver {

	public static void main(String[] args) {

		MyShape square = ShapeFactory.getShape(4);

		square.getType();
	}
}
