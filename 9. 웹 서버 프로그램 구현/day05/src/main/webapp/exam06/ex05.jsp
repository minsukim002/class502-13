<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="loginUrl" value="/member/login" />

<a href="<c:url value="${loginUrl}" />">로그인</a>

<form method="POST" action="<c:url value="${loginUrl}" /> ">
    이메일 : <input type="text" name="email"><br>
    비밀번호: <input type="password" name="password"><br>
    <button type="submit">로그인</button>

</form>