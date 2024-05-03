package tarea;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

	@Bean

	public ServicioMensajeria email() {

		return new Email();

	}

	@Bean

	public Notificaciones notificaciones(ServicioMensajeria servicioMensajeria) {

		return new Notificaciones(servicioMensajeria);

	}

}