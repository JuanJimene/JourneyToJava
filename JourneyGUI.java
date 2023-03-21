import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class JourneyGUI {

	public static void main(String[] args) {
		try {
			gameMusic gameMusic = new gameMusic();                  // MUSIC START //
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();																				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		startGame startGame = new startGame();                  //UNF J2J GAME START// 
		
	}

}																//Simple GUI that makes a game where you control a character to 
																//walk from the 2nf floor of Skinner Jones Hall from the garage
																//to Mr.Piersall's class. Implements KeyListener and ActionListener
																//interfaces. Made by Juan Jimenez . 
							
									
									
									
									
									