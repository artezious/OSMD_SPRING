CREATE TABLE PAYMENT
(
    ID INT(11) PRIMARY KEY NOT NULL,
    CONSUMPTION_ID INT(11) NOT NULL,
    PAID DOUBLE,
    PAYMENT_DATE DATE
);
CREATE TABLE SERVICE
(
    ID INT(11) PRIMARY KEY NOT NULL,
    SERVICENAME VARCHAR(30) NOT NULL,
    TARIFF DOUBLE NOT NULL
);
CREATE TABLE STATEMENT
(
    ID INT(11) PRIMARY KEY NOT NULL,
    CONSUMPTION_ID INT(11),
    PAYMENT_ID INT(11),
    DEBT DOUBLE
);
CREATE TABLE USER
(
    ID INT(11) PRIMARY KEY NOT NULL,
    NAME VARCHAR(30) NOT NULL,
    SURNAME VARCHAR(30) NOT NULL,
    ADDRESS VARCHAR(50) NOT NULL,
    TELEPHONE VARCHAR(30) NOT NULL,
    EMAIL VARCHAR(50),
    ROLE VARCHAR(10) DEFAULT 'ANONYMOUS' NOT NULL
);
CREATE TABLE CONSUMPTION
(
    ID INT(11) PRIMARY KEY NOT NULL,
    LV INT(11),
    RTV INT(11),
    CONSUMED INT(11),
    TOTAL_CONSUMED INT(11),
    SERVICE_ID INT(11) NOT NULL,
    USER_ID INT(11) NOT NULL
);
ALTER TABLE STATEMENT ADD FOREIGN KEY (CONSUMPTION_ID) REFERENCES CONSUMPTION (ID) ON DELETE CASCADE;
ALTER TABLE STATEMENT ADD FOREIGN KEY (PAYMENT_ID) REFERENCES PAYMENT (ID);
CREATE INDEX CONSUMPTION_ID ON STATEMENT (CONSUMPTION_ID);
CREATE INDEX PAYMENT_ID ON STATEMENT (PAYMENT_ID);
ALTER TABLE CONSUMPTION ADD FOREIGN KEY (SERVICE_ID) REFERENCES SERVICE (ID) ON DELETE CASCADE;
ALTER TABLE CONSUMPTION ADD FOREIGN KEY (USER_ID) REFERENCES USER (ID) ON DELETE CASCADE;
CREATE INDEX SERVICE_ID ON CONSUMPTION (SERVICE_ID);
CREATE INDEX USER_ID ON CONSUMPTION (USER_ID);