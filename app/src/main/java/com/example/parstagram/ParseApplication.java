package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Post.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("bhYyonCkCpWfkHIsMbi8mjXryRxO7xFIy8FSCB19")
                .clientKey("wtvtgCiaZRFIFdvb2XoRHabsAn9vgTqxQpGlQ75b")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
