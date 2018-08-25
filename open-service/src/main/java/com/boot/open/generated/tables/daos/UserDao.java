/*
 * This file is generated by jOOQ.
*/
package com.boot.open.generated.tables.daos;


import com.boot.open.generated.tables.User;
import com.boot.open.generated.tables.records.UserRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDao extends DAOImpl<UserRecord, com.boot.open.generated.tables.pojos.User, Integer> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, com.boot.open.generated.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    public UserDao(Configuration configuration) {
        super(User.USER, com.boot.open.generated.tables.pojos.User.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.boot.open.generated.tables.pojos.User object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchById(Integer... values) {
        return fetch(User.USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.boot.open.generated.tables.pojos.User fetchOneById(Integer value) {
        return fetchOne(User.USER.ID, value);
    }

    /**
     * Fetch records that have <code>user_name IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchByUserName(String... values) {
        return fetch(User.USER.USER_NAME, values);
    }

    /**
     * Fetch a unique record that has <code>user_name = value</code>
     */
    public com.boot.open.generated.tables.pojos.User fetchOneByUserName(String value) {
        return fetchOne(User.USER.USER_NAME, value);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchByDescription(String... values) {
        return fetch(User.USER.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchByAge(Integer... values) {
        return fetch(User.USER.AGE, values);
    }

    /**
     * Fetch records that have <code>sex IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchBySex(Integer... values) {
        return fetch(User.USER.SEX, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchByPassword(String... values) {
        return fetch(User.USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchByIsDeleted(Boolean... values) {
        return fetch(User.USER.IS_DELETED, values);
    }

    /**
     * Fetch records that have <code>deleted_at IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchByDeletedAt(LocalDateTime... values) {
        return fetch(User.USER.DELETED_AT, values);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(User.USER.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>updated_at IN (values)</code>
     */
    public List<com.boot.open.generated.tables.pojos.User> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(User.USER.UPDATED_AT, values);
    }
}
