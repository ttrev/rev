package com.revature.models;

public class Users {
    private String user_id;
    private String username;
    private String email;
    private String password;
    private String given_name;
    private String surname;
    private Boolean is_active;
    private String role_id;

    public Users(){
        super();
    }

    public Users(String user_id, String username, String email, String password, String given_name, String surname, Boolean is_active, String role_id){
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.given_name = given_name;
        this.surname = surname;
        this.is_active = is_active;
        this.role_id = role_id;
    }

    public String getUser_id(){
        return user_id;
    }

    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;

    }

    public String getPassword(){
        this.password = password;
        return password;
    }

    public void setPassword(String password){
        this.password = password;

    }

    public String getGivenName(){
        return given_name;
    }

    public void setGivenName(String given_name){
        this.given_name = given_name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public Boolean getIsActive(){
        return is_active;
    }

    public void setIsActive(Boolean is_active){
        this.is_active = is_active;
    }

    public String getRoleId(){
        return role_id;
    }

    public void setRoleId(String role_id){
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "users{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", given_name='" + given_name + '\'' +
                ", surname='" + surname + '\'' +
                ", is_active=" + is_active +
                ", role_id='" + role_id + '\'' +
                '}';
    }

}
