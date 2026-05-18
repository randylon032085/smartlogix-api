CREATE TABLE pod (
    pod_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    pod_number VARCHAR(255) UNIQUE,
    sales_id BIGINT,
    delivery_status_id BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (sales_id) REFERENCES sales(sales_id),
    FOREIGN KEY (delivery_status_id) REFERENCES delivery_status(delivery_status_id)

)