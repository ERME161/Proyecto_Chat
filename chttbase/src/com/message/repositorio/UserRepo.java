package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Usuario;

public class UserRepo {

private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public UserRepo() {
		usuarios.add(new Usuario(1, "Erick", "Mendoza", "erick01", "https://cdn-icons-png.flaticon.com/512/5556/5556529.png", "m1234", "Conectado"));
		usuarios.add(new Usuario(2, "Gabriela", "Santana", "gaby02", "https://cdn-icons-png.flaticon.com/512/5556/5556533.png", "g1234", "Conectado"));
		usuarios.add(new Usuario(3, "Lady", "Toala", "toala03", "https://cdn-icons-png.flaticon.com/512/5556/5556554.png", "t1234", "Desconectado"));
		usuarios.add(new Usuario(4, "Lorena", "Espinales", "lorena04", "https://cdn-icons-png.flaticon.com/512/5556/5556525.png", "e1234", "Conectado"));
		usuarios.add(new Usuario(5, "Juan", "Ordoñez", "juan05", "https://cdn-icons-png.flaticon.com/512/5556/5556539.png", "j1234", "Desconectado"));
		usuarios.add(new Usuario(6, "Jose", "Macias", "jose06", "https://cdn-icons-png.flaticon.com/512/5556/5556558.png", "jo1234", "Desconectado"));
		usuarios.add(new Usuario(7, "Javier", "Hurtado", "javier07", "https://cdn-icons-png.flaticon.com/512/5556/5556493.png", "j1234", "Conectado"));
		usuarios.add(new Usuario(8, "Alejandra", "Gonzalez", "ale08", "https://cdn-icons-png.flaticon.com/512/5556/5556484.png", "a1234", "Desconectado"));
		usuarios.add(new Usuario(9, "Andrea", "Almeida", "alme09", "https://cdn-icons-png.flaticon.com/512/5556/5556477.png", "al1234", "Desconectado"));
		usuarios.add(new Usuario(10, "Miguel", "Rosales", "mi10", "https://cdn-icons-png.flaticon.com/512/5556/5556480.png", "mi1234", "Desconectado"));
		
		
		
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public Usuario userId(int id) {
		for(Usuario user: usuarios) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}
	
	public Usuario userName(String username) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username))
				return user;
		}
		return null;
	}
	
	public Usuario password(String username, String clave) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username) && user.getClave().equals(clave))
				return user;
		}
		return null;
	}
	
}
