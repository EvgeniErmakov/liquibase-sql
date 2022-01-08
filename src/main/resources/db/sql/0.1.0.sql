--liquibase formatted sql

--changeset ermakov:20220106-01
CREATE TABLE artquiz.topic
(
    id SERIAL PRIMARY KEY,
    name TEXT,
    parent_id INTEGER,
    alias_id INTEGER,
    create_date TIMESTAMP DEFAULT current_timestamp NOT NULL,
    update_date TIMESTAMP DEFAULT current_timestamp NOT NULL,
    is_active BOOLEAN DEFAULT TRUE
);
--rollback DROP TABLE IF EXISTS artquiz.topic CASCADE

--changeset ermakov:123
CREATE TABLE artquiz.ermakov(
   id SERIAL PRIMARY KEY,
   name varchar
);
--rollback DROP TABLE IF EXISTS artquiz.ermakov CASCADE

--changeset ermakov:1234
CREATE TABLE artquiz.ermakov4(
                                id4 SERIAL PRIMARY KEY,
                                name4 varchar
);
--rollback DROP TABLE IF EXISTS artquiz.ermakov4 CASCADE;

--changeset ermakov:12346
INSERT INTO artquiz.ermakov4 VALUES(1,'123');
--rollback TRUNCATE TABLE artquiz.ermakov4;

--changeset ermakov:5
INSERT INTO artquiz.ermakov4 VALUES(2,'123');
--rollback TRUNCATE TABLE artquiz.ermakov4;

--changeset ermakov:6 tag:tager
INSERT INTO artquiz.ermakov4 VALUES(3,'667');
--rollback DELETE FROM artquiz.ermakov4 WHERE id4=3;

--changeset ermakov:7
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM artquiz.ermakov4
INSERT INTO artquiz.ermakov4 VALUES(4,'777');
--rollback DELETE FROM artquiz.ermakov4 WHERE id4=4;

--changeset ermakov:8
--preconditions onFail:MARK_RAN
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM artquiz.ermakov4
INSERT INTO artquiz.ermakov4 VALUES(8,'888');
--rollback DELETE FROM artquiz.ermakov4 WHERE id4=8;