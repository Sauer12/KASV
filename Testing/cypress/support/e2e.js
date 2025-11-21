//Je to prvy subor ktory cypress nacita pred spustenim kazdeho testu
//Idealne miesto pre globalnu konfiguraciu alebo importy
//Napr. ak chceme aby sa nieco vykonalo pred kazdym testom - napr. vycistenie cookies.
//Standardne sa sem importuju suboery z commands



// ***********************************************************
// This example support/e2e.js is processed and
// loaded automatically before your test files.
//
// This is a great place to put global configuration and
// behavior that modifies Cypress.
//
// You can change the location of this file or turn off
// automatically serving support files with the
// 'supportFile' configuration option.
//
// You can read more here:
// https://on.cypress.io/configuration
// ***********************************************************

// Import commands.js using ES2015 syntax:
import './commands'