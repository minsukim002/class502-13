<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<layout:main title="게시글 목록">
<h1>게시글 목록</h1>
${items}
<ul>
    <c:forEach var="item" items="${items}">
        <li>${item.subject}</li>
        <li>${item.poster}</li>
        <li>${item.regDt}</li>
        <div>
            index: ${status.index} / count: ${status.count} /
            first: ${status.first} / count: ${status.last}
            current: ${status.current}
        </div>
    </c:forEach>
</ul>
</layout:main>