public class Main {
    public static void main(String [] args){

        double gravity = -9.81;            //Earth's gravity in m/s^2
        double initial_velocity = 0.0;
        double falling_time = 10.0;
        double initial_iosition = 0.0;
        double final_position = 0.0;

        final_position=(0.5*gravity*falling_time+ initial_velocity)*falling_time + initial_ osition;

        System.out.println("The object's position after " + falling_time +
                " seconds is " + final_position + " m.");
    }
}
