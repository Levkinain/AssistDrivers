package ru.netcracker.Entity;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class User {
    public static String LOGIN = "login";
    public static String PASSWORD = "password";
    public static String ROLE = "role";

    //поле, содержащее  логин польщователя в системе
    private String login;
    //поле, содержащее  пароль пользователя в системе
    private String password;
    //лист, содержащий роли пользователя в системе
    private List<String> roles;

    /**
     * Конструктор по умолчанию
     */
    public User(){
    }

    /**Конструктор с параметрами
     * @param login
     * Объект типа {@code String} содержащий логин польщователя в системе
     * @param password
     * Объект типа {@code String} содержащий  пароль пользователя в системе
     * @param roles
     * Объект типа {@code String}, содержащий роли пользователя в системе
     */
    public User(String login, String password, List<String> roles){
        this.login = login;
        this.password = password;
        this.roles = roles;
    }

    /**Метод, выполняющий получение объекта {@code String login}
     * @return login
     * объект типа {@code String}, содержащий логин пользователя в системе
     */
    public String getLogin() {
        return login;
    }

    /**Метод, выполняющий установку значения поля  {@code String login}
     * @param login
     * объект типа {@code String}, содержащий логин пользователя в системе
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**Метод, выполняющий получение объекта {@code String password}
     * @return password
     * объект типа {@code String}, содержащий пароль пользователя в системе
     */
    public String getPassword() {
        return password;
    }

    /**Метод, выполняющий установку значения поля  {@code String password}
     * @param password
     * объект типа {@code String}, содержащий пароль пользователя в системе
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**Метод, выполняющий получение объекта {@code String roles}
     * @return roles
     * объект типа {@code String}, содержащий роль пользователя в системе
     */
    public List<String> getRoles() {
        return roles;
    }

    /**Метод, выполняющий установку значения поля  {@code String roles}
     * @param roles
     * объект типа {@code String}, содержащий роль пользователя в системе
     */
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    /**Метод, переопределяющий стандартный метод родительского класса {@code Object} преобразования объекта в строку
     * @return
     * объект типа стринг, являющийся строковым предсталение объекта {@core User}
     */
    @Override
    public String toString() {
        return User.class.getName() + " [login: "  + login.toString() +  ", roles: " + Arrays.toString(roles.toArray()) + " ]";
    }
}
