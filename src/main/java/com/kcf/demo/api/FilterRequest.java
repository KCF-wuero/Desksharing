package com.kcf.demo.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterRequest {
    private String collection;
    private String database;
    private String dataSource;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Filter filter;
}
