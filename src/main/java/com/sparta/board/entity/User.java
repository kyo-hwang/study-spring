package com.sparta.board.entity;

import com.sparta.board.entity.enumSet.UserRoleEnum;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20,name="user_email")
    private String userEmail;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 30)
    @Enumerated(value = EnumType.STRING)
    private UserRoleEnum role;

    @Builder
    private User(String userEmail, String password, UserRoleEnum role) {
        this.userEmail = userEmail;
        this.password = password;
        this.role = role;
    }

    public static User of(String userEmail, String password, UserRoleEnum role) {
        return User.builder()
                .userEmail(userEmail)
                .password(password)
                .role(role)
                .build();
    }

}
