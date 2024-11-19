package es.ieslosmontecillos.AppAgendaBE.service;

import es.ieslosmontecillos.AppAgendaBE.entity.Persona;

import java.util.List;

public interface PersonaService
{
    List<Persona> findAll();
    Persona save(Persona persona);
    Persona findById(Long id);
    void delete(Persona persona);
}