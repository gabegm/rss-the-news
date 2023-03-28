package com.gaucimaistre.rssthenews.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name="user")
public class User extends org.springframework.security.core.userdetails.User {
    private @Id @GeneratedValue Long id;
    private String email;
    private String password;

    public User(String email, String password, Collection<? extends GrantedAuthority> authorities) {
        super(email, password, authorities);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User user = (User) o;
        return Objects.equals(this.id, user.id)
                && Objects.equals(this.email, user.email)
                && Objects.equals(this.password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.email, this.password);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + '\'' + ", email='" + this.email + '\'' + '}';
    }
}