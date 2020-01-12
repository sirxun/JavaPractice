package javaweb.dao;

import javaweb.bean.User;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @ClassName UserDaoInterface
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/10 2:44 下午
 **/
public interface UserDaoInterface {

    // 初始化表结构
    public void initDB() throws SQLException;

    // 增加用户
    public void addUser(User user) throws SQLException;

    // 获取单个用户信息
    public void getUser(String userId);

    // 获取全部用户信息
    public ArrayList<User> getAllUser();

    // 设置用户密码
    public void setPassword(String userName, String password);
}
