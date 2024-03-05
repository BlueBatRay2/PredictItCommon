package com.bluebatray.predictitcommon.converter;

public interface Converter<T,U> {
    U convert(T source);
}
