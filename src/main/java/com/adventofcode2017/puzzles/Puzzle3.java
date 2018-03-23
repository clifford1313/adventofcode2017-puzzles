package com.adventofcode2017.puzzles;

import java.util.HashMap;

import com.adventofcode2017.IPuzzle;

public class Puzzle3 implements IPuzzle {
	private final int INPUT = 312051;
//	private final int INPUT = 37;
	@Override
	public void execute() {
		//determine which square is the good one
		int squarenb = 1;
		int squaresize = 0;
		for(int i = 2;;i+=2) {
			if(i * i > INPUT) {
				break;
			}
			squarenb++;
			squaresize = i;
		}
		
		System.out.println("Square nb = " + squarenb + " - Square size = " + squaresize);
		
		//determine position of INPUT in the square
		int sc1 = squaresize * squaresize;
		int sc2 = 0;
		int inputpos = 0;
		for(int i = 0; i < 4; i++) {
			sc2 = sc1 + squaresize;
			if(sc1 < INPUT && sc2 > INPUT) {
				int mid = (sc1 + sc2) / 2;
				inputpos = Math.abs(INPUT - mid);
				break;
			}
			sc1 = sc2;
		}
		
		System.out.println("Result = " + (inputpos + squarenb));
	}
}
