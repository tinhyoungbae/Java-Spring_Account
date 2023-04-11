package com.example.tinhh.Status;

public class Status {
    private static String status_ok = "Ok";
    private static String status_error = "Error";
    private static String message_ok = "Query Successfully";
    private static String message_error = "Something went wrong!!!";

    public static String getStatus_ok() {
        return status_ok;
    }

    public static String getStatus_error() {
        return status_error;
    }

    public static String getMessage_ok() {
        return message_ok;
    }

    public static String getMessage_error() {
        return message_error;
    }
}
