package day31;

/*
 * Every java applet inherits the behaviour from Applet class
 * 
 *  1)born/initiazation 
 * =    when an applet is loaded it enters the initialization state ,this happens
 *      by calling the init() method of Applet class ,,here the applet is born.
 *          1)Create an object as required by the Applet.
 *          2)Set up initial values
 *          3)Load images or fonts
 *          4)Set up colors
 * 
 * 2)running state
 *      Applet enters the running state when the system calls the start() method
 *      of the Applet class.this occors automaticaly after the applet is initialized.
 * 3)idel state
 *      An Applet becomes idle when it stop from running .Stopping occurs automatically 
 *      when we leave the current web page on which the applet was running .
 *      we can do the same by calling stop() method. 
 * 4)dead state
 *      An applet is said to be dead when it is removed from the memory .this occurs automaticaly 
 *      by invoking the destroy() method when we quit the browser
 * 
 * 
 * 
 */

public class AppletLifeCycle {
    public static void main(String[] args) {
        
    }
}
