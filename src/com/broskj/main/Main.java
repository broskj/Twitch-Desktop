package com.broskj.main;

import com.broskj.utils.Settings;
import com.broskj.utils.TwitchPoll;
import com.broskj.view.MainView;

/**
 * Created by broskj on 7/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Settings.init();

        /**
         * check for auth token
         * if isFound:
         *      if isValid:
         *          continue
         *      else:
         *          authenticate
         * else:
         *      authenticate
         *
         * while(true):
         *      if twitchPoll is not running:
         *          start twitchPoll timer
         *      mainView.run()
         */
        MainView mainView = new MainView();
        mainView.init();

        TwitchPoll poll = new TwitchPoll(5000);

        while(true) {
            if(!poll.isRunning()) {
                poll.start();
            }
            mainView.run();
        }
    } // end main
} // end class main
