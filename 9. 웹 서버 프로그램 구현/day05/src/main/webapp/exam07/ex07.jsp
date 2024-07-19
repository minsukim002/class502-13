<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<fmt:bundle basename="messages.commons">
    <form>
    <fmt:message key="이메일" />
    <input type="text" name="email"><br>

    <fmt:message key="비밀번호" />
        <input type="password" name="PASSWORD"><br>
        <button type="submit">
            <fmt:message key="LOGIN" />
        </button>
    </form>

</fmt:bundle>