import React, { useState, useEffect } from 'react';
import AppAxios from '../api/Axios';

const GetGatosPorId = () => {
  const [gatos, setGatos] = useState([]);
  const [gatoId, setGatoId] = useState('');

  useEffect(() => {
    if (gatoId) { 
      AppAxios.get(`gato/${gatoId}`)
        .then(response => {
          setGatos([response.data]); 
        })
        .catch(error => {
          console.log('Erro ao buscar dados:', error);
        });
    }
  }, [gatoId]); 

  const handleFormSubmit = (event) => {
    event.preventDefault();
    
  }

  return (
    <div>
      <form onSubmit={handleFormSubmit}>
        <input
          type="text"
          value={gatoId}
          onChange={(e) => setGatoId(e.target.value)}
          placeholder="ID do Gato a ser buscado"
        />
        <button type="submit">Buscar Gato</button>
      </form>
      <ul>
        {gatos.map(gato => (
          <li key={gato.id}>{gato.nome}: {gato.descricao}</li>
        ))}
      </ul>
    </div>
  );
};

export default GetGatosPorId;

