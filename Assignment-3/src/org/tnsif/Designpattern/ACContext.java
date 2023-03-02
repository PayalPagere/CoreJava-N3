package org.tnsif.Designpattern;

public class ACContext implements State{

private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		
	}

}
