
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.dao.ImpDao;
import com.entity.Paciente;
import com.implDao.IPaciente;
import java.io.Serializable;

/**
 *
 * @author Jcmm
 */
public class PacienteServices extends ImpDao<Paciente, Long> implements IPaciente,Serializable{
  
}
