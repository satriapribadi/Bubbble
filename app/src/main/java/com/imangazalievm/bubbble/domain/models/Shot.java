package com.imangazalievm.bubbble.domain.models;

import java.util.Date;
import java.util.List;

public class Shot {

    private long id;
    private String title;
    private String description;
    private int width;
    private int height;
    private Images images;
    private int viewsCount;
    private int likesCount;
    private int bucketsCount;
    private int commentsCount;
    private Date createdAt;
    private Date updatedAt;
    private String htmlUrl;
    private String reboundSourceUrl;
    private List<String> tags;
    private User user;
    private Team team;
    private boolean animated;

    public Shot(long id, String title, String description, int width, int height, Images images,
                int viewsCount, int likesCount, int bucketsCount, int commentsCount, Date createdAt, Date updatedAt,
                String htmlUrl, String reboundSourceUrl, List<String> tags, User user, Team team, boolean animated) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.width = width;
        this.height = height;
        this.images = images;
        this.viewsCount = viewsCount;
        this.likesCount = likesCount;
        this.bucketsCount = bucketsCount;
        this.commentsCount = commentsCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.htmlUrl = htmlUrl;
        this.reboundSourceUrl = reboundSourceUrl;
        this.tags = tags;
        this.user = user;
        this.team = team;
        this.animated = animated;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Images getImages() {
        return images;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public int getBucketsCount() {
        return bucketsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getReboundSourceUrl() {
        return reboundSourceUrl;
    }

    public List<String> getTags() {
        return tags;
    }

    public User getUser() {
        return user;
    }

    public Team getTeam() {
        return team;
    }

    public boolean isAnimated() {
        return animated;
    }
}
