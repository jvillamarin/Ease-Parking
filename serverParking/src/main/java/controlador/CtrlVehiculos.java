
package controlador;

import DAO.DAOvehiculos;
import TO.TOfacturas;
import TO.TOvehiculos;
import java.util.ArrayList;


public class CtrlVehiculos {
    DAOvehiculos vehiculosDAO;
    CtrlVehiculos vehiculosCtrl;

    public CtrlVehiculos() {
        vehiculosDAO = new DAOvehiculos();
    }
    
    public ArrayList<TOvehiculos> consultarVehiculos(){  
        return vehiculosDAO.consultarVehiculos();
    }
    
    public int insertarVehiculos(TOvehiculos vehiculo){
        vehiculosCtrl = new CtrlVehiculos();
        return vehiculosDAO.insertarVehiculos(vehiculo);
        
    }
    public boolean modificarVehiculos(TOvehiculos vehiculo){
        
        return vehiculosDAO.modificarVehiculos(vehiculo);
        
    }
    public boolean eliminarVehiculos(int id){        
       
        return vehiculosDAO.eliminarVehiculos(id);    
        
    }    
    public TOvehiculos verificarUsuario(String vehiculo, String password){  
        return vehiculosDAO.verificarUsuario(vehiculo, password);
    }

    int insertarVehiculos(TOfacturas factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
