DROP TABLE IF EXISTS workout_exercise CASCADE;
DROP TABLE IF EXISTS workout CASCADE;
DROP TABLE IF EXISTS exercise CASCADE;
DROP TABLE IF EXISTS "user" CASCADE;
DROP TABLE IF EXISTS training CASCADE;
DROP TABLE IF EXISTS training_session CASCADE;

CREATE TABLE IF NOT EXISTS "user"(
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS exercise (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    muscular_group VARCHAR(100) NOT NULL,
    user_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES "user"(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS workout(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    user_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES "user"(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS workout_exercise(
    workout_id INT,
    exercise_id INT,
    PRIMARY KEY (workout_id, exercise_id),
    FOREIGN KEY (workout_id) REFERENCES workout(id) ON DELETE CASCADE,
    FOREIGN KEY (exercise_id) REFERENCES exercise(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS training(
    id SERIAL PRIMARY KEY,
    workout_id INT NOT NULL,
    user_id INT NOT NULL,
    session_date DATE NOT NULL,
    FOREIGN KEY (workout_id) REFERENCES workout(id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES "user"(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS training_session(
    id SERIAL PRIMARY KEY,
    exercise_id INT NOT NULL,
    training_id INT NOT NULL,
    reps INT NOT NULL,
    weight FLOAT NOT NULL,
    FOREIGN KEY (exercise_id) REFERENCES exercise(id) ON DELETE CASCADE,
    FOREIGN KEY (training_id) REFERENCES training(id) ON DELETE CASCADE
);
