describe('Testing Orange HRM application',() =>{
    it('Login app',() =>{
       cy.visit('https://opensource-demo.orangehrmlive.com/')
       cy.get('#txtUsername').type("admin")
       cy.get('#txtPassword').type("admin123")
       cy.get('#btnLogin').click()
       cy.get('#welcome').should('be.visible', {timeout: 10})
     })
    })
