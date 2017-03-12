package com.usopp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * User Entity
 * Created by fov on 2017/3/7.
 */
@Entity
public class User extends Entitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String tellPhone;
    @Column(nullable = false)
    private String serialNumber;

    private Date createTime;
    @Column(columnDefinition = "最后更新时间")
    private Date lastModifyTime;

    public User() {
    }

    public User(String username, String password, String tellphone) {
        this.userName = username;
        this.passWord = password;
        this.tellPhone = tellphone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String password) {
        this.passWord = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTellPhone() {
        return tellPhone;
    }

    public void setTellPhone(String tellphone) {
        this.tellPhone = tellphone;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
