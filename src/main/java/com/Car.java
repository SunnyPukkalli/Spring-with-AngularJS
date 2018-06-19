package com;

public class Car {

	
	private Engine engine;
	private String warningMessage;
	
	
	public String getWarningMessage() {
		return warningMessage;
	}


	public void setWarningMessage(String warningMessage) {
		this.warningMessage = warningMessage;
	}


	public Car(Engine engine) // Engine will be mock object , design our car based on how engine behaves
	{
		this.engine = engine;
	}
	
	public void accelerate(){
		
		engine.increaseRpm();
		
		if(engine.getRpm() > 5000)
		{
			warningMessage = "Slow Down";
		}
	}
}
