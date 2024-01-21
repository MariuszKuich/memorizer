CREATE TABLE MEMORIZER.COLLECTIONS (
    ID SERIAL PRIMARY KEY,
    NAME VARCHAR(150) NOT NULL,
    DISTRIBUTION_TIME_UTC TIME,
    DISTRIBUTION_SERIES INTEGER NOT NULL DEFAULT 1,
    OWNER_ID INTEGER NOT NULL,
    FOREIGN KEY (OWNER_ID) REFERENCES MEMORIZER.USERS(ID)
);