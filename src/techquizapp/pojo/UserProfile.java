package techquizapp.pojo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class UserProfile {
    public static String getUsertype(){
        return usertype;
    }

    public static String getUsername() {
        return username;
    }
    public static void setUsertype(String usertype){
        UserProfile.usertype=usertype;
    }

    public static void setUsername(String username) {
        UserProfile.username = username;
    }
    private static String username;
    private static String usertype;
    
}
