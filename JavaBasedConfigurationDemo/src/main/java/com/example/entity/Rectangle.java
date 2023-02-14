package com.example.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("rectangle")
@Component
public class Rectangle {

	//@Override
	public void draw() {
		System.out.println("Rectangle");
	}

}
