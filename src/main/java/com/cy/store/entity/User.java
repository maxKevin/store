package com.cy.store.entity;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.uid
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.salt
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.phone
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.gender
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private Integer gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.avatar
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private String avatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.is_delete
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.created_user
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private String createdUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.created_time
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.modified_user
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private String modifiedUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.modified_time
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    private Date modifiedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.uid
     *
     * @return the value of t_user.uid
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.uid
     *
     * @param uid the value for t_user.uid
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.salt
     *
     * @return the value of t_user.salt
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.salt
     *
     * @param salt the value for t_user.salt
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.phone
     *
     * @return the value of t_user.phone
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.phone
     *
     * @param phone the value for t_user.phone
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.gender
     *
     * @return the value of t_user.gender
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.gender
     *
     * @param gender the value for t_user.gender
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.avatar
     *
     * @return the value of t_user.avatar
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.avatar
     *
     * @param avatar the value for t_user.avatar
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.is_delete
     *
     * @return the value of t_user.is_delete
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.is_delete
     *
     * @param isDelete the value for t_user.is_delete
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.created_user
     *
     * @return the value of t_user.created_user
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.created_user
     *
     * @param createdUser the value for t_user.created_user
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.created_time
     *
     * @return the value of t_user.created_time
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.created_time
     *
     * @param createdTime the value for t_user.created_time
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.modified_user
     *
     * @return the value of t_user.modified_user
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public String getModifiedUser() {
        return modifiedUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.modified_user
     *
     * @param modifiedUser the value for t_user.modified_user
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.modified_time
     *
     * @return the value of t_user.modified_time
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.modified_time
     *
     * @param modifiedTime the value for t_user.modified_time
     *
     * @mbggenerated Sun Sep 04 20:36:15 CST 2022
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}