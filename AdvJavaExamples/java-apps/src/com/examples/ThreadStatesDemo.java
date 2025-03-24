package com.examples;

import java.lang.Thread.State;

public class ThreadStatesDemo {
	public static void main(String[] args) {
		State[] states = Thread.State.values();
		
		for(State state : states) {
			System.out.println(state);
		}
	}
}
