/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

/**
 *
 * @author lashanc
 */
public class SystemConfigData {
    private static String activeUser;
    private static String userType;
    private static String employee;

    public static String getActiveUser() {
        return activeUser;
    }

    public static void setActiveUser(String aActiveUser) {
        activeUser = aActiveUser;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String aUserType) {
        userType = aUserType;
    }

    public static String getEmployee() {
        return employee;
    }

    public static void setEmployee(String aEmployee) {
        employee = aEmployee;
    }
    
}
