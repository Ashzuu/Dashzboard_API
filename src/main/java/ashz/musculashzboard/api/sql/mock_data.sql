-- Beginning of mock_data.sql

DELETE FROM workout_exercise WHERE exercise_id>=0;
DELETE FROM workout WHERE id>=0;
DELETE FROM exercise WHERE id>=0;
DELETE FROM "user" WHERE id>=0;

INSERT INTO "user" (username, email, password) VALUES
('evan_dynak', 'accortiogo@gmail.com', 'password123'),
('john_doe', 'test@test.fr', 'password456'),
('alice_smith', 'alice@example.com', 'alicePass'),
('bob_lee', 'bob@example.com', 'bobPass');

INSERT INTO exercise (name, muscular_group, user_id) VALUES
('Push-Up', 'Chest', 1),
('Squat', 'Legs', 2),
('Pull-Up', 'Back', 1),
('Deadlift', 'Back', 1),
('Bicep Curl', 'Arms', 2),
('Tricep Dip', 'Arms', 4),
('Lunges', 'Legs', 3),
('Plank', 'Core', 4),
('Shoulder Press', 'Shoulders', 3),
('Bench Press', 'Chest', 4),
('Overhead Squat', 'Legs', 2),
('Lat Pulldown', 'Back', 1),
('Chest Fly', 'Chest', 3),
('Leg Press', 'Legs', 3),
('Calf Raise', 'Legs', 1),
('Hammer Curl', 'Arms', 2),
('Skull Crusher', 'Arms', 4),
('Russian Twist', 'Core', 2),
('Front Raise', 'Shoulders', 3),
('Incline Bench Press', 'Chest', 1);

INSERT INTO workout (name, user_id) VALUES
('Morning Routine', 1),
('Evening Routine', 2),
('Leg Day', 1),
('Upper Body Strength', 1),
('Core Focus', 2);

INSERT INTO workout_exercise (workout_id, exercise_id) VALUES
(1, 1),
(1, 2),
(1, 10),
(1, 14),
(2, 4),
(2, 16),
(2, 3),
(3, 4),
(3, 2),
(3, 7),
(3, 14),
(3, 15),
(4, 9),
(4, 3),
(4, 4),
(4, 16),
(5, 8),
(5, 18),
(5, 1),
(5, 3),
(5, 10);

INSERT INTO training (workout_id, user_id, session_date) VALUES
(1, 1, '2023-10-01'),
(2, 2, '2023-10-02'),
(3, 1, '2023-10-03'),
(4, 1, '2023-10-04'),
(5, 2, '2023-10-05'),
(5, 3, '2023-10-06'),
(2, 3, '2023-10-06'),
(1, 4, '2023-10-07'),
(2, 4, '2023-10-07'),
( 3, 1, '2023-10-08'),
( 3, 1, '2023-10-09'),
( 4, 1, '2023-10-10');

INSERT INTO training_session (exercise_id, training_id, reps, weight) VALUES
(1, 1, 15, 0),
(2, 1, 20, 0),
(10, 1, 10, 50),
(14, 1, 12, 100),
(4, 2, 8, 150),
(16, 2, 15, 0),
(3, 2, 10, 0),
(4, 3, 6, 180),
(2, 3, 20, 0),
( 7, 3, 15, 0),
( 14, 3, 12, 120),
( 15, 3, 25, 0),
( 9, 4, 10, 40),
( 3, 4, 10, 0),
( 4, 4, 8, 160),
( 16, 4, 15, 0),
( 8, 5, 60, 0),
( 18, 5, 30, 0),
( 1, 5, 20, 0),
( 3, 5, 10, 0),
( 10, 5, 12, 55);

-- End of mock_data.sql