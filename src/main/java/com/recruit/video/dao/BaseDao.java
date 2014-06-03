package com.recruit.video.dao;

import org.hibernate.Session;

public interface BaseDao<T> {
    public T findById(int id);
    public Session getSession();
}
