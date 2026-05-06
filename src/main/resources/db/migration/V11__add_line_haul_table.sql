CREATE TABLE line_haul (
    line_haul_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    trip_status_id BIGINT,
    user_id BIGINT,
    truck_name VARCHAR(255),
    truck_description VARCHAR(255),
    truck_length VARCHAR(255),
    truck_type VARCHAR(255),
    power varchar(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (trip_status_id) REFERENCES trip_status(trip_status_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id) 
)