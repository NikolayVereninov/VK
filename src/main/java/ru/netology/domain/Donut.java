package ru.netology.domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private Placeholder placeholder;
    private boolean canPublishFreeCopy;
    private String editMode;

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public void setPlaceholder(Placeholder placeholder) {
        this.placeholder = placeholder;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}