package Assesments;
class JournyCalculator {
    public double calculateDistance(double speed, double time){
        double distance=speed*time;
        return distance;
    }
}

class Assesment5 {
    public static void main(String[] args){
        JournyCalculator js=new JournyCalculator();
        double rs=js.calculateDistance(60.0, 1.5);
        System.out.println(String.format("%,.2f", rs));

    }
    
}
