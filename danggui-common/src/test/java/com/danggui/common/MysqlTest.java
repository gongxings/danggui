package com.danggui.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 数据库测试类
 * @author GongXings
 * @date 2018年7月8日
 */
public class MysqlTest {
	


    /**
     * 数据库url
     */
    private static final String URL = "jdbc:mysql://localhost:3306/platform";
    /**
     * 用户名
     */
    private static final String USER = "root";
    /**
     * 密码
     */
    private static final String PASSWORD = "root";
    /**
     * mysql驱动程序
     */
    private static final String ORACLEDRIVER = "com.mysql.jdbc.Driver";

    /**
     * 启动程序
     *
     * @param args
     */
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet result = null;
        try {
            Class.forName(ORACLEDRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("连接成功！");

            String sql = "select * from nideshop_user";
            pre = con.prepareStatement(sql);
            result = pre.executeQuery();//执行查询

            while (result.next()) {
                // 当结果集不为空时
                String username = result.getString("username");
                String mobile = result.getString("mobile");
                System.out.println("会员："+username + "；手机号：" +mobile);
            }
        } catch (ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (pre != null) {
                    pre.close();
                }
                if (con != null) {
                    con.close();
                }
                System.out.println("数据库连接已关闭！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
