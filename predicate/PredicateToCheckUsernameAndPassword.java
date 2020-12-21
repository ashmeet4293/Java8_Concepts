package com.company.practice.predicate;

import java.util.function.Predicate;

/** Program for User Authentication by using Predicate */
class User{
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
public class PredicateToCheckUsernameAndPassword {

    public static void main(String[] args) {

        Predicate<User> userPredicate= (user)-> user.username.equals("admin") && user.password.equals("admin");

        User invalidUser= new User("Ashmeet", "Tiwary");
        User validUser= new User("admin", "admin");

        checkCredentials(userPredicate, invalidUser);
        checkCredentials(userPredicate, validUser);


    }

    public static void checkCredentials(Predicate<User> userPredicate, User user) {
        if (userPredicate.test(user)){
            System.out.println("Valid User "+user.username);
        }

    }

}
