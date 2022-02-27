package publisher_chemestry_paper;

import java.util.HashMap;

public class ServicePublisherImpl implements ChemestryPaperPublisher{
	
	HashMap<String, Double> paper_2021 = new HashMap<String, Double>();
	HashMap<String, Double> paper_2020 = new HashMap<String, Double>();
	HashMap<String, Double> paper_2019 = new HashMap<String, Double>();
	HashMap<String, Double> paper_2018 = new HashMap<String, Double>();
	
	public ServicePublisherImpl() {
		
		paper_2021.put("Central Province", 10.0);
		paper_2021.put("Northern Province", 12.0);
		paper_2021.put("Western Province", 10.0);
		paper_2021.put("Eastern Province", 13.0);
		
		paper_2020.put("Central Province", 10.0);
		paper_2020.put("Northern Province", 12.0);
		paper_2020.put("Western Province", 10.0);
		paper_2020.put("Eastern Province", 13.0);

		paper_2019.put("Central Province", 10.0);
		paper_2019.put("Northern Province", 12.0);
		paper_2019.put("Western Province", 10.0);
		paper_2019.put("Eastern Province", 13.0);
		
		paper_2018.put("Central Province", 10.0);
		paper_2018.put("Northern Province", 12.0);
		paper_2018.put("Western Province", 10.0);
		paper_2018.put("Eastern Province", 13.0);
		
	}

	@Override
	public void displayChemestryPaper(int a) {
		// TODO Auto-generated method stub
		int count ;
		switch (a) {
		case 1:
			count = 1 ;
			for(String name1 : paper_2019.keySet()) {
				String key1 = name1.toString();
				String value1 = paper_2019.get(name1).toString();
				System.out.println(count + ". " + key1 + " :- $" +value1);
				count++;
			};
			break;
		case 2:
			count = 1 ;
			for(String name2 : paper_2020.keySet()) {
				String key2 = name2.toString();
				String value2 = paper_2020.get(name2).toString();
				System.out.println(count + ". " + key2 + " :- $" +value2);
				count++;
			};
			break;
			
		case 3: 
			count = 1 ;
			for(String name3 : paper_2021.keySet()) {
				String key3 = name3.toString();
				String value3 = paper_2021.get(name3).toString();
				System.out.println(count + ". " + key3 + " :- $" +value3);
				count++;
			};
			break;
			
		case 4:
			count = 1 ;
			for(String name4 : paper_2018.keySet()) {
				String key4 = name4.toString();
				String value4 = paper_2018.get(name4).toString();
				System.out.println(count + ". " + key4 + " :- $" +value4);
				count++;
			};
			break;
		}
	}

	@Override
	public double getPrice(int year, int ens) {
		// TODO Auto-generated method stub
		double price = 0; 
		if(year == 1) {
			switch (ens) {
			case 1:
				price = paper_2019.get("Central Province");
				break;
			case 2:
				price = paper_2019.get("Northen Province");
				break;
			case 3:
				price = paper_2019.get("Western Province");
				break;
			case 4:
				price = paper_2019.get("Easten Province");
				break;
			}
		}else if(year == 2) {
			switch (ens) {
			case 1:
				price = paper_2020.get("Central Province");
				break;
			case 2:
				price = paper_2020.get("Northen Province");
				break;
			case 3:
				price = paper_2020.get("Western Province");
				break;
			case 4:
				price = paper_2020.get("Easten Province");
				break;
			}
			
		}else if(year == 3) {
			switch (ens) {
			case 1:
				price = paper_2021.get("Central Province");
				break;
			case 2:
				price = paper_2021.get("Northen Province");
				break;
			case 3:
				price = paper_2021.get("Western Province");
				break;
			case 4:
				price = paper_2021.get("Easten Province");
				break;
			}
			
		}else if(year == 4) {
			switch (ens) {
			case 1:
				price = paper_2018.get("Central Province");
				break;
			case 2:
				price = paper_2018.get("Northen Province");
				break;
			case 3:
				price = paper_2018.get("Western Province");
				break;
			case 4:
				price = paper_2018.get("Easten Province");
				break;
			}	
		}
		return price;
	}
	
	@Override
	public String getName(int year, int ens) {
		// TODO Auto-generated method stub
		String name = ""; 
		if(year == 1) {
			switch (ens) {
			case 1:
				name = "Central Province";
				break;
			case 2:
				name = "Northen Province";
				break;
			case 3:
				name = "Western Province";
				break;
			case 4:
				name = "Easten Province";
				break;
			}
		}else if(year == 2) {
			switch (ens) {
			case 1:
				name = "Central Province";
				break;
			case 2:
				name = "Northen Province";
				break;
			case 3:
				name = "Western Province";
				break;
			case 4:
				name = "Easten Province";
				break;
			}
			
		}else if(year == 3) {
			switch (ens) {
			case 1:
				name = "Central Province";
				break;
			case 2:
				name = "Northen Province";
				break;
			case 3:
				name = "Western Province";
				break;
			case 4:
				name = "Easten Province";
				break;
			}
			
		}else if(year == 4) {
			switch (ens) {
			case 1:
				name = "Central Province";
				break;
			case 2:
				name = "Northen Province";
				break;
			case 3:
				name = "Western Province";
				break;
			case 4:
				name = "Easten Province";
				break;
			}	
		}
		return name;	
	}

}
