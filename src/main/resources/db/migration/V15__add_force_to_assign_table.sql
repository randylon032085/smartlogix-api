CREATE TABLE force_to_assign (
    force_to_assign_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    manifest_id BIGINT,
    from_driver_id BIGINT,
    to_driver_id BIGINT,
    reason VARCHAR(255),
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (manifest_id) REFERENCES manifest(manifest_id),
    FOREIGN KEY (from_driver_id) REFERENCES users(user_id),
    FOREIGN KEY (to_driver_id) REFERENCES users(user_id)
    

)