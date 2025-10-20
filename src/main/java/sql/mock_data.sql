-- Beginning of mock_data.sql

DELETE FROM workout_exercice WHERE exercice_id>=0;
DELETE FROM workout WHERE id>=0;
DELETE FROM exercice WHERE id>=0;
DELETE FROM userapp WHERE id>=0;

INSERT INTO userapp (id, username, email, password) VALUES
(1, 'evan_dynak', 'accortiogo@gmail.com', 'password123'),
(2, 'john_doe', 'test@test.fr', 'password456'),
(3, 'alice_smith', 'alice@example.com', 'alicePass'),
(4, 'bob_lee', 'bob@example.com', 'bobPass');

INSERT INTO exercice (id, name, muscular_group, user_id) VALUES
(1, 'Push-Up', 'Chest', 1),
(2, 'Squat', 'Legs', 2),
(3, 'Pull-Up', 'Back', 1),
(4, 'Deadlift', 'Back', 1),
(5, 'Bicep Curl', 'Arms', 2),
(6, 'Tricep Dip', 'Arms', 4),
(7, 'Lunges', 'Legs', 3),
(8, 'Plank', 'Core', 4),
(9, 'Shoulder Press', 'Shoulders', 3),
(10, 'Bench Press', 'Chest', 4),
(11, 'Overhead Squat', 'Legs', 2),
(12, 'Lat Pulldown', 'Back', 1),
(13, 'Chest Fly', 'Chest', 3),
(14, 'Leg Press', 'Legs', 3),
(15, 'Calf Raise', 'Legs', 1),
(16, 'Hammer Curl', 'Arms', 2),
(17, 'Skull Crusher', 'Arms', 4),
(18, 'Russian Twist', 'Core', 2),
(19, 'Front Raise', 'Shoulders', 3),
(20, 'Incline Bench Press', 'Chest', 1);

INSERT INTO workout (id, name, user_id) VALUES
(1, 'Morning Routine', 1),
(2, 'Evening Routine', 2),
(3, 'Leg Day', 1),
(4, 'Upper Body Strength', 1),
(5, 'Core Focus', 2);

INSERT INTO workout_exercice (workout_id, exercice_id) VALUES
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

INSERT INTO training (id, workout_id, user_id, session_date) VALUES
(1, 1, 1, '2023-10-01'),
(2, 2, 2, '2023-10-02'),
(3, 3, 1, '2023-10-03'),
(4, 4, 1, '2023-10-04'),
(5, 5, 2, '2023-10-05'),
(6, 5, 3, '2023-10-06'),
(7, 2, 3, '2023-10-06'),
(8, 1, 4, '2023-10-07'),
(9, 2, 4, '2023-10-07'),
(10, 3, 1, '2023-10-08'),
(11, 3, 1, '2023-10-09'),
(12, 4, 1, '2023-10-10');

INSERT INTO training_session (id, exercice_id, training_id, reps, weight) VALUES
(1, 1, 1, 15, 0),
(2, 2, 1, 20, 0),
(3, 10, 1, 10, 50),
(4, 14, 1, 12, 100),
(5, 4, 2, 8, 150),
(6, 16, 2, 15, 0),
(7, 3, 2, 10, 0),
(8, 4, 3, 6, 180),
(9, 2, 3, 20, 0),
(10, 7, 3, 15, 0),
(11, 14, 3, 12, 120),
(12, 15, 3, 25, 0),
(13, 9, 4, 10, 40),
(14, 3, 4, 10, 0),
(15, 4, 4, 8, 160),
(16, 16, 4, 15, 0),
(17, 8, 5, 60, 0),
(18, 18, 5, 30, 0),
(19, 1, 5, 20, 0),
(20, 3, 5, 10, 0),
(21, 10, 5, 12, 55);

-- End of mock_data.sql