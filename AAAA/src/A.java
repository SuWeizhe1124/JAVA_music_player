import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class A {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

    	 Scanner scanner = new Scanner(System.in);
    	  
    	  File file = new File("Binary Close.wav");
    	  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    	  Clip clip = AudioSystem.getClip();
    	  clip.open(audioStream);
    	  
    	  String response = "";
    	 
    	  
    	  while(!response.equals("Q")) {
    	   System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
    	   System.out.print("Enter your choice: ");
    	   
    	   response = scanner.next();
    	   response = response.toUpperCase();
    	   
    	   switch(response) {
    	    case ("P"): clip.start();
    	    break;
    	    case ("S"): clip.stop();
    	    break;
    	    case ("R"): clip.setMicrosecondPosition(0);
    	    break;
    	    case ("Q"): clip.close();
    	    break;
    	    default: System.out.println("Not a valid response");
    	   }
    	   
    	  }
    	  System.out.println("Byeeee!"); 
	

	}


}