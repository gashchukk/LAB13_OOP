package main.java.com.lab13.task1;

import java.time.LocalDate;

import com.lab13.User;

public class MyFacebookuser implements User{
    private FacebookUser facebookuser;
    @Override
    public String getCountry() {
        return ((User) facebookuser).getCountry();

    }
    @Override
    public String getEmail() {
        return ((User) facebookuser).getEmail();
    }
    @Override
    public LocalDate getLastActiveDate() {
        return ((User) facebookuser).getLastActiveDate();
    }
}
