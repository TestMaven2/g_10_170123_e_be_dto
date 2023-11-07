package de.telran.g_10_170123_e_be_dto.domain.dto;

import de.telran.g_10_170123_e_be_dto.domain.entity.UserDetails;

public class UserDTO {

    private int id;
    private String username;
    private String password;
    public UserDetails userDetails;

    public UserDTO() {
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}