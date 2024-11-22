package estudo.interfaces.atividadeContrato.service;

import java.time.LocalDate;

import estudo.interfaces.atividadeContrato.entities.Contract;
import estudo.interfaces.atividadeContrato.entities.Installment;

public class ContractService {
	
		private OnlinePaymentService onlinePaymentService;
	
	    public ContractService(OnlinePaymentService onlinePaymentService) {
			super();
			this.onlinePaymentService = onlinePaymentService;
	    }
		//installment = parcela
		public void processContract(Contract contract, int months) {
			PaypalService payPal = new PaypalService();
			double installmentValue = contract.getTotalValue() / months;
			for(int i = 1; i <= months; i++) {
				LocalDate data = contract.getDate().plusMonths(i);
				
				double installment  = payPal.interest(installmentValue, i);
				
				installment  = payPal.paymentFee(installment);
				
				Installment inst = new Installment(data, installment);

				contract.addInstallment(inst);

			}
		}

}

