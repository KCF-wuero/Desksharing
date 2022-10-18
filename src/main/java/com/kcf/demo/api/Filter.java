package com.kcf.demo.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filter
{
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tableId;
}

