package com.overlanwest.app.dto.trailer.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTrailerRequest {

    @NotBlank
    private String length;

    @NotBlank
    private String trailerDesc;

  
    
}
