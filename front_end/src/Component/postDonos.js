import React, { useState } from 'react';
import AppAxios from '../api/Axios';

const PostDonos = () => {
  const [nome, setNome] = useState('');
  const [cpf, setCpf] = useState('');
  const [endereco, setEndereco] = useState('');

  const handleFormSubmit = (event) => {
    event.preventDefault();

    const novoDono = {
      nome: nome,
      cpf: cpf,
      endereco: endereco
      
    };

    AppAxios.post('/dono/save', novoDono)
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
          placeholder="Nome do Dono"
        />
        <input
          type="text"
          value={cpf}
          onChange={(e) => setCpf(e.target.value)}
          placeholder="CPF"
        />
        <input
          type="text"
          value={endereco}
          onChange={(e) => setEndereco(e.target.value)}
          placeholder="Endereço"
        />
       

        <button type="submit">Adicionar Dono</button>
      </form>
    </div>
  );
};

export default PostDonos;

