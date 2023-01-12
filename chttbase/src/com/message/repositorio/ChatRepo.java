package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Chat;
import com.message.dominio.Mensaje;
import com.message.dominio.Usuario;

public class ChatRepo {
	
	private UserRepo usuario;
	private MessageRepo mensaje;
	
	public ChatRepo() {
		usuario = new UserRepo();
		mensaje = new MessageRepo();
	}

	public UserRepo getUsuario() {
		return usuario;
	}

	public void setUsuario(UserRepo usuario) {
		this.usuario = usuario;
	}

	public MessageRepo getMensaje() {
		return mensaje;
	}

	public void setMensaje(MessageRepo mensaje) {
		this.mensaje = mensaje;
	}
	
	public List<Chat> getChat(int userId){
		List<Chat> contactMsj = new ArrayList<Chat>();
		List<Usuario> contactos = usuario.getUsuarios();
		
		for(Usuario l: contactos) {
			if(l.getId() == userId)
				continue;
			
			Mensaje ultimoMsj = mensaje.getUltimoMsj(userId, l.getId());
			
			if(ultimoMsj == null)
				continue;
			
			Usuario contacto = usuario.userId(l.getId());
			
			contactMsj.add(new Chat(contacto, ultimoMsj));
			
		}		
		
		return contactMsj;
		
	}

}
