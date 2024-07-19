<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<c:set var="num" value="100" />
<util:linebox color="blue">
    <h1>안녕</h1>
    ${num}<br>
    <c:url value="/member/join"> </c:url>
</util:linebox>

<util:linebox2 color="blue">
    <h1>안녕</h1>
    ${num}<br>
    <c:url value="/member/join"> </c:url>
</util:linebox2>