package co.edu.poli.adapter.model;

public class Volt {
	
	double value;
	
	public double getValue() {
		return 220.0;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value;
	}

}
