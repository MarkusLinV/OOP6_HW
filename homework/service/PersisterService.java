package service;

import model.Persister;
import model.User;

public class PersisterService {
    
    Persister p;

    public Persister createPersister(User user){
        this.p = new Persister(user);
        return p;
    }

    public void save(){
        System.out.println("Save user: " + p.getUser().getName());
    }

}
