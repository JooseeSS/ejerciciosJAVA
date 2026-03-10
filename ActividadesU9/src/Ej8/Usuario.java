package Ej8;

public class Usuario implements Validable, Mostrable{
private String email;
private String password;

public Usuario(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}

@Override
public void validar() throws IllegalArgumentException {
	if(email==null || !email.contains("@")){
		throw new IllegalArgumentException("Email no válido: El email debe contener @ y no puede estar vacio");
	}
	if(password.length()<8) {
		throw new IllegalArgumentException("Contraseña no válida: La contraseña debe tener al menos 8 caracteres");
	}
	
}


@Override
public String mostrar() {
	return "Usuario -> Email: " + email + " | Password: [***Oculta***]";
}

}
