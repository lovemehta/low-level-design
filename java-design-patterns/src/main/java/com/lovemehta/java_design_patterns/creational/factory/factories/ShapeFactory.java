package com.lovemehta.java_design_patterns.creational.factory.factories;

import com.lovemehta.java_design_patterns.creational.factory.impls.Square;
import com.lovemehta.java_design_patterns.creational.factory.impls.Triangle;
import com.lovemehta.java_design_patterns.creational.factory.interfaces.MyShape;

//Factory insures that if someday we change the implementation class square changes to rectangle then the client doesnt have to make changes.

public class ShapeFactory {

	public static MyShape getShape(int numSides) {

		switch (numSides) {
		case 3:
			return new Triangle();
		case 4:
			return new Square();
		default:
			return null;
		}
	}
}
