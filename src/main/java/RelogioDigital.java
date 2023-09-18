public class RelogioDigital {
    int hora;
    int minuto;

    public RelogioDigital(){
        this.hora = 12;
        this.minuto = 20;
    }

    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        this.hora = hora;    
    }

    public int getMinuto(){
        return minuto;
    }

    public void setMinuto(int minuto){
        this.minuto = minuto;
    }

    public void tick(){
        minuto += 1;

        if (minuto == 60){
            minuto = 0;
            hora += 1;
        }
        if (hora == 24){
            hora = 0;
        }
    }

}

