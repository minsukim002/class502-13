<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:forTokens var="pet" items="햄스터 이구아니 소라게" delims="/">
    ${pet}<br>
</c:forTokens>