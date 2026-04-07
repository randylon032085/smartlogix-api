CREATE TABLE manifest (
    manifest_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    user_id BIGINT,
    line_haul_id BIGINT,
    pod_id BIGINT,
    date DATE,
    time TIME,
    starting_location VARCHAR(255),
    terminal_destination VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (line_haul_id) REFERENCES line_haul(line_haul_id),
    FOREIGN KEY (pod_id) REFERENCES pod(pod_id)
    
)