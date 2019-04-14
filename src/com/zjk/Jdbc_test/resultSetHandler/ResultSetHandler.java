package com.zjk.Jdbc_test.resultSetHandler;

import java.sql.ResultSet;

public interface ResultSetHandler<T> {
    T handle(ResultSet rs);
}
