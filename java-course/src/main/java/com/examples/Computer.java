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
	
	//TOOD: Agrega un comentario con las partes del metodo
	public String getMarca() {
		return marca;
	}
}