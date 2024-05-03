
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "hello";
		Logger logger = new AsteriskLogger();
		
		logger.log(word);
		logger.error(word);
		
		String word2 = "Andrew";
		Logger logger2 = new SpacedLogger();
		
		logger2.log(word2);
		logger2.error(word2);
		
		
	}

}
