package javaweb.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName User
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/10 11:34 上午
 **/
public class User {
    private String userId;
    private String userName;
    private String password;
    private Date registerTime;


    public User(String userName, String password) throws ParseException {
        this.userId = UUID.randomUUID().toString().replaceAll("-", "");

        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.registerTime = new Date();
        String str = sdf.format(this.registerTime);
        this.registerTime = sdf.parse(str);

        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
