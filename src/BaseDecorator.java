
public class BaseDecorator implements Adicional {
	private Adicional wrapper;
	
	public BaseDecorator(Adicional a) {
		wrapper = a;
	}

	@Override
	public String getDescricao() {
		return wrapper.getDescricao();
		
	}

	@Override
	public double custo() {
		return wrapper.custo();
		
	}
	
}

