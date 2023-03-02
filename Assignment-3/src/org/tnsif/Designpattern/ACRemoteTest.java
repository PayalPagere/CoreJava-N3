package org.tnsif.Designpattern;

public class ACRemoteTest {
public static void main(String[] args) {
		
		//Create Context Object
		ACContext acContext = new ACContext();
		
		//Create State Object
		State AcStartState = new ACStartState();
		
		//Now setting state to start AC
		acContext.setState(AcStartState);
		
		//Now Perform Action
		acContext.doAction();
		
		System.out.println("-------------------------------");
		
		//Now setting State to stop AC
		State AcStopState = new ACStopState();
		acContext.setState(AcStopState);
		
		//Now Perform Action
		acContext.doAction();
	}
}
