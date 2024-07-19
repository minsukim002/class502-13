import React from "react"
import { useNavigate } from 'react-router-dom'

const NotFound = () => {
    const navigate = useNavigate();

return(
<>
<h1>페이지를 찾을 수 없습니다.</h1>
<button 쇼ㅔㄷ="button" onClick={() => navigate(-1)}>
    이전페이지</button>
    <button type="button" onClick={() => navigate ('/')}>
        
    </button>
</>
)

export default React.memo(NotFound);