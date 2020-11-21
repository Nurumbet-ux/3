package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        creatObject("Porter").print();
        creatObject("STEPwgn").print();
        creatObject("TurkishAirlinePlanes").print();
    }

    public static Printable creatObject(String className) {

        if (className == null) {
            return null;
        }
        Printable men = null;
        switch (className) {
            case "Porter":
                men = new Porter("ker", 2016, 35, "China");
                break;
            case "STEPwgn":
                men = new STEPwgn("name", 2011, 5, "s class");
                break;
            case "TurkishAirlinePlanes":
                men = new TurkishAirlinePlanes("mer",2008,34,"business class");
        }
        return men;
    }
}
