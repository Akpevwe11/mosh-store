CREATE TABLE profiles
(
    id             BIGINT AUTO_INCREMENT PRIMARY KEY,
    bio            TEXT,
    phone_number   VARCHAR(20),
    date_of_birth  DATE,
    loyalty_points INT UNSIGNED DEFAULT 0,
    FOREIGN KEY (id) REFERENCES users (id)
);