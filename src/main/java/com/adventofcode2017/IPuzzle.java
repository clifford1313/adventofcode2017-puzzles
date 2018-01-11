package com.adventofcode2017;

public interface IPuzzle {
	default void execute() {
		System.out.println("I am " + this.getClass().getName());
	}
}
