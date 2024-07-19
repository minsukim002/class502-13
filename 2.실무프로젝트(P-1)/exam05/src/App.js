import { Routes, Route } from 'react-router-dom';

import Home from './pages/Home';
import About from './pages/About';
import Board from './pages/Board';
import BoardList from './pages/Board';
import MainLayout from './layouts/MainLayout';
import notFound from './pages/notFound';
import NotFound from './pages/notFound';

const App = () => {
  return (
    <Routes>
      <Routes path="/" element={<MainLayout />}>
      </Routes>



    <Route path='*' element={<NotFound />} />
    </Routes>
  );
};

export default App;
