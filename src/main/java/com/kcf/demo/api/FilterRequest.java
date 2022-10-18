package com.kcf.demo.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterRequest {

    private String collection;
    private String database;
    private String dataSource;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Map<String,Object> filter;

}
