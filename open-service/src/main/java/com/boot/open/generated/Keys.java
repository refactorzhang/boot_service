/*
 * This file is generated by jOOQ.
*/
package com.boot.open.generated;


import com.boot.open.generated.tables.Request;
import com.boot.open.generated.tables.SchemaVersion;
import com.boot.open.generated.tables.User;
import com.boot.open.generated.tables.records.RequestRecord;
import com.boot.open.generated.tables.records.SchemaVersionRecord;
import com.boot.open.generated.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>open</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<RequestRecord, Integer> IDENTITY_REQUEST = Identities0.IDENTITY_REQUEST;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<RequestRecord> KEY_REQUEST_PRIMARY = UniqueKeys0.KEY_REQUEST_PRIMARY;
    public static final UniqueKey<SchemaVersionRecord> KEY_SCHEMA_VERSION_PRIMARY = UniqueKeys0.KEY_SCHEMA_VERSION_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_UNIQ_USER_NAME = UniqueKeys0.KEY_USER_UNIQ_USER_NAME;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<RequestRecord, Integer> IDENTITY_REQUEST = createIdentity(Request.REQUEST, Request.REQUEST.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<RequestRecord> KEY_REQUEST_PRIMARY = createUniqueKey(Request.REQUEST, "KEY_request_PRIMARY", Request.REQUEST.ID);
        public static final UniqueKey<SchemaVersionRecord> KEY_SCHEMA_VERSION_PRIMARY = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "KEY_schema_version_PRIMARY", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_UNIQ_USER_NAME = createUniqueKey(User.USER, "KEY_user_uniq_user_name", User.USER.USER_NAME);
    }
}
