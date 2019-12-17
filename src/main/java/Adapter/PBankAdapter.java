/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author artem
 */
class PBankAdapter extends PBank {
	private ABank abank;
	public PBankAdapter(ABank abank) {
		this.abank = abank;
	}
	public int getBalance() {
		return abank.getBalance();
	}
}
