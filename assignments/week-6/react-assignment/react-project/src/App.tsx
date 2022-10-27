import React from "react";
// import logo from './logo.svg';
import "./App.css";
import Home from "./components/home/home";
import TTAAL from "./components/ttaal/ttaal";
// import { Route, Switch } from 'react-router-dom';
import Landing from "./components/landing/landing";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Truth1 from './components/truth1/truth1';
import Truth2 from './components/truth2/truth2';
import Lie from './components/lie/lie';


function App() {
  return (
    <div className="App">
      <video id="background-video" autoPlay loop muted>
        <source
          src="https://res.cloudinary.com/dzjkwepju/video/upload/v1666890855/for_funsies/Video_cuv745.mp4"
          type="video/mp4"
        ></source>
      </video>
      <Home />
      <Routes>
        <Route path="/ttaal" element={<TTAAL />}></Route>
        <Route path="/" element={<Landing />}></Route>
        <Route path="/truth1" element={<Truth1 />}></Route>
        <Route path="/truth2" element={<Truth2 />}></Route>
        <Route path="/lie" element={<Lie />}></Route>
      </Routes>
    </div>
  );
}

export default App;
