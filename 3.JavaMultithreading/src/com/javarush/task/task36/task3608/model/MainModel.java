package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model {

    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    public void setModelData(ModelData modelData) {
        this.modelData = modelData;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(getAllUsers());

    }

    public void loadDeletedUsers() {
        modelData.setDisplayDeletedUserList(true);
        modelData.setUsers(userService.getAllDeletedUsers());
    }

    public void loadUserById(long userId) {
        modelData.setActiveUser(userService.getUsersById(userId));
    }

    public void deleteUserById(long id) {
        userService.deleteUser(id);
        modelData.setUsers(getAllUsers());
    }

    private List<User> getAllUsers(){
        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1, 100));
    }

    public void changeUserData(String name, long id, int level){
        userService.createOrUpdateUser(name, id, level);
        modelData.setUsers(getAllUsers());
    }
}
