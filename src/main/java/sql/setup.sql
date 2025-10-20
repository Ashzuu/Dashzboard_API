DROP TABLE IF EXISTS workout_exercice;
DROP TABLE IF EXISTS workout;
DROP TABLE IF EXISTS exercice;
DROP TABLE IF EXISTS userapp;
DROP TABLE IF EXISTS training_session;

CREATE TABLE IF NOT EXISTS userapp(
    id INT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS exercice(
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    muscular_group VARCHAR(100) NOT NULL,
    user_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES userApp(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS workout(
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    user_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES userApp(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS workout_exercice(
    workout_id INT,
    exercice_id INT,
    PRIMARY KEY (workout_id, exercice_id),
    FOREIGN KEY (workout_id) REFERENCES workout(id) ON DELETE CASCADE,
    FOREIGN KEY (exercice_id) REFERENCES exercice(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS training_session(
    id INT PRIMARY KEY,
    workout_id INT NOT NULL,
    user_id INT NOT NULL,
    session_date DATE NOT NULL,
    reps INT NOT NULL,
    sets INT NOT NULL,
    weight FLOAT NOT NULL,
    FOREIGN KEY (workout_id) REFERENCES workout(id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES userApp(id) ON DELETE CASCADE
)