public class Jogo {
    String time1, time2, vencedor;
    int gol1, gol2;

    Jogo(String time1, int gol1, String time2, int gol2){

        this.time1 = time1;
        this.gol1 = gol1;
        this.time2 = time2;
        this.gol2 = gol2;

    }

    String vencedor(){

        if(gol1 > gol2){
            vencedor = time1;
            return vencedor;
        }
        else if(gol1 < gol2){
            vencedor = time2;
            return vencedor;
        } else{
            return vencedor;
        }
    }

    int gols(String time){
        if(time.equals(time1)){
            return gol1;
        } else{
            return gol2;
        }

    }

   void resultado(){
        System.out.println(time1 + " " + gol1 + " X " + time2 + " " + gol2);
   }
}
