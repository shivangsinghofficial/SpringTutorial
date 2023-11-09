package com.shivangSingh.SpringBootTutorial.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private String id;
    private String teamId;
    private String name;
    private String phoneNumber;
}
