package com.zjk.Jdbc_test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.*;

public class JDBCUtil {
    public static String url = "jdbc:mysql://localhost:3306/StudentIS?serverTimezone=UTC";
    public static String name = "root";
    public static String password = "root";
    private static ComboPooledDataSource dataSource=new ComboPooledDataSource();

    static{
        dataSource.setUser(name);
        dataSource.setJdbcUrl(url);
        dataSource.setPassword(password);
    }
    public static void main(String[] args) {
        String sql = "insert into student values(null,?,?,?,?,?,?,?)";
        update(sql,"0604011","冒学","男",21,"日下","0604010@uestc.com",null);

    }

    public static void update(String sql,Object ...args){
        Connection c=null;
        PreparedStatement ps = null;
        try {
            c=JDBCUtil.getConn();
            ps=c.prepareStatement(sql);
            if(args.length!=ps.getParameterMetaData().getParameterCount()){
                System.out.println("参数数量不匹配，请重试");
                return;
            }
            for(int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            release(c,ps);
        }
    }

    public static void register() {
        Connection connection = null;
        Statement statement = null;
        String sql = null;
        ResultSet resultSet = null;
        try {
            //DriverManager.registerDriver(new Driver());
            connection = getConn();
            statement = connection.createStatement();
            sql = "select * from user";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("id=" + resultSet.getInt("Uid") + " name=" + resultSet.getString("Uname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            release(connection, statement, resultSet);
        }
    }

    public static Connection getConn() throws SQLException {
        return dataSource.getConnection();
    }

    public static void release(Connection c, Statement s, ResultSet r) {
        closeCon(c);
        closeSta(s);
        closeRes(r);
    }

    public static void release(Connection c, Statement s) {
        closeCon(c);
        closeSta(s);
    }

    public static void closeCon(Connection c) {

        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            c = null;
        }
    }

    public static void closeSta(Statement s) {

        try {
            if (s != null) {
                s.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            s = null;
        }
    }

    public static void closeRes(ResultSet r) {

        try {
            if (r != null) {
                r.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            r = null;
        }
    }
}
