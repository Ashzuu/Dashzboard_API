-- Beginning of mock_data.sql

DELETE FROM workout_exercice WHERE exercice_id>=0;
DELETE FROM workout WHERE id>=0;
DELETE FROM exercice WHERE id>=0;
DELETE FROM userapp WHERE id>=0;

INSERT INTO userapp (id, username, email, password) VALUES
(1, 'evan_dynak', 'accortiogo@gmail.com', 'password123'),
(2, 'john_doe', 'test@test.fr', 'password456');

INSERT INTO exercice (id, name, muscular_group, user_id) VALUES
(1, 'Push-Up', 'Chest', 1),
(2, 'Squat', 'Legs', 1),
(3, 'Pull-Up', 'Back', 2),
(4, 'Deadlift', 'Back', 2);

INSERT INTO workout (id, name, user_id) VALUES
(1, 'Morning Routine', 1),
(2, 'Evening Routine', 2);

INSERT INTO workout_exercice (workout_id, exercice_id, reps, charge, date) VALUES
(1, 1, 15, 0.0, '2023-10-01'),
(1, 2, 20, 0.0, '2023-10-01'),
(2, 3, 10, 0.0, '2023-10-02'),
(2, 4, 5, 100.0, '2023-10-02');

-- End of mock_data.sql