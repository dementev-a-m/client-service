package ru.dementev.clientserver.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Client {
    private Long id;
    private String firstName;
    private String middleName;
}
