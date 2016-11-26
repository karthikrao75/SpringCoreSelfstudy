package com.Info.karthik.Annotation.cab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Info.karthik.Annotation.Engine.V8Engine;

@Component
public class Car {
	
	@Autowired
private V8Engine engine;

	public V8Engine getEngine() {
		return engine;
	}




}
