<%-- 
    Document   : oerariosControlador
    Created on : 22/09/2021, 3:24:23 p. m.
    Author     : johnv
--%>

<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="TO.TOoperarios"%>
<%@page import="controlador.CtrlOperarios"%>
<%CtrlOperarios operariosCtrl = new CtrlOperarios();
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOoperarios> operarios = operariosCtrl.consultarOperarios();
    out.print(new Gson().toJson(operarios));
}else if("login".equals(opcion)){    
    String datos = request.getParameter("data");
    TOoperarios operario = new Gson().fromJson(datos, TOoperarios.class);
    operario = operariosCtrl.verificarUsuario(operario.getUsername(), operario.getPassword());
    out.print(new Gson().toJson(operario));
}else if("insertar".equals(opcion)){
    String datos = request.getParameter("data");
    TOoperarios operarioTo = new Gson().fromJson(datos,TOoperarios.class);
    operariosCtrl.insertarOperarios(operarioTo);
}
else if("actualizar".equals(opcion)){
    String datos = request.getParameter("data");
    TOoperarios operarioTo = new Gson().fromJson(datos,TOoperarios.class);
    operariosCtrl.modificarOperarios(operarioTo);
}
else if("eliminar".equals(opcion)){
    String datos = request.getParameter("data");
    TOoperarios operarioTo = new Gson().fromJson(datos,TOoperarios.class);
    operariosCtrl.eliminarOperarios(operarioTo);
}
else{
    out.print("Opcion no valida");
}
%>
