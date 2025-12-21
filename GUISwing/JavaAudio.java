package GUISwing;

import javax.sound.sampled.*; //AudioInputStream , AudioSystem , Clip
import java.io.File;
import java.io.IOException;

public class JavaAudio {
    public static void main(String[] args) {
        try {
            File audio = new File("sound.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(audio); // read the audio file
            Clip clip = AudioSystem.getClip(); // loads sound into memory
            clip.open(ais);
            clip.start(); // plays audio
        } catch (UnsupportedAudioFileException e) {
            System.out.println("When : Audio format is not supported");
        } catch (IOException e) {
            System.out.println("when : File not Found ,Wrong file path");
        } catch (LineUnavailableException e) {
            System.out.println("When : Audio device(speaker) is busy or unavailable");
        }
    }
}
