<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie[] cookie = request.getCookies();
    for(Cookie cookie : cookie) {
        String name = cookie.getName();
        String value = cookie.getValue();
        System.out.println(name + value);
    }
%>