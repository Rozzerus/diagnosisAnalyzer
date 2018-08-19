package com.rozzer.analyzed;

import javax.annotation.Nonnull;
import java.math.BigInteger;

abstract class AbstractAnalyzed implements Analyzed {

    @Nonnull
    public BigInteger getId() {
        return BigInteger.valueOf(0);
    }

    public void setId(@Nonnull BigInteger id) {

    }

    public void save() {

    }
}
