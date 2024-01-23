import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import GetDonos from './Component/getDonos';
import GetGatos from './Component/getGatos';
import PostDonos from './Component/postDonos';
import PostGatos from './Component/postGatos';
import DeleteGato from './Component/deleteGatos';
import GetGatosPorId from './Component/getGatosPorId';


class App extends Component {
  render() {
    return (
      <div className="App">
        <div className="App-header">
          
          <h1>gatos e donos</h1>
        </div>
   
        <div className="rest">
          <div>    
            <h2>get all donos </h2>
            <GetDonos/>
          </div> 
          <div>    
            <h2>get all gatos </h2>
            <GetGatos/>
          </div> 
          <div>    
            <h2>Post donos </h2>
            <PostDonos/>
          </div> 
          <div>    
            <h2>Post gatos </h2>
            <PostGatos/>
          </div> 
          <div>    
            <h2>deletar gatos </h2>
            <DeleteGato/>
          </div> 
          <div>    
            <h2>get gatos pelo id </h2>
            <GetGatosPorId/>
          </div> 

         
        </div>

      </div>
    );
  }
}

export default App;
