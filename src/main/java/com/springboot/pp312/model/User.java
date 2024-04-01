package com.springboot.pp312.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.*;

//import javax.persistence.*;
//import javax.validation.constraints.*;

@Entity
@Table(name = "User" )
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotEmpty( message = "Введите имя")
    @Size(min = 2, max = 15, message = "Введите правильное имя")
    @Column(name = "name")
    private String name;

    @Column(name = "mail")
    @Email(message = "не правильный email")
    private String mail;

    @Column(name = "age")
    @Min(value = 0, message = "возраст нее может меньше  0")
    @Max(value = 120,  message = "возраст нее может больше  120 :)), но это не точно..")
    private int age;

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", age=" + age +
                '}';
    }
}
