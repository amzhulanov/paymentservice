DROP TABLE IF EXISTS users;
CREATE TABLE users (
                       id                    bigserial,
                       phone                 VARCHAR(30) NOT NULL UNIQUE,
                       password              VARCHAR(80),
                       email                 VARCHAR(50) UNIQUE,
                       first_name            VARCHAR(50),
                       last_name             VARCHAR(50),
                       PRIMARY KEY (id)
);

DROP TABLE IF EXISTS cash_flow;
CREATE TABLE roles (
                       id                    serial,
                       name                  VARCHAR(50) NOT NULL,
                       PRIMARY KEY (id)
);
