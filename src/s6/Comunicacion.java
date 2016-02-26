package s6;

import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.MulticastSocket;

public class Comunicacion extends Thread implements Serializable {
	private final int PUERTO = 5000;
	byte [] buzon;
	byte [] datos;
	DatagramPacket pEnviar, pRecibir;
	MulticastSocket ms;
	
	
	
	Comunicacion(){
		
	}
}
