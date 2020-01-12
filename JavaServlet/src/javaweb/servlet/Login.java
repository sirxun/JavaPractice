package javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @ClassName Login
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/10 9:38 上午
 **/
public class Login extends HttpServlet {
    private String username = "wang@hui";
    private String password = "password";
    private String message;

    public Login(){
        super();
    }

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.setCharacterEncoding("utf-8");
        httpServletResponse.setCharacterEncoding("utf-8");
        String name = httpServletRequest.getParameter("userName");
        String pwd = httpServletRequest.getParameter("password");
        System.out.println("账号为：" + name + " 密码为：" + pwd);
        httpServletResponse.setContentType("text/html");
        if (name.equals(this.username) && pwd.equals(this.password)) {
            this.message = "账号密码正确，登陆成功";
        } else {
            this.message = "账号密码错误，登陆失败";
        }
        // 实际的逻辑是在这里
        PrintWriter out = httpServletResponse.getWriter();
        out.println("<h1>" + this.message + "</h1>");
    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
//        doGet(httpServletRequest, httpServletResponse);
    }
}
