package view;

import java.util.Scanner;

import model.User;
import service.PersisterService;
import service.UserService;

public class UserView {
    public void Start(){
        UserService u = new UserService();
        PersisterService p = new PersisterService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        p.createPersister(u.createUser(scanner.nextLine()));
        u.report();
        p.save();
    }
}
