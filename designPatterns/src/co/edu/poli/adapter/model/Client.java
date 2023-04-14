package co.edu.poli.adapter.model;

public class Client {
	
	public static void main(String[] args) {
		SocketAdapterImplem s = new SocketAdapterImplem();
		
		System.out.println("Converted 220V to " + s.get110() + "V");
	}

}
