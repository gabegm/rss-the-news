package com.gaucimaistre.rssthenews.repository;

import com.gaucimaistre.rssthenews.model.RssFeed;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<RssFeed> findByUser(User user);
    Optional<RssFeed> findByIdAndUser(Long id, User user);
    void deleteByIdAndUser(Long id, User user);
    default Optional<User> findByUsername(String username) {
        return null;
    }

    default RolesAllowed getRoles() {
        return null;
    }
}
