package com.test.dao;

import com.test.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestDao {

    public void insertName(String name) {

        Connection conn = DBUtil.getConnection();

        String updatedSql = "INSERT INTO TestTable (name) VALUES (?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(updatedSql);
            stmt.setString(1, name);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            System.out.println("TestDao.insertName() got an exception: " + ex.getMessage());
        }

    }
}
