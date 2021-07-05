package com.scell.stm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

public class UserDto {
    private Integer id;
    private String phoneNumber;
    private String nickname;
    private String profileImage;
    private String thumbnailImage;
    private String email;
    private String type;
    private String auth;
    private char activity;
    private Date registrationDate;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public String getProfileImage(){
        return profileImage;
    }
    public void setProfileImage(String profileImage){
        this.profileImage = profileImage;
    }
    public String getThumbnailImage(){
        return thumbnailImage;
    }
    public void setThumbnailImage(String thumbnailImage){
        this.thumbnailImage = thumbnailImage;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getAuth(){
        return auth;
    }
    public void setAuth(String auth){
        this.auth = auth;
    }
    public char getActivity(){
        return activity;
    }
    public void setActivity(char activity){
        this.activity = activity;
    }
    public Date getRegistrationDate(){
        return registrationDate;
    }
    public void setRegistrationDate(Date registrationDate){
        this.registrationDate = registrationDate;
    }




}
