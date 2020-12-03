package com.l30mysql;

import java.sql.*;

import com.alibaba.fastjson.JSON;
import cn.hutool.json.JSONUtil;

public class main {

    public static void main(String[] args) {
        test();
    }

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/matchlogservice?serverTimezone=GMT";

    static final String USER = "root";
    static final String PWD = "123456";

    static void test() {
        Connection con = null;
        Statement statement = null;

        try {

            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PWD);
            statement = con.createStatement();
            String sql = "select * from matchlogservice.importedinfos limit 10;";
            ResultSet set = statement.executeQuery(sql);

            while (set.next()) {
                int id = set.getInt("Id");
                String esId = set.getString("EsId");
                String path = set.getString("MiObjPath");
                System.out.println(String.format("id=%d,esId=%s,path=%s", id, esId, path));
            }

//            String j = JSONUtil.toJsonStr(set);
//            System.out.println(j);

//            String json = JSON.toJSONString(set);
//            System.out.println(json);

            set.close();
            statement.close();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
