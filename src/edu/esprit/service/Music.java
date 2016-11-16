/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.service;

/**
 *
 * @author luca
 *
 */
import java.io.*;
import javax.sound.sampled.*;

public class Music {

    private final int BUFFER_SIZE = 128000;
    private AudioInputStream audioStream;
    private SourceDataLine sourceLine;

    /**
     * @param filename the name of the file that is going to be played
     */
    private void playSound(String filename) {
        try {
            audioStream = AudioSystem.getAudioInputStream(new File(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            sourceLine = (SourceDataLine) AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, audioStream.getFormat()));
            sourceLine.open(audioStream.getFormat());
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sourceLine.start();
        int nBytesRead = 0;
        byte[] abData = new byte[BUFFER_SIZE];
        while (nBytesRead != -1) {
            try {
                nBytesRead = audioStream.read(abData, 0, abData.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (nBytesRead >= 0) {
                @SuppressWarnings("unused")
                int nBytesWritten = sourceLine.write(abData, 0, nBytesRead);
            }
        }
        sourceLine.drain();
        sourceLine.close();
    }

    public static void player(String path) {
        Music m = new Music();
        m.playSound(path);

    }

 
}
