package Strategy;

public class RoverMarciano {
	
	public static void main(String[] args) {
		
		Strategy strategy1 = new Analisar1();
		Strategy strategy2 = new Analisar2();
		
		strategy1.analisarAmostra();
		strategy2.analisarAmostra();
		
	}
	
}
