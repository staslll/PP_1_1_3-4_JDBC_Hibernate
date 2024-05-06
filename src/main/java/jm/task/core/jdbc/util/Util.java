package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/new_schema";
    private static final String USER = "root";
    private static final String PASWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;

    }
    private static SessionFactory factory;
    public static SessionFactory getFactory() {
            Configuration configuration =new Configuration();
            configuration.setProperty("hibernate.connection.url",URL);
            configuration.setProperty("hibernate.connection.username",USER);
            configuration.setProperty("hibernate.connection.password",PASWORD);
            configuration.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
            configuration.setProperty("hibernate.show_sql","true");
            configuration.addAnnotatedClass(User.class);
            factory = configuration.buildSessionFactory();
        return configuration.buildSessionFactory();
    }
    public static void closeFactory () {
        getFactory().close();
    }
}

