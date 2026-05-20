package com.indivaragroup.house.floor.logic;
import com.indivaragroup.house.floor.dto.CeramicDTO;

public class CeramicCheck {
    public static void checkCeramic(){

        //1. Isi nama keramik = marmer
        //2. buatkan kondisi apabila dari class ceramic name cemaric variable nya adalah marmer
        CeramicDTO ceramic = new CeramicDTO();
        ceramic.setNameCeramic("MARMER");

        if(ceramic.getNameCeramic().equals("MARMER")){
            System.out.println("Ini betul marmer --- " + true);
        }else{
            System.out.println("Ini bukan marmer --- " + false);
        }

        ceramic.setNameCeramic("BATU");
        if(ceramic.getNameCeramic().equals("MARMER")){
            System.out.println("Ini betul marmer --- " + true);
        }else{
            System.out.println("Ini bukan marmer --- " + false);
        }
    }
}