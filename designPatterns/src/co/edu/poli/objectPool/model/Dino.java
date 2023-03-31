package co.edu.poli.objectPool.model;

public class Dino implements Creature {
	
	private static int counter = 1;

	private int id;

	public Dino() {
		id = counter++;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	@Override
	public String eat() {
		return "Plants";
	}

}
