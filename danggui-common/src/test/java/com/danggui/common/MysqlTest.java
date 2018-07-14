package com.danggui.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author GongXings
 * @date 2018年7月14日 上午9:42:45
 */
public class MysqlTest {
	


    /**
     * ���ݿ�url
     */
    private static final String URL = "jdbc:mysql://localhost:3306/platform";
    /**
     * �û���
     */
    private static final String USER = "root";
    /**
     * ����
     */
    private static final String PASSWORD = "root";
    /**
     * mysql��������
     */
    private static final String ORACLEDRIVER = "com.mysql.jdbc.Driver";

    /**
     * ��������
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
            System.out.println("���ӳɹ���");

            String sql = "select * from nideshop_user";
            pre = con.prepareStatement(sql);
            result = pre.executeQuery();//ִ�в�ѯ

            while (result.next()) {
                // ���������Ϊ��ʱ
                String username = result.getString("username");
                String mobile = result.getString("mobile");
                System.out.println("��Ա��"+username + "���ֻ��ţ�" +mobile);
            }
        } catch (ClassNotFoundException e) {
            //���ݿ��������쳣����
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            //���ݿ�����ʧ���쳣����
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
                System.out.println("���ݿ������ѹرգ�");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
