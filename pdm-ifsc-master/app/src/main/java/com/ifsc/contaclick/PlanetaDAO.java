package com.ifsc.contaclick;

import java.util.ArrayList;

public class PlanetaDAO {

    ArrayList<Planeta> planetas;


    public PlanetaDAO() {
        this.planetas = new ArrayList<>();
        String [] nomes = new String[] {"Mercúrio",
                                        "Vênus",
                                        "Marte",
                                        "Terra",
                                        "Saturno",
                                        "Júpiter",
                                        "Urano",
                                        "Netuno"};
        Integer[] imagens = {R.drawable.mercury,
                             R.drawable.venus,
                             R.drawable.mars,
                             R.drawable.earth,
                             R.drawable.saturn,
                             R.drawable.jupter,
                             R.drawable.uranus,
                             R.drawable.neptune};

        for(int i=0; i<nomes.length; i++){
            planetas.add(new Planeta (nomes[i], imagens[i]));

        }
    }

    public ArrayList<Planeta> getPlanetas(){

        return this.planetas;
    }
}
