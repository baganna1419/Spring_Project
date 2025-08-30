package org.jsp.dependencyInjection;

public class Engine {
	private String typeOfEngine;
	private int hp;
	private int enginecc;
	
	public Engine() {
	}

	public Engine(String typeOfEngine, int hp, int enginecc) {
		this.typeOfEngine = typeOfEngine;
		this.hp = hp;
		this.enginecc = enginecc;
	}

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getEnginecc() {
		return enginecc;
	}

	public void setEnginecc(int enginecc) {
		this.enginecc = enginecc;
	}
	
	@Override
	public String toString() {
		return "Engine [typeOfEngine=" + typeOfEngine + ", hp=" + hp + ", enginecc=" + enginecc + "]";
	}
	

	

}
