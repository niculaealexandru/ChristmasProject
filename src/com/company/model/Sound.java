package com.company.model;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

    public class Sound {
        public static void playSound(File Sound) {
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(Sound));
                clip.start();

                JOptionPane.showMessageDialog(null,"Apasa ok pentru a opri!");
                clip.stop();

            } catch (Exception ignored) {

            }
        }
        public static void playSoundStop(File Sound, String msg) {
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(Sound));
                clip.start();

                JOptionPane.showMessageDialog(null,msg);
                clip.stop();

            } catch (Exception ignored) {

            }
        }
    }
