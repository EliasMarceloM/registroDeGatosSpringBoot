import React, { useState } from 'react';
import AppAxios from '../api/Axios';

const PostGatos = () => {
  const [nome, setNome] = useState('');
  const [descricao, setDescricao] = useState('');
  

  const handleFormSubmit = (event) => {
    event.preventDefault();

    const novoGato = {
      nome: nome,
      descricao: descricao
     
  
    };

    AppAxios.post('/gato/save', novoGato)
      .then(response => {
        
        console.log('result data: ' + JSON.stringify(response.data));
        
      })
      .catch(error => {
        console.log('Erro ao adicionar novo dono:', error);
        
      });
  };

  return (
    <div>
      <form onSubmit={handleFormSubmit}>
        <input
          type="text"
          value={nome}
          onChange={(e) => setNome(e.target.value)}
          placeholder="Nome do Gato"
        />
        <input
          type="text"
          value={descricao}
          onChange={(e) => setDescricao(e.target.value)}
          placeholder="Descrição "
        />
     
       

        <button type="submit">Adicionar Gato</button>
      </form>
    </div>
  );
};

export default PostGatos;

