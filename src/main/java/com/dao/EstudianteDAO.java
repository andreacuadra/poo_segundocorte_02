package com.dao;

import com.interfaces.Operacion;
import com.models.Estudiante;

import java.util.ArrayList;

public class EstudianteDAO implements Operacion {
     private ArrayList<Estudiante> listado = new ArrayList();
    /**
     * Agrega un estudiante
     * @param object
     */
    @Override
    public void create(Object object) {
        try{
            Estudiante estudiante = (Estudiante) object;
            listado.add(estudiante);

        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     *
     * @return
     */

    @Override
    public ArrayList<Object> read() {
        return null;

    }

    public ArrayList<Estudiante> showList() {
        return listado;
    }

    /**
     *
     * @param object
     */

    @Override
    public void update(Object object) {
//Actualizar estudiante
        Estudiante est = (Estudiante) object;
        for (Estudiante estudiante : listado) {
            if(estudiante.getCif().equals(est.getCif())) {
                estudiante.setNombres(est.getNombres());
                estudiante.setApellidos(est.getApellidos());
                estudiante.setEmail(est.getEmail());
                estudiante.setTelefono(est.getTelefono());
                return;
            }
        }
    }

    /**
     *
     * @param id
     */

    @Override
    public void delete(String id) {

        for(Estudiante estudiante : listado) {
            if(estudiante.getCif().equals(id)) {
                listado.remove(estudiante);
                return;
            }
        }

    }


    /**
     *
     * @param value
     * @return
     */
    @Override
    public Object search(String value) {
        for(Estudiante estudiante : listado) {
            if(estudiante.getCif().equals(value)|| estudiante.getNombres().equals(value)) {
                return estudiante;
            }
        }
        return null;
    }


}
