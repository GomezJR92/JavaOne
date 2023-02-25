
public class TipoVariable {

		public static void main(String[] args) {
			
			System.out.println("Hola Mundo!!!");
			
			double salario= 1250.56;
			System.out.println(salario);
			
			double edad= 28;
			double salarioMitad= salario/2;
			System.out.println(salarioMitad);
			
			int division= 1250/3;
			System.out.println(division);
			
			double variable1 = 230.89;
			int variable1Entero = (int) variable1; // este ejemplo es un Cast
			System.out.println(variable1Entero);
			
			long prueba = 12222222222222222L; // para numeros mas grandes usamos LONG y lleva una L al final el numero
			short numeroPequeno = 13555;
			byte numeroAunMasPequeno = 15;
			float numeroDecimalPequeno= 2.5F;
			
			double resultado = variable1 + variable1Entero;
			System.out.println(resultado);
		}
		
}
