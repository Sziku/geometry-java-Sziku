package com.codecool.geometry.utilities;

public class Util {

    public void printMsg(String msg){
        System.out.println(msg);
    }
    public void printMenu(String[] menuItems){

        for (int i = 0; i < menuItems.length-1; i++) {
            StringBuilder menu = new StringBuilder();
            menu.append("  ")
                    .append(i+1)
                    .append(". ")
                    .append(menuItems[i]);
            printMsg(menu.toString());
        }
        printMsg("  0. "+menuItems[menuItems.length-1]);
    }
}
