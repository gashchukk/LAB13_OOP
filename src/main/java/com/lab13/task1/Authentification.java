package main.java.com.lab13.task1;
import com.lab13.User;
public class Authentification {
    public User login(boolean isTwitter){
        if (isTwitter){
            return new MyTwitterUser(new TwitterUser());
        }
        else{
            return new MyFacebookUser(new FacebookUser());
        }
    }
}

