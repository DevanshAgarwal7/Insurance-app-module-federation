const fs = require('fs');
const fetch = require('node-fetch'); // Make sure node-fetch is installed
const path = require('path');

(async function fetchData() {
    try {
      const response = await fetch('http://localhost:8080/getConfig');
    if (!response.ok) {
      throw new Error('Failed to fetch data');
    }
    const data = await response.json();
    fs.writeFileSync(path.join(__dirname, 'tempConfig.json'), JSON.stringify(data), 'utf8');
    localStorage.setItem('mfe1', JSON.stringify(data.configurationList[0]));
    localStorage.setItem('mfe2',JSON.stringify(data.configurationList[1]));
    } catch (error) {
      console.error('Error fetching data:', error);
      throw error;
    }
  })()
