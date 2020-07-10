package UI;

import Movies.Movie;

import java.util.HashMap;


public class Member {

    public String firstName;
    public String lastName;
    public String address;
    public String phone;
    public String username;
    public String password;
    public String staffUser;
    public String staffPass;

    public HashMap<String, Movie> movies = new HashMap<>();




    public Member(String lastName, String firstName, String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.username = lastName + firstName;


    }



    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) { this.password = password; }

    public String getUsername() { return username; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }





}
