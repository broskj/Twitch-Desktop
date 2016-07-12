package com.broskj.utils;

/**
 * Created by broskj on 7/10/16.
 */
public interface Subject {
    void alert();
    void addObserver(Observer o);
    void removeObserver(Observer o);
} // end interface Subject
