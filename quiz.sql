PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE questions (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    question_text TEXT NOT NULL,
    option1 TEXT NOT NULL,
    option2 TEXT NOT NULL,
    option3 TEXT NOT NULL,
    option4 TEXT NOT NULL,
    correct_option INTEGER NOT NULL
);
INSERT INTO questions VALUES(1,'What is the capital of France?','Berlin','Madrid','Paris','Rome',3);
INSERT INTO questions VALUES(2,'Which planet is known as the Red Planet?','Earth','Mars','Jupiter','Saturn',2);
INSERT INTO questions VALUES(3,'What is 2 + 2?','3','4','5','6',2);
INSERT INTO sqlite_sequence VALUES('questions',3);
COMMIT;
