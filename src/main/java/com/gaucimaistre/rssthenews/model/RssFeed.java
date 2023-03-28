package com.gaucimaistre.rssthenews.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RssFeed {
    private String url;
    private String title;
    private String description;
    private String language;
    private String image;
}
