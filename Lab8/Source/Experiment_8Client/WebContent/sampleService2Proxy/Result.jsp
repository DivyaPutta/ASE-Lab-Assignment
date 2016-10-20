<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleService2Proxyid" scope="session" class="com.visualstudio.DivyaPutta.experiment8.Service2Proxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleService2Proxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleService2Proxyid.getEndpoint();
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
        sampleService2Proxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.visualstudio.DivyaPutta.experiment8.Service2 getService210mtemp = sampleService2Proxyid.getService2();
if(getService210mtemp == null){
%>
<%=getService210mtemp %>
<%
}else{
        if(getService210mtemp!= null){
        String tempreturnp11 = getService210mtemp.toString();
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
        java.lang.String helloName13mtemp = sampleService2Proxyid.helloName(enter_your_name_1idTemp);
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