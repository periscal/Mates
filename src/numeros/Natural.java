package numeros;
import java.math.BigInteger;

public class Natural{
	protected BigInteger unidades;
	
	public Natural() {	
		
	}
	
	public Natural(String numero) {
		BigInteger e = new BigInteger(numero);
		this.unidades=e.abs();
	}
	
	public Natural(BigInteger numero) {
		this.unidades=numero.abs();
	}

	public BigInteger getUnidades() {return unidades;}
	public void setUnidades(BigInteger unidades) {this.unidades = unidades;}
}
