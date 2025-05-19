CREATE TABLE IF NOT EXISTS user (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    number CHAR(6) NOT NULL ,
    name VARCHAR(100) NOT NULL ,
    password VARCHAR(256) NOT NULL ,
    email VARCHAR(100) NOT NULL ,
    role VARCHAR(10) NOT NULL ,
    UNIQUE (number),
    UNIQUE (email),
    CHECK ( role IN ('student', 'teacher'))
);

CREATE TABLE IF NOT EXISTS pc (
    pc_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL ,
    serial_number VARCHAR(100) NOT NULL ,
    status VARCHAR(10) NOT NULL ,
    UNIQUE (serial_number),
    CHECK ( status IN ('available', 'maintenance'))
);

CREATE TABLE IF NOT EXISTS period (
    period_number TINYINT PRIMARY KEY ,
    start_time TIME NOT NULL ,
    end_time TIME NOT NULL
);

CREATE TABLE IF NOT EXISTS reservation (
    reservation_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL ,
    pc_id INT NOT NULL ,
    date DATE NOT NULL ,
    period_number TINYINT NOT NULL ,
    reason VARCHAR(500) NOT NULL ,
    status VARCHAR(20) NOT NULL DEFAULT 'pending_approval',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    approver INT DEFAULT NULL,
    approval_time TIMESTAMP DEFAULT NULL,
    FOREIGN KEY (user_id) REFERENCES user(user_id),
    FOREIGN KEY (pc_id) REFERENCES pc(pc_id),
    FOREIGN KEY (period_number) REFERENCES period(period_number),
    FOREIGN KEY (approver) REFERENCES user(user_id),
    CHECK ( status IN ('pending_approval', 'approval', 'cancelled'))
);

CREATE TABLE IF NOT EXISTS returned (
    returned_id INT PRIMARY KEY AUTO_INCREMENT,
    reservation_id INT NOT NULL ,
    returned_time TIMESTAMP NOT NULL ,
    comment VARCHAR(500),
    FOREIGN KEY (reservation_id) REFERENCES reservation(reservation_id)
);