package co.edu.poli.adapter.model;

public class SocketAdapterImplem extends Socket implements SocketAdapter, X{

	@Override
	public Volt get120() {
		Volt v = new Volt();
		v.setValue(transVolt(v, 1.8));
		return v;
	}

	@Override
	public Volt get220() {
		Volt v = new Volt();
		v.setValue(transVolt(v, 1));
		return v;
	}
	
	public double transVolt(Volt v, double d) {
		return v.getValue()/d;
	}

	@Override
	public int method1() {
		return 5;
	}

}
