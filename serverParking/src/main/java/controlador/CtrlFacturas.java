
package controlador;

import DAO.DAOfacturas;
import TO.TOfacturas;
import java.util.ArrayList;


public class CtrlFacturas {
    DAOfacturas facturasDAO;

    public CtrlFacturas() {
        facturasDAO = new DAOfacturas();
    }
    
    public ArrayList<TOfacturas> consultarFacturas(){  
        return facturasDAO.consultarFacturas();
    }
    
    public int insertarFacturas(TOfacturas factura){
        
        return facturasDAO.insertarFacturas(factura);
        
    }
    public boolean modificarFacturas(TOfacturas factura){
        
        return facturasDAO.modificarFacturas(factura);
        
    }
    public boolean eliminarFacturas(int id){        
       
        return facturasDAO.eliminarFacturas(id);    
        
    }
    
}
