package ru.netcracker.registration.model;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

import javax.persistence.*;
import java.util.Collection;

/**
 * Класс Entity пользователя
 * Замапплен
 * Может сохраняться в БД и загружаться из БД через репозиторий
 */
@Entity
@Table(name= "user", schema = "nc_project")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="birthday")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate birthday;

    @Column(name="email")
    private String email;

    @Column(name="registration_date")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate registrationDate;

    @Column(name="password")
    private String password;

    @Column(name = "balance")
    private long balance;

    @Column(name = "business_balance")
    private long businessBalance;

    @Column(name = "reports")
    private Integer reports;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private UserGroup groupID;

    @OneToMany(mappedBy = "user")
    private Collection<Photo> photos;

    @OneToMany(mappedBy = "ownerId")
    private Collection<Quest> quests;

    @OneToMany(mappedBy = "userId")
    private Collection<Report> reportCollection;


    public Collection<Report> getReportCollection() {
        return reportCollection;
    }

    public void setReportCollection(Collection<Report> reportCollection) {
        this.reportCollection = reportCollection;
    }

    public Integer getReports() {
        return reports;
    }

    public void setReports(Integer reports) {
        this.reports = reports;
    }

    public Collection<Quest> getQuests() {
        return quests;
    }

    public void setQuests(Collection<Quest> quests) {
        this.quests = quests;
    }

    public Collection<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Collection<Photo> photos) {
        this.photos = photos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return String.format("%s %s", firstName, lastName);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday=birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate=registrationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserGroup getGroupID() {
        return groupID;
    }

    public void setGroupID(UserGroup groupID) {
        this.groupID = groupID;
    }


    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBusinessBalance() {
        return businessBalance;
    }

    public void setBusinessBalance(long businessBalance) {
        this.businessBalance = businessBalance;
    }
}
