package com.company.projectwebdriver.utils;

import java.util.Random;

public class Util {

    public static String generateRandomNumber(){
        Integer randomNumber = (new Random()).nextInt(900000) + 100000;  //generar número aleatorio para que sea dinámico ya que el nombre del proyecto y el identificador deben ser únicos
        return ""+randomNumber;
    }
}