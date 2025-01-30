package spacecoding.threads;

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TestPiano {
    public static void main(String[] args) {
        // String[] notes = {
        // "DO","RE","MI","FA","SOL","LA","SI"
        // };
        // Random randomGenerator = new Random();
        // int numberOfNotes = notes.length;
        // int randomIndex = randomGenerator.nextInt(numberOfNotes);

        // // metodo 1
        // Runnable run_p1 = new Piano(notes[randomIndex],5);
        // Thread p1=new Thread(run_p1);
        // p1.start();
        // // metodo 2
        // randomIndex = randomGenerator.nextInt(numberOfNotes);
        // Thread p2=new Thread(new Piano(notes[randomIndex],5));
        // p2.start();
        // // metodo 3
        // //new Thread(new Piano("Mib",5)).start();
        File file = new File( "/Users/carlocontardi/Developer/Java_Lessons/spacecoding/threads/do.wav");
        
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = 
            AudioSystem.getAudioInputStream(file);
            clip.open(inputStream);
            clip.start();
            try{
              Thread.sleep(clip.getMicrosecondLength()*1000);
            }catch(InterruptedException e){
            }
            clip.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } 
    }
}
