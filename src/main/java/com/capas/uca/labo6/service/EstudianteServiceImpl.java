package com.capas.uca.labo6.service;

import com.capas.uca.labo6.DAO.EstudianteDAO;
import com.capas.uca.labo6.Domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    EstudianteDAO estudianteDAO;

    @Override
    public List<Estudiante> findAll() throws DataAccessException {
        return estudianteDAO.findAll();
    }

    @Override
    public Estudiante findOne(Integer code) throws DataAccessException {
        return estudianteDAO.findOne(code);
    }

    @Override
    public void save(Estudiante estudiante) throws DataAccessException {
        estudianteDAO.save(estudiante);
    }

    @Override
    public void delete(Integer codigoEstudiante) throws DataAccessException {
        estudianteDAO.delete(codigoEstudiante);
    }
}
