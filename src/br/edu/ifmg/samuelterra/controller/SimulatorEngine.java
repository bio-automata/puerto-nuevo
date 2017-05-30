package br.edu.ifmg.samuelterra.controller;


import br.edu.ifmg.samuelterra.model.system.Systema;
/**

 This class manipulates the System
 
 	the life cicle of this class consists in
 		-> take the immediate event in the FEL and execute this event
 		-> the event automaticaly changes the system state in the execution time 

 */
public class SimulatorEngine {
	private Systema system;
	
	public void simulate(){
		while(){
			this.system.getNextImediateEvent().execute();
		}
	}
}
