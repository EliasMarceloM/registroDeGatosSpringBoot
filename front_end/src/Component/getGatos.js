import React, { useEffect, useState } from 'react';

import AppAxios from '../api/Axios';




const GetGatos = () => {
  const [gatos, setGatos] = useState([]);

  useEffect(() => {
    
    AppAxios.get('gato/all')
      .then(response => {
        
        setGatos(response.data);
      })
      .catch(error => {
        console.log('Erro ao buscar dados:', error);
      });
  }, []);

  return (
    <div>
      
      <ul>
        {gatos.map(gato => (
          <li key={gato.id}>{gato.nome}: {gato.descricao}</li>
          
        ))}
      </ul>
    </div>
  );
};



export default GetGatos;

