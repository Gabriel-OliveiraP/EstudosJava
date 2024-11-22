package estudo.polimorfism;

public class UpcastDowncast {
	public static void main(String[] args) {
		
		Account ac = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		/* Aqui estamos fazendo um UPCASTING, instanciando um objeto
		 * da SubClasse na SuperClassee, e como a subClasse É UMA 
		 * Account, não dá erro
		 */
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		/* Vai instanciar um objeto da SuperClasse(acc2) na
		 * Subclasse(acc4), e como a conversão não é natural
		 * usamos o Casting manual com o (tipoDaSubClasse)acc2;
		 */
		
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		/* Vai dar errado, pois não podemos instanciar uma SubClasse
		 * em outra SubClasse.
		 */
		if ( acc3 instanceof BusinessAccount) {
		/* o if faz um teste se a variavel acc3 é uma instancia
		 * de BusinessAccount.
		 */
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
