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
}else{
    out.print("Opcion no valida");
}
%>
