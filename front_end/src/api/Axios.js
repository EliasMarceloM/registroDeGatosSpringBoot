

import axios from 'axios';

const AppAxios = axios.create({
  baseURL: 'http://localhost:8080',
});

export default AppAxios;
 

