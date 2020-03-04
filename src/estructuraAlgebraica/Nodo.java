package estructuraAlgebraica;

public abstract class Nodo {
	public enum NodoTipo{
		OPERADOR,OPERANDO
	}
	
	/*Preescripbe un getter que devuelve el tipo de nodo (Operando/Operador)*/
	public abstract NodoTipo getNodoTipo();
}
