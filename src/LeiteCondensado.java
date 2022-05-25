
public class LeiteCondensado extends BaseDecorator {

	public LeiteCondensado(Adicional a) {
		super(a);
	}
	@Override
	public String getDescricao() {
		return "Acrescimo de leite condensado";
	}
	@Override
	public double custo() {
		return 2;
	}
	
}
