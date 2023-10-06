package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Bob", "Robertson", (byte) 20);
        userDao.saveUser("Rob", "Robertson", (byte) 15);
        userDao.saveUser("Tod", "Robertson", (byte) 22);
        userDao.saveUser("Fill", "Robertson", (byte) 12);
        //userDao.dropUsersTable();
        userDao.removeUserById(2);
        System.out.println(userDao.getAllUsers());
    }
}
