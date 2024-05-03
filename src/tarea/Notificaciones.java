package tarea;

public class Notificaciones {

	private final ServicioMensajeria serviciomensajeria;

	public Notificaciones(ServicioMensajeria serviciomensajeria) {

		this.serviciomensajeria = serviciomensajeria;

	}

	public void notificarusuario(String usuario, String mensaje) {

		System.out.println("Notificando a " + usuario + ":" + mensaje);
		serviciomensajeria.enviarMensaje(mensaje);
	}

}
