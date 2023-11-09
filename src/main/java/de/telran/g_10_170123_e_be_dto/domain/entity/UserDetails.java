package de.telran.g_10_170123_e_be_dto.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonIgnore
    @Schema(description = "Идентификатор записи об информации о пользователе", example = "555")
    private int id;

    @Column(name = "address")
    @Schema(description = "Адрес пользователя", example = "Ул. Пушкина, д. 3.")
    private String address;

    @Column(name = "phone")
    @Schema(description = "Номер телефона пользователя", example = "+1112223344")
    private String phone;

    @Column(name = "email")
    @Schema(description = "Электронная почта пользователя", example = "test@example.com")
    private String email;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UserDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}