package com.broskj.utils;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by broskj on 7/10/16.
 */
public class TwitchPoll implements Subject {
    ArrayList<Observer> observers;
    private final Timer t;

    public TwitchPoll(int delay) {
        observers = new ArrayList<>();
        t = new Timer(delay, e -> printStuff());
        t.setRepeats(true);
    } // end constructor

    public void start() {
        if(!t.isRunning()) {
            t.start();
        }
    } // end start

    public boolean isRunning() {
        return t.isRunning();
    } // end isRunning

    public void printStuff() {
        System.out.println("stuff");

    } // end printStuff

    @Override
    public void alert() {
        observers.forEach(Observer::update);
    } // end alert

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    } // end addObserver

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    } // end removeObserver
} // end class TwitchPoll
