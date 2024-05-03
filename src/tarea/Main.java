package tarea;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Notificaciones notificaciones = context.getBean(Notificaciones.class);
			notificaciones.notificarusuario("Usuario123", "¡Tienes un nuevo mensaje!");
		}

	}

}