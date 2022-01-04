/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Paciente;
import com.services.PacienteServices;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author JuanDavid
 */
@ManagedBean
@SessionScoped
public class PacienteController {
    private Paciente paciente = new Paciente();
    PacienteServices pacser = new PacienteServices();
    private List<Paciente>pacientes = new LinkedList();
    

    
    public PacienteController() {
        listar();
    }
    
    public void registrar(){
        pacser.crear(paciente);
        paciente=new Paciente();
        listar();
    }
    
    public void listar(){
        pacientes=pacser.consultarTodo(Paciente.class);
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the pacientes
     */
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    /**
     * @param pacientes the pacientes to set
     */
    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
}
