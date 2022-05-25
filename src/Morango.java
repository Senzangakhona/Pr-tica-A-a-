
public class Morango extends BaseDecorator {
	
	public Morango (Adicional a) {
		super(a);
	}
	
	@Override
	public String getDescricao() {
		return "Acrescimo de morangos";
	}
	
	@Override
	public double custo() {
		return 2;
	}
}
