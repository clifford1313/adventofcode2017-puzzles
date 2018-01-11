package com.adventofcode2017.puzzles;

import java.util.HashMap;

import com.adventofcode2017.IPuzzle;

public class Puzzle3 implements IPuzzle {
	private final int INPUT = 312051;
	private HashMap<Node, Integer> nodes = new HashMap<Node, Integer>();
	@Override
	public void execute() {
		int cur = 1;
		int curx = 0;
		int cury = 0;
		while(cur <= INPUT) {
			if(nodes.containsKey(new Node(curx, cury))) {
				
			}
		}
	}
	
	
	private class Node {
		int x;
		int y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
