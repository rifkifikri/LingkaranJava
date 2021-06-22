package pertemuan2;

public class Main {
	
	public static void main(String[] args) {
		
		Lingkaran lingkaran = new Lingkaran();
		
		System.out.println("jari - jari Lingkaran "+lingkaran.jari);
		System.out.println("Phi Lingkaran "+lingkaran.phi);
		System.out.println("Keliling Lingkaran "+lingkaran.KLing());
		System.out.println("Luas Lingkaran "+lingkaran.LLing());
		
		System.out.println("=============================================");
		
		Tabung tabung = new Tabung();
		System.out.println("Volume Tabung "+tabung.VTabung());
		System.out.println("Luas Tabung "+tabung.LTabung());
	}
}
