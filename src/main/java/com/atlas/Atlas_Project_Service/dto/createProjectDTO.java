package com.atlas.Atlas_Project_Service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record createProjectDTO (@JsonProperty("nome") String nome,
                                @JsonProperty("objetivo") String objetivo,
                               @JsonProperty("dataInicio") String dataInicio,
                               @JsonProperty("escopo") String escopo,
                              @JsonProperty("publicoAlvo")  String publicoAlvo) {
}
