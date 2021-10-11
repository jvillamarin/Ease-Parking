
package controlador;

import DAO.DAOplazas;
import TO.TOplazas;
import java.util.ArrayList;


public class CtrlPlazas {
    DAOplazas plazasDAO;
     CtrlPlazas plazasCtrl;

    public CtrlPlazas() {
        plazasDAO = new DAOplazas();
    }
    
    public ArrayList<TOplazas> consultarPlazas(){  
        return plazasDAO.consultarPlazas();
    }
    
    public int insertarPlazas(TOplazas plaza){
//        plazasCtrl = new CtrlOperarios();
        return plazasDAO.insertarPlazas(plaza);
        
    }
    public boolean modificarPlazas(TOplazas plaza){
        
        return plazasDAO.modificarPlazas(plaza);
        
    }
    public boolean eliminarPlazas(TOplazas plaza){        
       
        return plazasDAO.eliminarPlazas(plaza.getIdPlazas());    
        
    }    
    public TOplazas verificarUsuario(String plaza, String password){  
        return plazasDAO.verificarUsuario(plaza, password);
    }
    
}
