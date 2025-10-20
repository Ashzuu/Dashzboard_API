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

INSERT INTO training_session (id, workout_id, user_id, session_date, reps, sets, weight) VALUES
(1, 1, 1, '2023-10-01', 15, 3, 0.0),
(2, 2, 2, '2023-10-02', 10, 3, 0.0),
(3, 3, 1, '2023-10-03', 12, 4, 0.0),
(4, 4, 1, '2023-10-04', 8, 3, 40.0),
(5, 5, 2, '2023-10-05', 60, 2, 0.0),
(6, 5, 3, '2023-10-06', 20, 3, 0.0),
(7, 2, 3, '2023-10-06', 10, 3, 70.0),
(8, 1, 4, '2023-10-07', 5, 4, 120.0),
(9, 2, 4, '2023-10-07', 12, 3, 220.0),
(10, 3, 1, '2023-10-08', 15, 3, 0.0),
(11, 3, 1, '2023-10-09', 12, 4, 0.0),
(12, 4, 1, '2023-10-10', 8, 3, 45.0);

-- End of mock_data.sql