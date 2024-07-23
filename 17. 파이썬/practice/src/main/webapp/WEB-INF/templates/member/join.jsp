<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:url var="actionUrl" value="/member/join"/>
<h1>
    회원가입
</h1>
<form:form method="post" action="${actionUrl}" autocomplete="off" modelAttribute="requestJoin">
    <dl>
        <dt><spring:message code="이메일"/></dt>
        <dd>
            <form:input path="email"/>
            <form:errors path="email" element="div" delimiter=""/>
        </dd>
    </dl>
    <dl>
        <dt><spring:message code="비밀번호"/></dt>
        <dd>
            <form:password path="password"/>
            <form:errors path="password" element="div"/>
        </dd>
    </dl>
    <dl>
        <dt><spring:message code="비밀번호_확인"/></dt>
        <dd><form:password path="confirmPassword"/>
            <form:errors path="confirmPassword" element="div"/>
        </dd>
    </dl>
    <dl>
        <dt><spring:message code="회원명"/></dt>
        <dd><form:input path="userName"/>
            <form:errors path="userName" element="div"/></dd>
    </dl>
    <dl>
        <spring:message code="약관동의"/>
        <dd>
            <form:checkbox path="agree" value="true" label="약관에 동의합니다"/>
            <form:errors path="agree" element="div"/>
        </dd>
    </dl>
    <button type="submit">
        <spring:message code="가입하기"/>
    </button>
</form:form>
