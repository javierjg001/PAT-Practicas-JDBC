DROP TABLE IF EXISTS ORDERS;
DROP TABLE IF EXISTS CUSTOMERS;

CREATE TABLE HABITACIONES (
    ID INTEGER IDENTITY PRIMARY KEY,
    USUARIO_ID INTEGER NOT NULL,
    CHECK_IN_DATE DATE NOT NULL
);

CREATE TABLE USUARIOS (
    ID INTEGER IDENTITY PRIMARY KEY,
    USUARIO_NOMBRE VARCHAR(255) NOT NULL,
    USUARIO_APELLIDO VARCHAR(255) NOT NULL,
    PAIS VARCHAR(255) NOT NULL
);