package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorDaoImpl extends Dao implements DoctorDao{

    private String crearSql = "INSERT INTO DOCTOR (CODIGO,NOMBRE,APELLIDO,ESPECIALIDAD) values(?,?,?,?)";
    
    @Override
    public void crearDoctor(Doctor doctor) {
        
        PreparedStatement pst = null;
        try {
            this.conectar();
            pst = this.getConnection().prepareStatement(crearSql);
            pst.setInt(1, doctor.getCodigo());
            pst.setString(2, doctor.getNombre());
            pst.setString(3, doctor.getApellido());
            pst.setString(4, doctor.getEspecialidad());
            
            pst.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            this.cerrarConexion();
            
            
            try {
                if(pst!=null)
                   pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void eliminarDoctor(Doctor doctor) {
        
        if(validarPacientes(doctor)){
        
        }
    }

    @Override
    public void modificarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor buscarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> listarDoctores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean validarPacientes(Doctor doctor) {
    
        return false;
    }
    
    
}
