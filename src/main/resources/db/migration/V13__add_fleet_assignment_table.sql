CREATE TABLE fleet_assignment(

    fleet_assignment_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    line_haul_id BIGINT,
    trailer_id BIGINT,
    driver_id BIGINT,
    trip_status_id BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (driver_id) REFERENCES users(user_id),
    FOREIGN KEY (trip_status_id) REFERENCES trip_status(trip_status_id),
    FOREIGN KEY (line_haul_id) REFERENCES line_haul(line_haul_id),
    FOREIGN KEY (trailer_id) REFERENCES trailer(trailer_id)
   
)