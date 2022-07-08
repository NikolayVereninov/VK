package ru.netology.domain;

public class InteractionButton {
    private String writeToTheCommunity;
    private String saveWithBookmarks;
    private String copyLink;
    private String complain;
    private String cancellation;

    public String getWriteToTheCommunity() {
        return writeToTheCommunity;
    }

    public String getSaveWithBookmarks() {
        return saveWithBookmarks;
    }

    public String getCopyLink() {
        return copyLink;
    }

    public String getComplain() {
        return complain;
    }

    public String getCancellation() {
        return cancellation;
    }

    public void setWriteToTheCommunity(String writeToTheCommunity) {
        this.writeToTheCommunity = writeToTheCommunity;
    }

    public void setSaveWithBookmarks(String saveWithBookmarks) {
        this.saveWithBookmarks = saveWithBookmarks;
    }

    public void setCopyLink(String copyLink) {
        this.copyLink = copyLink;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }

    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }
}