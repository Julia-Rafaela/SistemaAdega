package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pedido {
	
	int codigo;
	Produto produto;
	int quantidade;
	String statu_p;
	Reserva reserva;
}
