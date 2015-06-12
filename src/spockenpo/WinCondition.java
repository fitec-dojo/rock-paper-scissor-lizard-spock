package spockenpo;

public class WinCondition {

	public Options winner(Options item1, Options item2) {
		if(item1.beats(item2)){
			return item1;
		} else {
			return item2;
		}
	}

}
