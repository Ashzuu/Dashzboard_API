DROP SCHEMA data CASCADE;
CREATE SCHEMA data;

create table if not exists "user"
(
    id       integer      not null
        constraint userapp_pkey
            primary key,
    username varchar(50)  not null
        constraint userapp_username_key
            unique,
    email    varchar(100) not null
        constraint userapp_email_key
            unique,
    password varchar(255) not null
);

create table if not exists muscular_group
(
    id             integer      not null
        constraint muscular_group_pkey
            primary key,
    name            varchar(100) not null
);

create table if not exists muscles
(
    id                  integer not null
                            primary key,
    name_fr             varchar(100) not null,
    name_en             varchar(100) not null,
    muscular_group_id   integer not null
                            references muscular_group
                            on delete cascade
);

create table if not exists exercise
(
    id             integer      not null
        constraint exercice_pkey
            primary key,
    name           varchar(100) not null,
    user_id        integer
        constraint exercice_user_id_fkey
            references "user"
            on delete cascade
);

create table if not exists exercise_muscular_group
(
    id_exercise         integer not null
        constraint fkey_exercise_in_emg
            references exercise
            on delete set null,
    id_muscular_group   integer not null
        constraint fkey_muscular_group_in_emg
            references muscular_group
            on delete set null,
    constraint pkey_exercise_muscular_group
        PRIMARY KEY (id_exercise, id_muscular_group)
);

create table if not exists workout
(
    id      integer      not null
        primary key,
    name    varchar(100) not null,
    user_id integer      not null
        references "user"
            on delete cascade
);

create table if not exists workout_exercise
(
    workout_id  integer not null
        constraint workout_exercice_workout_id_fkey
            references workout
            on delete cascade,
    exercise_id integer not null
        constraint workout_exercice_exercice_id_fkey
            references exercise
            on delete cascade,
    constraint workout_exercice_pkey
        primary key (workout_id, exercise_id)
);

create table if not exists training
(
    id           integer not null
        primary key,
    workout_id   integer not null
        references workout
            on delete cascade,
    user_id      integer not null
        references "user"
            on delete cascade,
    session_date date    not null
);

create table if not exists training_session
(
    id          integer          not null
        primary key,
    exercise_id integer          not null
        references exercise
            on delete cascade,
    training_id integer          not null
        references training
            on delete cascade,
    reps        integer          not null,
    weight      double precision not null
);
