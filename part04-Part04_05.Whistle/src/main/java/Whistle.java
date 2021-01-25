/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Whistle {

    private String sound;

    public Whistle(String whistleSound) {
//        Whistle duckWhistle = new Whistle("Kvaak");
//        Whistle roosterWhistle = new Whistle("Peef");
//        
//        duckWhistle.sound();
//        roosterWhistle.sound();
        this.sound = whistleSound;
        
    }
    public void sound(){
        System.out.println(this.sound);
    }
    
    
}
