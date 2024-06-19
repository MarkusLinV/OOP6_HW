package model;

public class Persister{//сохраняльщик
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
