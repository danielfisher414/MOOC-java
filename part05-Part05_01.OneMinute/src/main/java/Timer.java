/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Timer {

    private ClockHand hours;
    private ClockHand hundredOfSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hours = new ClockHand(24);
        this.seconds = new ClockHand(60);
        this.hundredOfSeconds = new ClockHand(100);

    }

    public void advance() {
        this.hundredOfSeconds.advance();

        if (this.hundredOfSeconds.value() == 0) {
            this.seconds.advance();

//            if (this.hundredOfSeconds.value() == 0) {
//                this.hours.advance();
//            }
        }

    }

    public String toString() {
        return seconds + ":" + hundredOfSeconds;
    }

}
