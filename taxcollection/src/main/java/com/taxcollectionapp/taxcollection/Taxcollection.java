package com.taxcollectionapp.taxcollection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
//@Table(name="Tax_Dtls")
public class Taxcollection {
	
	@Id
	@GeneratedValue(generator = "taxs", strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="taxs",sequenceName = "taxid",initialValue = 1001,allocationSize = 1000)
	@Column(name="Tax_Id")
	private int taxid;
	
	@Column(name="Tax_Payer_NM")
	private String taxpayernm;
	
	@Column(name="Tax_Type")
	private String taxtype;
	
	@Column(name = "Tax_State")
	private String taxstate;
	
	@Column(name="Tax_Payment_Date")
	private String taxpaymentdate;
	
	@Column(name="Tax_Amt")
	private double taxamt;

	public int getTaxid() {
		return taxid;
	}

	public void setTaxid(int taxid) {
		this.taxid = taxid;
	}

	public String getTaxpayernm() {
		return taxpayernm;
	}

	public void setTaxpayernm(String taxpayernm) {
		this.taxpayernm = taxpayernm;
	}

	public String getTaxtype() {
		return taxtype;
	}

	public void setTaxtype(String taxtype) {
		this.taxtype = taxtype;
	}

	public String getTaxstate() {
		return taxstate;
	}

	public void setTaxstate(String taxstate) {
		this.taxstate = taxstate;
	}

	public String getTaxpaymentdate() {
		return taxpaymentdate;
	}

	public void setTaxpaymentdate(String taxpaymentdate) {
		this.taxpaymentdate = taxpaymentdate;
	}

	public double getTaxamt() {
		return taxamt;
	}

	public void setTaxamt(double taxamt) {
		this.taxamt = taxamt;
	}

	
	
	
	
}
