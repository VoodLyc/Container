package model;

public class Port{

//Attributes

	private Container containerA;
	private Container containerB;
	private Container containerC;

//Constructor

	public Port(Container containerA, Container containerB, Container containerC){

		this.containerA = containerA;
		this.containerB = containerB;
		this.containerC = containerC;
	}

//Gets

public Container getContainerA(){

	return containerA;
}

public Container getContainerB(){

	return containerB;
}

public Container getContainerC(){

	return containerC;
}

//Sets

public void setContainerA(Container containerA){

	this.containerA = containerA;
}

public void setContainerB(Container containerB){

	this.containerB = containerB;
}

public void setContainerC(Container containerC){

	this.containerC = containerC;
}

//Methods 

public double calculateVolumeContainer(){
	
}

}