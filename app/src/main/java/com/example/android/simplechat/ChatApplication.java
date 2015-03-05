package com.example.android.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Ariel on 3/4/15.
 */
public class ChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
//        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Message.class);
        Parse.initialize(this, "XGNQmqW0SG4phi5KScaipE4CoGHndsQqdg6T7mmW", "4D3Dg5zjDv8U6XcRvKZqWePJpps3sejpxGmLhsVL");
    }
}