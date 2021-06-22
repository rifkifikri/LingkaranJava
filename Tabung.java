package pertemuan2;

public class Tabung extends Lingkaran{
	double tinggi=13;
	public double LTabung() {
		return (2*phi*jari*(jari+tinggi));
	}
	
	public double VTabung () {
		return phi*(jari*jari)*tinggi;
	}
	
}
