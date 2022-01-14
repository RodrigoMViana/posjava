package br.com.contact.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String email;
    private String phone;



}
