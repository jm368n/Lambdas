package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.util.List;

public interface DoctorDao {
    
    public void crearDoctor(Doctor doctor);
    public void eliminarDoctor(Doctor doctor);
    public void modificarDoctor(Doctor doctor);
    public Doctor buscarDoctor(Doctor doctor);
    public List<Doctor> listarDoctores();
    
}
