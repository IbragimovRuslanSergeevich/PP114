package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
      //  UserDao userDao = new UserDaoJDBCImpl();
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
       // userDao.createUsersTable();
        userService.saveUser("Bob", "Robertson", (byte) 20);
        userService.saveUser("Rob", "Robertson", (byte) 15);
        userService.saveUser("Tod", "Robertson", (byte) 22);
        userService.saveUser("Fill", "Robertson", (byte) 12);
//        userService.dropUsersTable();
        userService.removeUserById(2);
//        System.out.println(userService.getAllUsers());
    }
}
