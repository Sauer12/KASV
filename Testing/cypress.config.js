// cypres.config.js - hlavny konfiguracny subor pre Cypress
// Tu nastavujeme ako sa bude cypress spravat
// Mozeme tu zmenit predvolene priecinky, nastavit globalne premenne, definovat timeouty atd...
// V cypresse mame 2 typy nastaveni
//- globalne (tykaju sa celeho cypress Frameworku a piseme ich priam odo hlavneho objektu)
//- specificke/e2e (tykaju sa iba e2e testovania, piseme ich dovnutra objektu)


const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    baseUrl: 'https://playground.bondaracademy.com/pages/iot-dashboard',
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
  },
  viewportHeight: 720, 
  viewportWidth: 1280,
});
