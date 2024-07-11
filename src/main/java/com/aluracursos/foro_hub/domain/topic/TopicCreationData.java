package com.aluracursos.foro_hub.domain.topic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TopicCreationData(
        @NotBlank
        @Size(min = 0, max = 60)
        String title,

        @NotBlank
        @Size(min = 0, max = 255)
        String message,

        @NotBlank
        @Size(min = 0, max = 50)
        String course
) {
}
