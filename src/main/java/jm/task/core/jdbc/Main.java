package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        Util.getConnection();// реализуйте алгоритм здесь
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        //userDaoJDBC.saveUser("Иван","Иванов", (byte) 33);
        //userDaoJDBC.saveUser("Андрей","Павлов", (byte) 18);
        //userDaoJDBC.saveUser("Олег","Фролов", (byte) 28);
        //userDaoJDBC.saveUser("Юрий","Дятлов", (byte) 36);
        //userDaoJDBC.cleanUsersTable();// удаление всех юзеров
        //userDaoJDBC.removeUserById(11);// удаление одного юзера
        //userDaoJDBC.getAllUsers();//получение всех юзеров из базы
        //userDaoJDBC.cleanUsersTable();//очистка таблицы от юзеров
        //userDaoJDBC.dropUsersTable();// удаление таблицы

    }
}
