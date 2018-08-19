package com.rozzer.manager;

import com.rozzer.analyzed.Analyzed;

import java.math.BigInteger;

public interface Manager<T extends Analyzed> {
    void save(Analyzed analyzed);
    void delete(Analyzed analyzed);
    Analyzed getById(BigInteger id);
    Analyzed create();

}
