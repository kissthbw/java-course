//packages (optional)
package com.examples;

//imports (optional)

//Class definition

//[accessModifier] class [className]
public class Computer {

	//1.Fields (variables)
	//Describen las propiedades de una cosa.
	//[accessModifier] [dataType] [name]
	private String marca;
	
	//TODO: Agregar 10 campos mas con su respectivos set y get
	
	private String modelo;
	private String color;
	private String procesador;
	private String memoria;
	private String discoDuro;
	private String tamanioPantalla;
	private String tarjetaMadre;
	private String tarjetaAudio;
	private String tarjetaVideo;
	
	
	//2.Constructor
	//Sirve para inicializar los campos (variables) de tu clase
	//[accessModifier] [same className]
	public Computer() {
		
	}
	
	//3.Methods
	//[accessModifier] [returnType] [methodName] ( parameterList... )
	public void setMarca( String marca ) {
		this.marca = marca;
	}
	
	public void setColor( String color ) {
		this.color = color;
	}
	public void setProcesador( String procesador ) {
		this.procesador = procesador;
	}
	public void setMemoria( String memoria ) {
		this.memoria = memoria;
	}
	public void setDiscoDuro( String discoDuro ) {
		this.discoDuro = discoDuro;
	}
	public void setTamanioPantalla( String tamanioPantalla ) {
		this.tamanioPantalla = tamanioPantalla;
	}
	public void setTarjetaMadre( String tarjetaMadre ) {
		this.tarjetaMadre = tarjetaMadre;
	}
	public void setTarjetaAudio( String tarjetaAudio ) {
		this.tarjetaAudio = tarjetaAudio;
	}
	public void setTarjetaVideo( String tarjetaVideo ) {
		this.tarjetaVideo = tarjetaVideo;
	}
	//TOOD: Agrega un comentario con las partes del metodo
	public String getMarca() {
		return marca;
	}
}