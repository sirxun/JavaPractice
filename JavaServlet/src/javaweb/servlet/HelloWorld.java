package javaweb.servlet;

import javaweb.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * @ClassName javaweb.servlet.HelloWorld
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/9 5:17 下午
 **/
public class HelloWorld extends HttpServlet {
    private String message;

    public void init() throws ServletException
    {
        // 执行必需的初始化
        this.message = "Hello World";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        // 设置响应内容类型
        response.setContentType("text/html");
        try {
            UserDao userDao = new UserDao();
            userDao.initDB();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void doDestory(){

    }

}
