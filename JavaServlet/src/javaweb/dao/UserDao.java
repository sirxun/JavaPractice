package javaweb.dao;

import javaweb.bean.User;

import java.sql.*;
import java.util.ArrayList;

/**
 * @ClassName UserDao
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/10 2:38 下午
 **/

public class UserDao implements UserDaoInterface{
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://172.16.11.74:3306/test?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PWD = "123qwe";
    static Connection conn;

    public UserDao() throws ClassNotFoundException, SQLException {
        System.out.println(DB_URL+USER+PWD);
        Class.forName(JDBC_DRIVER);
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL,USER,PWD);
        System.out.println("-------连接成功------");
    }
    public void initDB() throws SQLException {
        Statement stmt = null;
        try{
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "CREATE TABLE User (" +
                    "    user_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "    username varchar(100)," +
                    "    password varchar(100)," +
                    "    register_time timestamp);";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            assert stmt != null;
            stmt.close();
        }
    }

    public void addUser(User user) throws SQLException {
        Statement stmt = null;
        try{
            stmt = conn.createStatement();
            String sql;
            System.out.println(user.getUserName());
            System.out.println(user.getPassword());
            System.out.println(new Time(user.getRegisterTime().getTime()));
            sql = "INSERT INTO User (username, password, register_time) VALUES ('"+ user.getUserName()+"', '"+user.getPassword()+"' , '"+ new java.sql.Date(user.getRegisterTime().getTime())+" "+ new Time(user.getRegisterTime().getTime())+"');";
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            conn.rollback();
            e.printStackTrace();
        } finally {
            assert stmt != null;
            stmt.close();
        }
    }

    public void getUser(String userId){

    }

    public ArrayList<User> getAllUser(){
        ArrayList<User> userList = new ArrayList<User>();
        return userList;
    }

    public void setPassword(String userName, String password){

    }
}
