package com.rozzer;

import com.rozzer.analyzed.Analyzed;
import com.rozzer.manager.Manager;
import com.rozzer.manager.ManagerFactory;

public class DBManagerFactory implements ManagerFactory {

    public <U extends Analyzed> Manager<U> getManager(Class<U> clazz) {
        return null;
    }

    public void init() {

    }

    public void register(Class<? extends Analyzed> clazz, Manager manager) {

    }
}
