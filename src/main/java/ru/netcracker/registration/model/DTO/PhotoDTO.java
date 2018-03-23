package ru.netcracker.registration.model.DTO;

import ru.netcracker.registration.model.PhotoType;
import ru.netcracker.registration.model.Spot;
import ru.netcracker.registration.model.SpotInQuest;
import ru.netcracker.registration.model.User;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

public class PhotoDTO {
    private String url;
    private Date uploadDate;
    private String photoType;
    private UserDTO user;


    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getPhotoType() {
        return photoType;
    }

    public void setPhotoType(String photoType) {
        this.photoType = photoType;
    }
}
