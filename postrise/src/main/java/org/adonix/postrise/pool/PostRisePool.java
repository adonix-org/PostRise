package org.adonix.postrise.pool;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.dbcp2.BasicDataSource;

abstract class PostRisePool {

    private final ConcurrentMap<String, BasicDataSource> dataSourceMap = new ConcurrentHashMap<>();
}
