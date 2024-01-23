import React, { useState } from 'react';
import AppAxios from '../api/Axios';

const DeleteGato = () => {
  const [gatoId, setGatoId] = useState('');

  const handleFormSubmit = (event) => {
    event.preventDefault();

    
    AppAxios.delete(`/gato/delete/${gatoId}`)
      .then(response => {
        console.log('Gato deletado com sucesso!');
        
      })
      .catch(error => {
        console.log('Erro ao deletar gato:', error);
      });
  };

  return (
    <div>
      <form onSubmit={handleFormSubmit}>
        <input
          type="text"
          value={gatoId}
          onChange={(e) => setGatoId(e.target.value)}
          placeholder="ID do Gato a ser deletado"
        />
        <button type="submit">Deletar Gato</button>
      </form>
    </div>
  );
};

export default DeleteGato;
