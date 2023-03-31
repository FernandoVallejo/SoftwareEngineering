package co.edu.poli.objectPool.model;

public class Client {
	
	public static void main(String[] args) {
		
		CreaturePool pool = new CreaturePool();
		Giant g1 = (Giant) pool.checkOut("Giant");
		System.out.println("created "+ g1.getId() +" "+ g1);
		System.out.println(pool);
		Dino g2 = (Dino) pool.checkOut("Dino");
		System.out.println("created "+ g2.getId() +" "+ g2);
		System.out.println(pool);
		Giant g3 = (Giant) pool.checkOut("Giant");
		System.out.println("created "+ g3.getId() +" "+ g3);
		System.out.println(pool);
		pool.checkIn(g1);
		System.out.println("Insert at pool "+ g1.getId() +" "+ g1);
		System.out.println(pool);
		Giant g4 = (Giant) pool.checkOut("Giant");
		System.out.println("created "+ g4.getId() +" "+ g4);
		System.out.println(pool);
		pool.checkIn(g2);
		System.out.println("Insert at pool "+ g2.getId() +" "+ g2);
		System.out.println(pool);
		Dino g5 = (Dino) pool.checkOut("Dino");
		System.out.println("Extract object of the pool "+ g5.getId() +" "+ g5);
		System.out.println(pool);
		
	}

}
