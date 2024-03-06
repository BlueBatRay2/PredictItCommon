package com.bluebatray.predictitcommon.model.converter;

public interface Converter<T,U> {
    U convert(T source);
}
