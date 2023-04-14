package co.edu.poli.adapter.model;

public class SocketAdapterImplem extends Socket implements SocketAdapter{

	@Override
	public Volt get110() {
		Volt v = voltage();
		v.setValue(transVolt(v, 2));
		return v;
	}

	@Override
	public Volt get127() {
		Volt v = voltage();
		v.setValue(transVolt(v, 1.73));
		return v;
	}

	@Override
	public Volt get220() {
		Volt v = voltage();
		v.setValue(transVolt(v, 1));
		return v;
	}
	
	public double transVolt(Volt v, double d) {
		return v.getValue()/d;
	}


}
