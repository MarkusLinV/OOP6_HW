package service;

import model.User;

public class UserService {
    User user;

    public User createUser(String name){
        this.user = new User(name);
        return user;
    }

    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
