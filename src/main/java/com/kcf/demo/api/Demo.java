package com.kcf.demo.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo
    {
       private String collection;
       private String database ;
       private String dataSource;
       private String document;
    };

