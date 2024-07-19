class CountryRunner
{
	public static void main(String[] country)
	{
		String[] stateList={"Karnataka","Maharashtra","Bihar","Arunachal Pradesh","Assam","Manipur","Gujarat","Hariyan","Himachal Pradesh","Chhathisghar",
		"Kerala","Rajasthan","Punjab","Madhya Pradesh","Nagaland","Odisha","Tamil Nadu","Andra Pradesh","Mizoram","Goa","Jharkhand","West Bengal",
		"Uttar Pradesh","Telangana","Meghalaya","Sikkim","Delhi","UttarKhand","Tripura"};
		Country.state(stateList);
		
		int[] pinCode={562106,560050,560103,560050,560053,560013,560078,560023,560003,560032};
		Country.pincode(pinCode);
		
		
		String[] primeMinister={"jawaharlal Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Gulzarilal Nanda","Indira Gandhi","Morarji Desai",
		"Charan Singh","Indira Gandhi","Rajiv Gandhi","V.P.Singh","Chandra Shekhar","P.V.Narasimha Rao","Atal bihari vajpayee","H.D.Devegowda",
		"Inder kumar Gujral","Atal bihari vajpayee","Manmohan Singh","Narendra Modi"};
		Country.primeminister(primeMinister);
		
		String[] cabinetStars={"shri rajnath singh","shri amit shah","shri nitin jairam gadkari","smt. Nirmala sitharaman","shri shivraj singh chouhan",
		"Dr. subrahmanyam jaishankar","shri jagatprakash nadda","shri manohar lal","shri H.D.kumaraswamy","shri rajnath singh","shri dharmendra pradhan",
		"shri jitan ram manjhi","shri rajiv ranjan singh","shri sarbananda sonowal","Dr. virendra kumar","shri kinjarapurammohan naidu","shri pralhad joshi",
		"shri jual oram","shri giriraj singh","shri ashwini vaishnaw","shri jyotiraditya M.scindia","shri bhupendra yadav","shri gajendra singh shekhawat",
		"smt. Annpurna devi","shri kiren rijiju","shri hardeep singh puri","Dr. mansukh mandaviya","shri G.kishan reddy","shri chirag paswan","shri C R patil"};
		Country.cabinetMinister(cabinetStars);
		
		String[] parties={"AamAadmi","Bahujan Samaj","Bharatiya Janata","Indian National Congress","National People's Party"};
		Country.politicalParties(parties);
	}

} 
