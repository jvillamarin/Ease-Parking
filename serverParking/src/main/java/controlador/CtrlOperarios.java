
package controlador;

import DAO.DAOoperarios;
import TO.TOoperarios;
import java.util.ArrayList;


public class CtrlOperarios {
    DAOoperarios operariosDAO;
     CtrlOperarios operariosCtrl;

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
    public boolean eliminarOperarios(TOoperarios operario){        
       
        return operariosDAO.eliminarOperarios(operario.getIdOperarios());    
        
    }    
    public TOoperarios verificarUsuario(String operario, String password){  
        return operariosDAO.verificarUsuario(operario, password);
    }
    
}
