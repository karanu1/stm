package com.scell.stm.dto;

import java.util.Date;

public class ResourceDto {
    private int resource;
    private String useType;
    private String comment;
    private int linkedId;
    private Date reRegDate;
    private int resourceChange;
    private char monthDues;

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getlinkedId() {
        return linkedId;
    }

    public void setLinkedId(int linkedId) {
        this.linkedId = linkedId;
    }

    public Date getReRegDate() {
        return reRegDate;
    }

    public void setReRegDate(Date reRegDate) {
        this.reRegDate = reRegDate;
    }

    public int getResourceChange() {
        return resourceChange;
    }

    public void setResourceChange(int resourceChange) {
        this.resourceChange = resourceChange;
    }

    public char getMonthDues() {
        return monthDues;
    }

    public void setMonthDues(char monthDues) {
        this.monthDues = monthDues;
    }
}