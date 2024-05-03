package tarea;

public class Email implements ServicioMensajeria {

	@Override
	public void enviarMensaje(String mensaje) {

		System.out.println("Enviando correo electrónico: " + mensaje);

	}

}