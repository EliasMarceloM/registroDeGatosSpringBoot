import React, { useEffect, useState } from 'react';

import AppAxios from '../api/Axios';




const GetDonos = () => {
  const [donos, setDonos] = useState([]);

  useEffect(() => {
    
    AppAxios.get('/dono/all')
      .then(response => {
        
        setDonos(response.data);
      })
      .catch(error => {
        console.log('Erro ao buscar dados:', error);
      });
  }, []);

  return (
    <div>
      
      <ul>
        {donos.map(dono => (
          <li key={dono.id}>{dono.nome},{dono.cpf} ,{dono.endereco}</li>
          
        ))}
      </ul>
    </div>
  );
};




export default GetDonos;

