it('ukazka na login commands.js', () => {
    cy.visit('/')
    cy.login('testuser', 'password123');
    //Klikneme na prihlasenie a prihlasi nas stranka
})