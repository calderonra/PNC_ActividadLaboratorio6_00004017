package com.capas.uca.labo6.DAO;

import com.capas.uca.labo6.Domain.Estudiante;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface EstudianteDAO {

    public List<Estudiante> findAll() throws DataAccessException;

    public Estudiante findOne(Integer code) throws DataAccessException;

    public void insertEstudiante(Estudiante estudiante) throws DataAccessException;

    public void save(Estudiante estudiante) throws DataAccessException;

    public void delete(Integer codigoEstudiante) throws DataAccessException;

}