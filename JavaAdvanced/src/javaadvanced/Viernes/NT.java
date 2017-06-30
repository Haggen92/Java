/**
 * Networking es un concepto de conectividad entre dos dispositivos o mas juntos,
 * que comparten recursos.
 * 
 * Programacion de sockets proporciona la facilidad de compartir datos entre
 * diferentes dispositivos.
 * 
 * Ventajas del Networking en Java
 *  Compartir recursos
 *  centralizar la gestion del spoftware
 * 
 * Conceptos Clave:
 *  Direccion IP:Numero dinamico asignado a un nodo de una red, compueso por 
 *  octetos que van del 0 al 255.
 *      Es una direccion logica que puede ser cambiada .
 * 
 * Protocolo: Conjunto de reglas para establecer la comunicacion: Ej: FTP,TCP,
 * Telnet,SMTP, POP.
 * 
 * Puerto: Esta asociado a la direccion ip para la comunicacion entre aplicaciones.
 * 
 * MAC:(Media Acces )
 * -+---
 * 
 * Oriented Conection protocol:
 *  Es un protocolo de tipo TCP/IP, confiable pero lento. El acuse de recibo es
 *  enviado por el receptor.
 * 
 * Connection Less Protoco:
 *  El receptor no envia el acuse de recibo. Es rapido,m sin embargo no es 
 *  confiable, pueden llegar o no llegar los paquetes Ej: UDP
 * 
 * Socket: Punto final en una conexion bidireccional.
 * 
 * La programacion de sockets se utiliza para la comunicacion entre aplicaciones 
 * que se ejectutan en diferentes JREs. Java Runtime Enviroment.
 * 
 * La programacioin de JavaSocket puede estar bajo ambos protocolos (OCP,OCL).
 * 
 * Las clases Java Socket y ServerSocket se utilizan para la programacion 
 * orientada a la conexion.
 * 
 * Las clases DatagramSocket y DatagramPacket son clases usadas para la 
 * porgramacion de sockets sin conexion.
 * 
 * El cliente en la programacion necesita saber:    
 *      Ip Address del Server
 *      Port Number
 *      Socket Class
 * El Socket es un punto final para las comunicaciones entre dispositivos.
 *      Socket Class
 *      Metodos
 *          public InputStream getInputStream()
 *              regresa el is adjunto con el socket
 *          public OutputStream getOutputStream()
 *              regresa el os adjunto al socket
 *          public synchronized void close()
 *              cierra el socket.
 * 
 *      ServerSocket
 *      Metodos
 *          public Socket accept()
 *              Establece la conexion entrante
 *          public synchronized void close()
 *              Cierra la conexion del servidor.
 */
 
package javaadvanced.Viernes;

public class NT {
    
}
