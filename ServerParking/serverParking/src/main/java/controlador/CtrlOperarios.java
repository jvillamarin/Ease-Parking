
package controlador;

import DAO.DAOoperarios;
import TO.TOoperarios;
import java.util.ArrayList;


public class CtrlOperarios {
    DAOoperarios operariosDAO;

    public CtrlOperarios() {
        operariosDAO = new DAOoperarios();
    }
    
    public ArrayList<TOoperarios> consultarOperarios(){  
        return operariosDAO.consultarOperarios();
    }
    
    public int insertarOperarios(TOoperarios operario){
        
        return operariosDAO.insertarOperarios(operario);
        
    }
    public boolean modificarOperarios(TOoperarios operario){
        
        return operariosDAO.modificarOperarios(operario);
        
    }
    public boolean eliminarOperarios(int id){        
       
        return operariosDAO.eliminarOperarios(id);    
        
    }
    
}
