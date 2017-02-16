package controller;


import java.util.ArrayList;

import model.Mesa;

public class GestaoMesas {
	
ArrayList<Mesa> mesas;
	
	public GestaoMesas(){
		
		mesas = new ArrayList<>();
		
	}

	public void addMesa(int lugar, boolean fumador){
		int i=0;
		
		Mesa m = new Mesa(mesas.size(),lugar, fumador);
		
		mesas.add(m);
		
		for(int i=0; i<mesas.size(); i++){
			//System.out.println("Nº mesas: " + mesas.size() + "\n");
			System.out.println("Mesa "+ mesas.get(i+1)+ ": "
					+ "\n Lugares: "+ mesas.get(i).getLugares());
			if(mesas.get(i).isFumador() == true){
				System.out.println("Fumador: SIM");
			}else{
				System.out.println("Fumador: NAO");
			}
			
		}
		
		
		
	}

}
