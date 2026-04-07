CREATE TABLE audit_logs(
    audit_log_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    role_id BIGINT,
    method VARCHAR(10),
    end_point VARCHAR(255),
    ip_address VARCHAR(45),
    status_code varchar(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (role_id) REFERENCES roles(role_id)
)