package com.kcf.demo.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentData {

        private String startDate;
        private String endDate;
        private String deskId;
        private String userId;
        private String tableId;
}
