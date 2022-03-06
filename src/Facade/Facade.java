package Facade;

public class Facade {

	public String obterDadosDoCondutor() {
		
		SistemaDetran detran = new SistemaDetran();
		SistemaFabricante fabricante = new SistemaFabricante();
		
		return detran.obterDados() + fabricante.obterDados();
		
	}
	
}
