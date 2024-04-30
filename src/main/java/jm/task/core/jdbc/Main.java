package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService =new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Иван","Иванов", (byte) 33);
        userService.saveUser("Андрей","Павлов", (byte) 18);
        userService.saveUser("Олег","Фролов", (byte) 28);
        userService.saveUser("Юрий","Дятлов", (byte) 36);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        userService.removeUserById(5);


    }
}
