/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package org.uv.BDNC_Practica03;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositoryPersona extends MongoRepository<Persona, String> {
    
}
