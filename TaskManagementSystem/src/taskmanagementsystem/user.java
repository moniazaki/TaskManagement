/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanagementsystem;

/**
 *
 * @author Dell
 */
public abstract class user {
    String name;
    int id;
    int age;
    String username;
    String password;

    public user() {
    }

    public user(String name, int id, int age, String username, String password) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.username = username;
        this.password = password;
    }
 

}
