DROP DATABASE Jaegers;
DROP TABLE Jaegers;
CREATE DATABASE Jaegers;
CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark TEXT,
	height NUMERIC(7,3),
	weight NUMERIC(7,3),
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INT
);
\i /Users/user/Desktop/StartJava/src/com/startjava/Lesson_5/init_db.sql;
\i /Users/user/Desktop/StartJava/src/com/startjava/Lesson_5/queries.sql;
