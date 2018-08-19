package com.rozzer.manager;

import com.rozzer.analyzed.Analyzed;

public interface ManagerFactory {
    <U extends Analyzed> Manager<U> getManager(Class<U> clazz);
    void init();
    void register(Class<? extends Analyzed> clazz, Manager manager);
}
