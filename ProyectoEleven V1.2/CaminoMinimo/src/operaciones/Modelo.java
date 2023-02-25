/*Descripcion:
el boleto vale 60 pesos
Fecha: 31/10/2022
Nombre:*/

package operaciones;

import java.util.ArrayList;
import objetos.Billete;


public class Modelo {
    private ArrayList<Billete> bank;
    private int money;

    public Modelo(ArrayList<Billete> bank) {
        this.bank = bank;
        this.money = 0;
    }
    
    public Modelo(ArrayList<Billete> bank, int money) {
        this.bank = bank;
        this.money = money;
    }

    public Modelo(int money) {
        this.money = money;
    }
    
    public void setChange(int money){
        this.money = money - 60;
    }
    
    public void setChange(){
        this.money -= 60;
    }
    
    public void addToBank(Billete bill){
        bank.add(bill);
    }
    
    public ArrayList<String> entregarDinero() throws IllegalArgumentException{
        int change = money;
        if(change < 0){
            //Si el cambio es negatico, significa que no hay dinero
            //Se busca que arroje una excepcion a partir de eso
            throw new IllegalArgumentException("Pago insuficiente");
        }
        ArrayList<Billete> given = new ArrayList();
        int division;
        int amount;
        int x = 0;
        for (Billete bill : bank) {
            //System.out.println("Billete: $" +bill.getValue() +", hay " +bill.getAmount());
            //System.out.println("cambio: " +change);
            if(change > 0){
                division = Math.floorDiv(change, bill.getValue());
                //System.out.println("division: " +division);
                if(division > bill.getAmount()){
                    amount = bill.getAmount();
                }else{
                    amount = division;
                }
                given.add(new Billete(bill.getValue(), amount));
                //System.out.println(given.get(x).getValue() +", " +given.get(x).getAmount());
                change -= (bill.getValue() * amount);
                x++;
            }
        }//System.out.println(change);
        if(change > 0){
            return null;
        }else{
            ArrayList<String> payOutList = new ArrayList<>();
            //String payOut = "Cambio: \n";
            for(Billete spareChange : given){
                //System.out.println("Para dar--------");
                //System.out.println("Billete: $" +spareChange.getValue() +", hay " +spareChange.getAmount());
                if(spareChange.getAmount() > 0){
                    //System.out.println("True");
                    //payOut += (spareChange.getAmount() +" billetes o monedas de " + spareChange.getValue() +"\n");
                    if(spareChange.getValue() == 100 || spareChange.getValue() == 50 || spareChange.getValue() == 20){
                        if(spareChange.getAmount() == 1){
                            payOutList.add(spareChange.getAmount() +" billete de $" + spareChange.getValue());
                        }else{
                            payOutList.add(spareChange.getAmount() +" billetes de $" + spareChange.getValue());
                        }
                    }else{
                        if(spareChange.getAmount() == 1){
                            payOutList.add(spareChange.getAmount() +" moneda de $" + spareChange.getValue());
                        }else{
                            payOutList.add(spareChange.getAmount() +" monedas de $" + spareChange.getValue());
                        }
                    }
                    
                }
            }
            //payOut += "El cambio total fue de $" + money;
            payOutList.add("$" + money);
            
            return payOutList;
        }
    }
}
