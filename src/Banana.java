
public class Banana extends BaseDecorator {
	
	public Banana (Adicional a) {
		super(a);
	}
	
	@Override
	public String getDescricao() {
		return "Acrescimo de banana picada";
	}
	
	@Override
	public double custo() {
		return 2;
	}
}
