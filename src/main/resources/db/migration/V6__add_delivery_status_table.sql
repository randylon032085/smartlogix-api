CREATE TABLE delivery_status(
    delivery_status_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(255),
    photo_proof BLOB,
    delivery_date TIMESTAMP,
    signature BLOB,
    consignee VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP

)