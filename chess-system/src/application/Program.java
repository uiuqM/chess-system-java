package application;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		System.out.println("ola java");
		Position pos = new Position(4, 5);
		pos.setValues(4, 2);
		System.out.println(pos);
	}

}
