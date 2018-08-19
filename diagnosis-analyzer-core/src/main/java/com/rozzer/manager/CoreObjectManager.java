package com.rozzer.manager;

import com.rozzer.analyzed.Analyzed;

public class CoreObjectManager {

    private static CoreObjectManager instance = new CoreObjectManager();

    public static CoreObjectManager getInstance() {
        return instance;
    }

    private ManagerFactory managerFactory;

    private CoreObjectManager() {
    }

    public <T extends Analyzed> Manager<T>  getManager(Class<T> clazz){
        return managerFactory.getManager(clazz);
    }
}
