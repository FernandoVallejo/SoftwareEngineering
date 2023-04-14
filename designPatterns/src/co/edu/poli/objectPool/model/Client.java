package co.edu.poli.objectPool.model;

public class Client {
	
	public static void main(String[] args) {
		
		CreaturePool pool = new CreaturePool();
		Giant g1 = (Giant) pool.checkOut("Giant");
		System.out.println("created "+ g1.getId() +" "+ g1);
		System.out.println(pool);
		Dino d1 = (Dino) pool.checkOut("Dino");
		System.out.println("created "+ d1.getId() +" "+ d1);
		System.out.println(pool);
		Giant g2 = (Giant) pool.checkOut("Giant");
		System.out.println("created "+ g2.getId() +" "+ g2);
		System.out.println(pool);
		pool.checkIn(g1);
		System.out.println("Insert at pool "+ g1.getId() +" "+ g1);
		System.out.println(pool);
		Giant g3 = (Giant) pool.checkOut("Giant");
		System.out.println("created "+ g3.getId() +" "+ g3);
		System.out.println(pool);
		pool.checkIn(d1);
		System.out.println("Insert at pool "+ d1.getId() +" "+ d1);
		System.out.println(pool);
		Dino d2 = (Dino) pool.checkOut("Dino");
		System.out.println("Extract object of the pool "+ d2.getId() +" "+ d2);
		System.out.println(pool);
		
	}

}
