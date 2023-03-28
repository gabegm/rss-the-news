package com.gaucimaistre.rssthenews.repository;

import com.gaucimaistre.rssthenews.model.RssFeed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.List;
import java.util.Optional;

public interface RssFeedRepository extends JpaRepository<RssFeed, Long> {
    List<RssFeed> findByUser(User user);
    Optional<RssFeed> findByIdAndUser(Long id, User user);
    void deleteByIdAndUser(Long id, User user);
}