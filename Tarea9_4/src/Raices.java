
public class Raices {
	
	private double a;
	private double b;
	private double c;
	
	/**
	 * Metodo constructor por parametro
	 * @param a
	 * @param b
	 * @param c
	 */
	public Raices(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	/**
	 * Devolvmeos el resultado del discriminante
	 * @return
	 */
	public double getDiscriminante() {
		double res;
		double potencia=b*b;
		double multi=4*a*c;
		res=potencia-multi;
		return res;
	}
	/**
	 * Booleano que indicara si tiene dos soluciones
	 * @return
	 */
	public boolean tieneRaices() {
		boolean res=false;
		if(getDiscriminante()>=0) {
			res=true;
		}
		return res;
	}
	/**
	 * Devuelve booleano si solo tiene una solucion
	 * @return
	 */
	public boolean tieneRaiz() {
		boolean res=false;
		if(getDiscriminante()==0) {
			res=true;
		}
		return res;
	}
	/**
	 * Metodo en caso de que sea nula
	 * @return
	 */
	public boolean notieneRaiz() {
		boolean res=false;
		if(getDiscriminante()<0) {
			res=true;
		}
		return res;
	}
	
	/**
	 * Calculo ecuacion
	 * @return
	 */
	public double calcular() {
		double total;
		if(notieneRaiz()==true) {
			total=0;
		}
		else {
			double potencia=b*b;
			double multi=4*a*c;
			double resta;
			resta=potencia-multi;
			double raiz=Math.sqrt(resta);
			total=(-b+raiz)/(2*a);
			return total;
		}
		return total;
	}
	/**
	 * Devolvemos resultado de las raices
	 * @return
	 */
	public String obtenerRaices() {
		String aux="";
		if(tieneRaices()==true) {
			aux="Las soluciones son -"+calcular()+" y "+calcular();
		}
		return aux;
	}
	/**
	 * Devolvemos resultado de raiz
	 * @return
	 */
	public String obtenerRaiz() {
		String aux="";
		if(tieneRaiz()==true) {
			aux="Las soluciones es "+calcular();
		}
		return aux;
	}

}
