import React from "react";
// import logo from './logo.svg';
import "./App.css";
import Home from "./components/home/home";
import TTAAL from "./components/ttaal/ttaal";
// import { Route, Switch } from 'react-router-dom';
import Landing from "./components/landing/landing";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";

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
      </Routes>
    </div>
  );
}

export default App;
