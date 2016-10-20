<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleExp8Service1Proxyid" scope="session" class="com.visualstudio.DivyaPutta.experiment8.Exp8Service1Proxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleExp8Service1Proxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleExp8Service1Proxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleExp8Service1Proxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.visualstudio.DivyaPutta.experiment8.Exp8Service1 getExp8Service110mtemp = sampleExp8Service1Proxyid.getExp8Service1();
if(getExp8Service110mtemp == null){
%>
<%=getExp8Service110mtemp %>
<%
}else{
        if(getExp8Service110mtemp!= null){
        String tempreturnp11 = getExp8Service110mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String enter_your_name_1id=  request.getParameter("enter_your_name16");
            java.lang.String enter_your_name_1idTemp = null;
        if(!enter_your_name_1id.equals("")){
         enter_your_name_1idTemp  = enter_your_name_1id;
        }
        java.lang.String helloName13mtemp = sampleExp8Service1Proxyid.helloName(enter_your_name_1idTemp);
if(helloName13mtemp == null){
%>
<%=helloName13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(helloName13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>