import { Fragment } from 'react';

const App = () => {
  const name = 'React';

    

  return (
    <> 
     {/* 주석 ....*/}
      <div>첫번째 컴포넌트!</div>
      <div>신나는, {name && name} 공부</div>
      {name === 'React' && <h1>아 재밌다.</h1>}
      <input type="text" />
    </>
  );
};

export default App;
