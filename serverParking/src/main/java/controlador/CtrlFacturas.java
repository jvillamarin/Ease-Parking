
package controlador;

import DAO.DAOfacturas;
import TO.TOfacturas;
import TO.TOplazas;
import TO.TOvehiculos;
import java.util.ArrayList;


public class CtrlFacturas {
    DAOfacturas facturasDAO;
    CtrlVehiculos vehiculosCtrl;
    CtrlPlazas plazasCtrl;

    public CtrlFacturas() {
        facturasDAO = new DAOfacturas();
    }
    
    public ArrayList<TOfacturas> consultarFacturas(){  
        return facturasDAO.consultarFacturas();
    }
    
    public int insertarFacturas(TOvehiculos vehiculo, TOfacturas factura, TOplazas plaza){
        plazasCtrl = new CtrlPlazas();
        plaza.setTipoPlaza(vehiculo.getTipoVehiculo());
        plaza.setCodigoPlaza(String.valueOf(vehiculo.getIdPlazasVehiculo()));
        plaza.setLibre(0);
        plazasCtrl.insertarPlazas(plaza);
        vehiculosCtrl = new CtrlVehiculos();
        
        factura.setIdVehiculosFacturas(vehiculosCtrl.insertarVehiculos(vehiculo));
        return facturasDAO.insertarFacturas(factura);
        
    }
    public boolean modificarFacturas(TOvehiculos vehiculo, TOfacturas factura){
        vehiculosCtrl = new CtrlVehiculos();
        vehiculo.setIdVehiculos(factura.getIdVehiculosFacturas());
        vehiculosCtrl.modificarVehiculos(vehiculo);
        return facturasDAO.modificarFacturas(factura);
        
    }
    public boolean eliminarFacturas(TOfacturas factura){          
       facturasDAO.eliminarFacturas(factura.getIdFacturas());
       vehiculosCtrl = new CtrlVehiculos();
       return vehiculosCtrl.eliminarVehiculos(factura.getIdVehiculosFacturas());
    }
    
}
