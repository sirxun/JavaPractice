package javaweb.servlet;

import javaweb.bean.User;
import javaweb.dao.UserDao;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Map;

import com.alibaba.fastjson.*;

/**
 * @ClassName Register
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/10 2:30 下午
 **/
public class Register extends HttpServlet {

    public String userName;
    public String password;

    public Register(){
        super();
    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletRequest.setCharacterEncoding("utf-8");
        httpServletResponse.setCharacterEncoding("utf-8");

        InputStreamReader insr = new InputStreamReader(httpServletRequest.getInputStream(),"utf-8");
        StringBuilder result = new StringBuilder();
        int respInt = insr.read();
        while(respInt!=-1) {
            result.append((char) respInt);
            respInt = insr.read();
        }
        System.out.println("xxxxxxxx："+result.toString());
        User user = JSONObject.parseObject(result.toString(), User.class);
        userName = user.getUserName();
        password = user.getPassword();
        System.out.println(userName);
        System.out.println(password);
//        User user = new User(userName, password);
        try {
            UserDao dao = new UserDao();
            dao.addUser(user);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
