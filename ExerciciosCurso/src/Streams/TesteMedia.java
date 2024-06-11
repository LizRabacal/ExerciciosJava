package Streams;

public class TesteMedia {
	public static void main(String[] args) {
		Media m1 = new Media();
		Media m2 = new Media();
		
		m1.adc(8.3).adc(6.7);
		m2.adc(8.3).adc(9.7);
		
		Media m4 = Media.combinar(m1, m2);
		
		System.out.println(m4.getMedia());

	}

}
