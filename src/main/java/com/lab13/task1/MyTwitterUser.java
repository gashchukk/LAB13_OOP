package main.java.com.lab13.task1;

import java.time.LocalDate;

import com.lab13.User;

public class MyTwitterUser implements User {
    private TwitterUser twitteruser;

    @Override
    public String getCountry(){
        return twitteruser.getCountry();
    }
    @Override
    public String getEmail() {
        return twitteruser.getEmail();
    }
    @Override
    public LocalDate getLastActiveDate() {
        return twitteruser.getLastActiveTime();
    }
}
