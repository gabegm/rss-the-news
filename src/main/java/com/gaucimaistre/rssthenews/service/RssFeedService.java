package com.gaucimaistre.rssthenews.service;

import com.gaucimaistre.rssthenews.model.RssFeed;
import com.gaucimaistre.rssthenews.repository.RssFeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RssFeedService {
    @Autowired
    private RssFeedRepository rssFeedRepository;

    public List<RssFeed> getFeedsByUser(User user) {
        return rssFeedRepository.findByUser(user);
    }

    public Optional<RssFeed> getFeedByIdAndUser(Long id, User user) {
        return rssFeedRepository.findByIdAndUser(id, user);
    }

    public void deleteFeedByIdAndUser(Long id, User user) {
        rssFeedRepository.deleteByIdAndUser(id, user);
    }
}
