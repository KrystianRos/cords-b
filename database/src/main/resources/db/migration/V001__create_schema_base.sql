CREATE SEQUENCE sq_user_role_id
    START WITH 1000
    NO CYCLE;

CREATE TABLE user_role
(
    id        BIGINT PRIMARY KEY,
    role_name VARCHAR(255)
);

CREATE SEQUENCE sq_app_user_id
    START WITH 1000
    NO CYCLE;

CREATE TABLE app_user
(
    id       BIGINT PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    role     BIGINT REFERENCES user_role (id)
);


INSERT INTO user_role(id, role_name)
VALUES (NEXTVAL('sq_user_role_id'), 'admin');

INSERT INTO app_user(id, username, password, role)
VALUES (NEXTVAL('sq_app_user_id'), 'admin', 'admin', (SELECT id FROM user_role WHERE role_name = 'admin'));