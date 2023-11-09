package de.telran.g_10_170123_e_be_dto.domain.dto;

import de.telran.g_10_170123_e_be_dto.domain.entity.UserDetails;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Объект пользователя")
public class UserDTO {

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Идентификатор пользователя", example = "777")
    private int id;

    @Schema(description = "Имя пользователя", example = "Vasya")
    private String username;

    @Schema(description = "Пароль пользователя", example = "qwerty")
    private String password;

    @Schema(description = "Подробная информация о пользователе")
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