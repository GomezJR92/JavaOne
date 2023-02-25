
public class CrearCuenta {

	public static void main(String[] args) {

		cuenta primeraCuenta = new cuenta();
		primeraCuenta.saldo = 400;
		// primeraCuenta.pais = "Peru"; No compila

		System.out.println(primeraCuenta.saldo);

		cuenta segundaCuenta = new cuenta();
		segundaCuenta.saldo = 400;

		System.out.println(segundaCuenta.saldo);
		//System.out.println(primeraCuenta.agencia);

		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);

		if (primeraCuenta == segundaCuenta) {

			System.out.println("Son el mismo objeto");
		} else {

			System.out.println("Son diferentes");
		}
	}

}
