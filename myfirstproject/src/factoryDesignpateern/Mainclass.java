package factoryDesignpateern;

public class Mainclass {
	public static void main(String[] args) {
	    GameFactory g=new GameFactory();
	    Game s=g.getInstance("Virat");
	    s.play();
	}

}
