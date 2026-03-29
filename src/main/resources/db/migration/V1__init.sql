CREATE TABLE exam (
    id SERIAL PRIMARY KEY,
    initials VARCHAR(255),
    name VARCHAR(255)
);

CREATE TABLE medicine (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255)
);