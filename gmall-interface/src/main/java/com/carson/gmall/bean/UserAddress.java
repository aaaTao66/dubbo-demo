package com.carson.gmall.bean;


import java.io.Serializable;

public class UserAddress implements Serializable {

    private Integer id;
    private String userAddress; // 用户地址
    private String userId; // 用户id
    private String consignee; // 收货人
    private String phoneNum; // 电话号码
    private String isDefault; // 是否为默认地址 yes / no

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", userAddress='" + userAddress + '\'' +
                ", userId='" + userId + '\'' +
                ", consignee='" + consignee + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isDefault='" + isDefault + '\'' +
                '}';
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public UserAddress() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }
}
