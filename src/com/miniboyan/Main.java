package com.miniboyan;

import com.miniboyan.util.ConectorBD;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConectorBD.getConnection();
    }
}
