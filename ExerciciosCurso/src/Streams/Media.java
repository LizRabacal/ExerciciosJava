package Streams;

public class Media {
	private double total;
	private int qtd;
	
	public Media adc(double valor) {
		total+=valor;
		qtd++;
		return this;
				
	}

	public double getMedia() {
		return total/qtd;
	}
	
	public static Media combinar (Media m1, Media m2) {
		Media r = new Media();
		r.total = m1.total + m2.total;
		r.qtd = m1.qtd + m2.qtd;
		
		return r;
	}
}
