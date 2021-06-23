/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

/**
 *
 * @author HP
 */
public class User {

    public User() {
    }

    public static String getUserId() {
        return UserId;
    }

    public static void setUserId(String UserId) {
        User.UserId = UserId;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        User.Password = Password;
    }

    public static String getUserType() {
        return UserType;
    }

    public static void setUserType(String UserType) {
        User.UserType = UserType;
    }
     public User(String userType, String password, String userId) {
        this.UserId = userId;
        this.Password = password;
        this.UserType = userType;
    }
    private static String UserId;
    private static String Password;
    private static String UserType;
    
}
