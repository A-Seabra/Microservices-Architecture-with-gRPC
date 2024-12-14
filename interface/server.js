const express = require('express');
const axios = require('axios');
const path = require('path');

const app = express();
const port = 3000;

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
  });

// Serve static files from the 'interface' directory
app.use(express.static(path.join(__dirname, 'interface')));
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

const apiUrl = 'http://api-script:8000'; 

app.post('/predict-demand', async (req, res) => {
    try {
        const { itemID, currentStock, reorderLevel } = req.body;
        const response = await axios.post(`${apiUrl}/predict-demand/`, {
            itemID,
            currentStock,
            reorderLevel
        });
        res.json(response.data);
    } catch (error) {
        res.status(500).json({ error: error.message });
    }
});

app.post('/optimize-inventory', async (req, res) => {
    try {
        const { itemID, currentStock, predictedDemand, reorderLevel } = req.body;
        const response = await axios.post(`${apiUrl}/optimize-inventory/`, {
            itemID,
            currentStock,
            predictedDemand,
            reorderLevel
        });
        res.json(response.data);
    } catch (error) {
        res.status(500).json({ error: error.message });
    }
});

app.post('/predict-optimization-demand', async (req, res) => {
    try {
        const { itemID, currentStock, reorderLevel } = req.body;
        const response = await axios.post(`${apiUrl}/predict-optimization-demand/`, {
            itemID,
            currentStock,
            reorderLevel
        });
        res.json(response.data);
    } catch (error) {
        res.status(500).json({ error: error.message });
    }
});

app.listen(port, () => {
    console.log(`Node.js server listening at http://localhost:${port}`);
});
