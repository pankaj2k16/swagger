package com.epankaj.swagger.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "\"user\"")
@Schema(name = "User", description = "User entity")
@Comment("User entity")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "User ID", example = "1")
    private Integer id;

    @Schema(description = "First Name", example = "Pankaj")
    private String firstName;

    @Schema(description = "Last Name", example = "Kumar")
    private String lastName;

    @Schema(description = "Email", example = "pankajsoe44@gmail.com")
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
