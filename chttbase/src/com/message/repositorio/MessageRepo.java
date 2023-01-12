package com.message.repositorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Mensaje;
import com.message.dominio.Usuario;

public class MessageRepo {
	
	private List<Mensaje> mensajes = new ArrayList<Mensaje>();
	private UserRepo usuario = new UserRepo();
	
	public MessageRepo() {
		Usuario erick = usuario.userId(1);
		Usuario gabriela = usuario.userId(2);
		Usuario lady = usuario.userId(3);
		Usuario lorena = usuario.userId(4);
		Usuario juan = usuario.userId(5);
		Usuario jose = usuario.userId(6);
		Usuario javier = usuario.userId(7);
		Usuario alejandra = usuario.userId(8);
		Usuario andrea = usuario.userId(9);
		Usuario miguel = usuario.userId(10);
		
		
		//CONVERSACIONES DE ERICK//
		mensajes.add(new Mensaje(1, gabriela, erick, LocalDateTime.of(2023, 01, 14, 9, 30), "Hola erick como estas"));
		mensajes.add(new Mensaje(2, erick, gabriela, LocalDateTime.of(2023, 01, 14, 12, 30), "Hola enana bien y tu como has estado"));
		
		mensajes.add(new Mensaje(3, erick, lady, LocalDateTime.of(2023, 01, 10, 7, 10), "Oye cierto que el viernes hay un evento en la facultdad"));
		mensajes.add(new Mensaje(4, lady, erick, LocalDateTime.of(2023, 01, 10, 8, 30), "Sii es a las 7 es obligatorio ir"));
		
		mensajes.add(new Mensaje(5, erick, lorena, LocalDateTime.of(2023, 01, 9, 9, 0), "Hola perdida"));
		mensajes.add(new Mensaje(6, lorena, erick, LocalDateTime.of(2023, 01, 9, 10, 30), "kheee perdida yo :("));
		
		mensajes.add(new Mensaje(7, juan, erick, LocalDateTime.of(2023, 01, 8, 12, 30), "Que hay bro pilas el sabado vamos a la playa"));
		mensajes.add(new Mensaje(8, erick, juan, LocalDateTime.of(2023, 01, 8, 12, 0), "hola bro no puedo tengo que ir a otro lado"));
		
		mensajes.add(new Mensaje(9, erick, jose, LocalDateTime.of(2023, 01, 1, 10, 30), "Como estas que tal amaneciste "));
		mensajes.add(new Mensaje(10, jose, erick, LocalDateTime.of(2023, 01, 1, 10, 35), "no recuerdo nada jaja"));
		
		mensajes.add(new Mensaje(11, erick, javier, LocalDateTime.of(2022, 12, 31, 11, 58), "Feliz año mi pana bendiciones"));
		mensajes.add(new Mensaje(12, javier, erick, LocalDateTime.of(2022, 12, 31, 12, 30), "Igualemnte mi compita"));
		
		mensajes.add(new Mensaje(13, alejandra, erick, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(14, erick, alejandra, LocalDateTime.of(2022, 11, 16, 12, 30), "Holaaaa perdida bien y tu"));
		
		mensajes.add(new Mensaje(14, erick, andrea, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola andreita"));
		mensajes.add(new Mensaje(15, andrea, erick, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(16, miguel, erick, LocalDateTime.of(2022, 11, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(17, erick, miguel, LocalDateTime.of(2022, 11, 16, 12, 30), "Confirma la copia"));
		
		//CONVERSACIONES DE GABRIELA//
		mensajes.add(new Mensaje(18, gabriela, lady, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola amiguis como te ha ido"));
		mensajes.add(new Mensaje(19, lady, gabriela, LocalDateTime.of(2022, 11, 16, 12, 30), "Holiiiis bien horita me estoy haciendo las uñas"));
		
		mensajes.add(new Mensaje(20, gabriela, lorena, LocalDateTime.of(2022, 11, 16, 12, 30), "lore te tengo un chisme jaja"));
		mensajes.add(new Mensaje(21, lorena, gabriela, LocalDateTime.of(2022, 11, 16, 12, 30), "Aver cuenta cuenta xd"));
		
		mensajes.add(new Mensaje(22, juan, gabriela, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola guapa cuando nos vemos"));
		mensajes.add(new Mensaje(23, gabriela, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "nunca jajaja"));
		
		mensajes.add(new Mensaje(24, gabriela, jose, LocalDateTime.of(2022, 11, 16, 12, 30), "Holiiiis ayudame en programacion :c"));
		mensajes.add(new Mensaje(25, jose, gabriela, LocalDateTime.of(2022, 11, 16, 12, 30), "no"));
		
		mensajes.add(new Mensaje(26, gabriela, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		mensajes.add(new Mensaje(27, javier, gabriela, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola gaby bien aqui trabajando y tu"));
		
		mensajes.add(new Mensaje(28, alejandra, gabriela, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Mensaje(29, gabriela, alejandra, LocalDateTime.of(2022, 11, 16, 12, 30), "como que bobita ya te lo paso xd"));
		
		mensajes.add(new Mensaje(30, gabriela, andrea, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de jose"));
		mensajes.add(new Mensaje(31, andrea, gabriela, LocalDateTime.of(2022, 11, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(32, miguel, gabriela, LocalDateTime.of(2022, 11, 16, 12, 30), "Holi perdida como estas"));
		mensajes.add(new Mensaje(33, gabriela, miguel, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE HILARY//
		mensajes.add(new Mensaje(34, lady, lorena, LocalDateTime.of(2022, 11, 16, 12, 30), "lore te tengo un chisme jaja"));
		mensajes.add(new Mensaje(35, lorena, lady, LocalDateTime.of(2022, 11, 16, 12, 30), "Aver cuenta cuenta xd"));
		
		mensajes.add(new Mensaje(36, juan, lady, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola guapa cuando nos vemos"));
		mensajes.add(new Mensaje(37, lady, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "nunca jajaja"));
		
		mensajes.add(new Mensaje(38, lady, jose, LocalDateTime.of(2022, 11, 16, 12, 30), "Holiiiis ayudame en programacion :c"));
		mensajes.add(new Mensaje(39, jose, lady, LocalDateTime.of(2022, 11, 16, 12, 30), "weno deja te explico"));
		
		mensajes.add(new Mensaje(40, lady, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		mensajes.add(new Mensaje(41, javier, lady, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola loquita bien aqui atereado y tu"));
		
		mensajes.add(new Mensaje(42, alejandra, lady, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Mensaje(43, lady, alejandra, LocalDateTime.of(2022, 11, 16, 12, 30), "como que bobita ya te lo paso xd"));
		
		mensajes.add(new Mensaje(44, lady, andrea, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de lorena"));
		mensajes.add(new Mensaje(45, andrea, lady, LocalDateTime.of(2022, 11, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(46, miguel, lady, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(47, lady, miguel, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE DENISSE//
		mensajes.add(new Mensaje(48, juan, lorena, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola guapa cuando nos vemos"));
		mensajes.add(new Mensaje(49, lorena, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "nunca jajaja"));
		
		mensajes.add(new Mensaje(50, lorena, jose, LocalDateTime.of(2022, 11, 16, 12, 30), "Holiiiis ayudame en programacion :c"));
		mensajes.add(new Mensaje(51, jose, lorena, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja dime en que quieres que te ayude"));
		
		mensajes.add(new Mensaje(52, lorena, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		mensajes.add(new Mensaje(53, javier, lorena, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola lore bien aqui trabajando y tu"));
		
		mensajes.add(new Mensaje(54, alejandra, lorena, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Mensaje(55, lorena, alejandra, LocalDateTime.of(2022, 11, 16, 12, 30), "como que bobita ya te lo paso xd"));
		
		mensajes.add(new Mensaje(56, lorena, andrea, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de marco"));
		mensajes.add(new Mensaje(57, andrea, lorena, LocalDateTime.of(2022, 11, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(58, miguel, lorena, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(59, lorena, miguel, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE JUAN//
		mensajes.add(new Mensaje(60, juan, jose, LocalDateTime.of(2022, 11, 16, 12, 30), "Como vas con el proyecto de programacion"));
		mensajes.add(new Mensaje(61, jose, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Ya casi lo termino esta heavy jaja"));
		
		mensajes.add(new Mensaje(62, juan, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Todo bien socio confirma donde andas"));
		mensajes.add(new Mensaje(63, javier, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Aqui en caleta viendo los partidos del mundial"));
		
		mensajes.add(new Mensaje(64, alejandra, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(65, juan, alejandra, LocalDateTime.of(2022, 11, 16, 12, 30), "Holaaaa mocosa bien y tu"));
		
		mensajes.add(new Mensaje(66, juan, andrea, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola andrea"));
		mensajes.add(new Mensaje(67, andrea, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(68, miguel, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(69, juan, miguel, LocalDateTime.of(2022, 11, 16, 12, 30), "Confirma pichin"));
		
		//CONVERSACIONES DE CARLOS//
		mensajes.add(new Mensaje(70, jose, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Todo bien socio confirma donde andas"));
		mensajes.add(new Mensaje(71, javier, jose, LocalDateTime.of(2022, 11, 16, 12, 30), "Aqui en caleta viendo los partidos del mundial"));
		
		mensajes.add(new Mensaje(72, alejandra, jose, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(73, jose, alejandra, LocalDateTime.of(2022, 11, 16, 12, 30), "Holaaaa mocosa bien y tu"));
		
		mensajes.add(new Mensaje(74, jose, andrea, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola andrea"));
		mensajes.add(new Mensaje(75, andrea, jose, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(76, miguel, jose, LocalDateTime.of(2022, 11, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(77, jose, miguel, LocalDateTime.of(2022, 11, 16, 12, 30), "Confirma pochin"));
		
		//CONVERSACIONES DE JAVIER//
		mensajes.add(new Mensaje(78, alejandra, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(79, javier, alejandra, LocalDateTime.of(2022, 11, 16, 12, 30), "Holaaaa mocosa bien y tu"));
		
		mensajes.add(new Mensaje(80, javier, andrea, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola andrea"));
		mensajes.add(new Mensaje(81, andrea, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(82, miguel, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(83, javier, miguel, LocalDateTime.of(2022, 11, 16, 12, 30), "Confirma pechin"));
		
		//CONVERSACIONES DE KAREN//
		mensajes.add(new Mensaje(84, alejandra, andrea, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de erick"));
		mensajes.add(new Mensaje(85, andrea, alejandra, LocalDateTime.of(2022, 11, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(87, miguel, alejandra, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(88, alejandra, miguel, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE SUSANA//
		mensajes.add(new Mensaje(89, miguel, andrea, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(90, andrea, miguel, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		
		
				
	}
	
	public List<Mensaje> getMensajes(){
		return mensajes;
	}
	
	public List<Mensaje> conversaciones(int usuario1, int usuario2) {
		List<Mensaje> resultado = new ArrayList<Mensaje>();
		for(Mensaje msj: mensajes) {
			if((msj.getUsuario1().getId() == usuario1 && msj.getUsuario2().getId() == usuario2) || (
					msj.getUsuario1().getId() == usuario2 && msj.getUsuario2().getId() == usuario1))
				resultado.add(msj);
		}
		return resultado;		
	}
	
	public Mensaje getUltimoMsj(int usuario1, int usuario2) {
		List<Mensaje> resultado = conversaciones(usuario1, usuario2);
		
		if(resultado.size() == 0)
			return null;
		return resultado.get(resultado.size()-1);		
	}
	
	public void addMensajes(Mensaje mensaje) {
		mensajes.add(mensaje);		
	}

}
