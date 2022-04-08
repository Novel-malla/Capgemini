import java.util.LinkedList;

public class q4 {
    int date,month,year;
    
    public q4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<q4> dob = new LinkedList<>();
        

        dob.add(new q4(17,10,2020));
        dob.add(new q4(20,2,1990));
        dob.add(new q4(17,9,2021));
        dob.add(new q4(10,8,2008));
        dob.add(new q4(22,7,2000));
        dob.add(new q4(11,5,2016));
        dob.add(new q4(1,1,2012));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%4==0){
                System.out.println(dob.get(i)+" : Born in Leap Year.");
            }else{
                System.out.println(dob.get(i)+" : Not Born in a Leap Year.");
            }
            
        }
    }
    
}