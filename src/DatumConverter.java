import java.util.Date;
import java.util.Scanner;

public class DatumConverter {

    private String datum;
    private int dag;
    private int maand;
    private int jaar;

    public DatumConverter(String datum){
        this.datum = datum;
        convertDatum();
    }

    private void convertDatum(){
        Scanner scanner = new Scanner(datum.replace("/", " "));
        this.dag = scanner.nextInt();
        this.maand = scanner.nextInt();

        if(scanner.hasNextInt()) {
            this.jaar = scanner.nextInt();
        } else{
            this.jaar = getCurrentJaar();
        }

        scanner.close();
    }

    public int getDag() {
        return dag;
    }

    public int getMaand() {
        return maand;
    }

    public int getJaar() {
        return jaar;
    }

    public String getDatum(){
        return getDag()+"/"+getMaand()+"/"+getJaar();
    }

    private int getCurrentJaar(){
        return new Date().getYear() + 1900;
    }


}
