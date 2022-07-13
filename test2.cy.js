describe('Cypress Test', () => {
    it('Google Search', () => {
      // Visit Google
      cy.visit('https://www.google.com/')
  
      // Get Search Bar and enter the search keyword
      cy.get('input[name="q"]').type('Cypress');
  
      // Submit the Search
      cy.get('input[value="Google Search"]').first().click();
  
      // Get Search Results
      cy.url().then(url => {
        const getUrl = url
        cy.log('Results URL: '+getUrl)
      })
    })
  })