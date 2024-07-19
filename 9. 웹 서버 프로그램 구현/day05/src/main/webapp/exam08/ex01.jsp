<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<c:set var="str" value="Apple,Melon,Orange,Grape" />
<c:set var="fruit" value="${fn:split(str, ',')}" />
str : ${str}<br>
fruits : ${fruit}<br>


<c:forEach var="fruit" items="${fruit}">
    ${fruit}<br>
</c:forEach>