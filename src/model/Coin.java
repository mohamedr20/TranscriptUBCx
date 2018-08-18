package model;

public class Coin {

    private String coinSide = "tails";

    public String flip(String coinSide){
       if(coinSide == "tails"){
           return "heads";
       }
       else{
           return "tails";
       }
    }

    public String checkStatus(Coin c){
        return c.coinSide;
    }

}
