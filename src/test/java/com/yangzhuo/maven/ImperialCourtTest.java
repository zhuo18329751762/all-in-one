package com.yangzhuo.maven;

import com.yangzhuo.imperial.court.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;

public class ImperialCourtTest {
    @Test
    public void testGetConnection(){
        Connection connection = JDBCUtils.getConnection();
        System.out.println("connection"+connection);
        JDBCUtils.releaseConnection(connection);
    }
}
