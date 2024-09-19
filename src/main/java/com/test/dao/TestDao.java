package com.test.dao;

import com.test.util.DBUtil;

import java.sql.Connection;
import java.sql.Statement;

public class TestDao {

    public void insertName(String name) {

        Connection conn = DBUtil.getConnection();

        String issueSql = "INSERT INTO TestTable (name) VALUES ('" + name + "')";

        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(issueSql);
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            System.out.println("TestDao.insertName() got an exception: " + ex.getMessage());
        }

    }
}
