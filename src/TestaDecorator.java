
public class TestaDecorator {
	
	public static void main(String[] args) {
	
	Adicional acai = new Acai();
	System.out.println(acai.getDescricao());
	System.out.println("Custo: " + acai.custo());
	Adicional banana = new Banana(acai);
	System.out.println(banana.getDescricao());
	System.out.println("Custo: " + banana.custo());
	
	Adicional morango = new Morango(acai);
	morango = new LeiteCondensado(morango);
	
	System.out.println(morango.getDescricao());
	System.out.println("Custo: " + morango.custo());
	
}
}
