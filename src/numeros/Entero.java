package numeros;

public class Entero extends Natural{
	private boolean signo;	//True -> Positivo , False -> negativo
	
	public Entero(boolean signo, Natural natural) {
		super.unidades = natural.getUnidades();
		this.signo=signo;
	}
	
	public Entero(String numero) {
		super(numero);
		numero.strip().startsWith("-");
		this.signo =  numero.strip().startsWith("-")?false:true;
	}

	public boolean isSigno() {return signo;}
	public void setSigno(boolean signo) {this.signo = signo;}
}
