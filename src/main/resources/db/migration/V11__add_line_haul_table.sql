CREATE TABLE line_haul (
    line_haul_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    truck_name VARCHAR(255),
    truck_description VARCHAR(255),
    truck_length VARCHAR(255),
    truck_type VARCHAR(255),
    power varchar(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
   
)