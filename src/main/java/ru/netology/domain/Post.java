package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromID;
    private int createdBy;
    private long data;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private Likes likes;
    private Reposts reposts;
    private Views views;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;


    public int getFromID() {
        return fromID;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public long getData() {
        return data;
    }

    public String getText() {
        return text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public Likes getLikes() {
        return likes;
    }

    public Reposts getReposts() {
        return reposts;
    }

    public Views getViews() {
        return views;
    }

    public String getPostType() {
        return postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public boolean getCanPin() {
        return canPin;
    }

    public boolean getCanDelete() {
        return canDelete;
    }

    public boolean getCanEdit() {
        return canEdit;
    }

    public boolean getIsPinned() {
        return isPinned;
    }

    public boolean getMarkedAsAds() {
        return markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public Geo getGeo() {
        return geo;
    }

    public int getId() {
        return id;
    }

    public int getSignerId() {
        return signerId;
    }

    public Donut getDonut() {
        return donut;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setData(long data) {
        this.data = data;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public void setReposts(Reposts reposts) {
        this.reposts = reposts;
    }

    public void setViews(Views views) {
        this.views = views;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public void setIsPinned(boolean isPinned) {
        this.isPinned = isPinned;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
