package com.example.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("circle")
@Component
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle");

	}

}
