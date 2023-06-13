package factoryDesignpateern;

public class GameFactory {
	public Game getInstance(String I ) {
		if(I.equals("Ronaldo")){
			return new Football();
		}
		else if(I.equals("Virat")) {
			return new Cricket();
		}
		return null;
	}
}
