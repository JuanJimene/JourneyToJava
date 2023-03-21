
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class gameMusic{

		gameMusic() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
			
		
		
		File file = new File("JAVAMUSIC.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream); 
		clip.start(); 
			
}
}
