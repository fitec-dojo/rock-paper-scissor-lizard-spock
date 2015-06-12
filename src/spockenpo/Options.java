package spockenpo;

public enum Options {
	
	TESOURA(0, 1, 3),
	PAPEL(1, 2, 4),
	PEDRA(2, 0, 3),
	LAGARTO(3, 1, 4),
	SPOCK(4, 0, 2);
	
	private int numero;
	private int item1;
	private int item2;
	
	
	private Options(int numero, int item1, int item2) {
		this.numero = numero;
		this.item1 = item1;
		this.item2 = item2;
	}

	public boolean beats(Options item) {
		return item1.numero==item.numero || item2.numero==item.numero;
	}
	
	
}
