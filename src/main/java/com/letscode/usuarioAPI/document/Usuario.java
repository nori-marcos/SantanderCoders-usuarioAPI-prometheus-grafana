package com.letscode.usuarioAPI.document;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
public class Usuario {
    @Id
    private String id;
    private String name;
    private String email;
    private String telephone;
    private String company;
}
