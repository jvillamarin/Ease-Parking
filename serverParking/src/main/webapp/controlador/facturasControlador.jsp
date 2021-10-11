<%-- 
    Document   : oerariosControlador
    Created on : 22/09/2021, 3:24:23 p. m.
    Author     : johnv
--%>

<%@page import="controlador.CtrlPlazas"%>
<%@page import="TO.TOplazas"%>
<%@page import="TO.TOvehiculos"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="TO.TOfacturas"%>
<%@page import="controlador.CtrlFacturas"%>
<%CtrlFacturas facturasCtrl = new CtrlFacturas();
CtrlPlazas plazasCtrl = new CtrlPlazas();
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOfacturas> facturas = facturasCtrl.consultarFacturas();
    out.print(new Gson().toJson(facturas));
}else if("insertar".equals(opcion)){
    String datos = request.getParameter("data");
    TOplazas plazaTo = new Gson().fromJson(datos, TOplazas.class);
    TOvehiculos vehiculoTo = new Gson().fromJson(datos, TOvehiculos.class);
    TOfacturas facturaTo = new Gson().fromJson(datos, TOfacturas.class);
    facturasCtrl.insertarFacturas(vehiculoTo, facturaTo, plazaTo);
}
else if("actualizar".equals(opcion)){
    String datos = request.getParameter("data");
    TOvehiculos vehiculoTo = new Gson().fromJson(datos, TOvehiculos.class);
    TOfacturas facturaTo = new Gson().fromJson(datos, TOfacturas.class);
    facturasCtrl.modificarFacturas(vehiculoTo, facturaTo);
}
else if("eliminar".equals(opcion)){
    String datos = request.getParameter("data");    
    TOfacturas facturaTo = new Gson().fromJson(datos, TOfacturas.class);
    TOplazas plazaTo = new Gson().fromJson(datos, TOplazas.class);
    facturasCtrl.eliminarFacturas(facturaTo);
    plazasCtrl.eliminarPlazas(plazaTo);
    
}
else{
    out.print("Opcion no valida");
}
%>
