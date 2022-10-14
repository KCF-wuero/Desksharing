package com.kcf.demo.api;

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
    private Filter filter;
}
