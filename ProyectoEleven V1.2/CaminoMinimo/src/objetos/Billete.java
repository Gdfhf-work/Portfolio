/*Descripcion:
Fecha: 31/10/2022
Nombre:*/

package objetos;

public class Billete {
    private int value;
    private int amount;

    public Billete(int value, int amount){
        this.value = value;
        this.amount = amount;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
