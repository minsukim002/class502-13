<%@ page contentType="text/html; charset=UtF-8" %>
<% page buffer=“32kb” %>
<%@ page import="java.util.*" %>
<% page import="java.time.LocalDateTime" %>
<% page info="재미있는 JSP 연습!" %>
<%
    List<String> names = new ArrayList<>();
    names.add("이름1");
    names.add("이름2");
    out.write(names.toString());

    LocalDateTime now = LocalDateTime.now();
    out.write("<br>" + now.toString());
%>