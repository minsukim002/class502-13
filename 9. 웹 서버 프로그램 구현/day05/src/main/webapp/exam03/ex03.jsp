<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="board.entities.BoardData" %>
<jsp:useBean id="item" class="board.entities.BoardData" scope="request"/>
<jsp:setProperty name="item" property="subject"  />
<jsp:setProperty name="item" property="content" />
<jsp:setProperty name="item" property="poster" />

<%--
제목: ${item.getSubject()}<br>
--%>


제목: ${item.subject}<br>
내용: ${item.content}<br>
작성자: ${item.poster}<br>
<%--
제목: <jsp:getProperty name="item" property="subject" /><br>
내용: <jsp:getProperty name="item" property="content" /><br>
작성자: <jsp:getProperty name="item" property="poster" /><br>
--%>