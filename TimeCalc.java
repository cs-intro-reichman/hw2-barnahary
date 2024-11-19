public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
       int min = Integer.parseInt(args[1]);
       int totalMin = (hours * 60) + minutes + min;
       int totalHours = totalMin / 60;
       int finelHours = totalHours % 24;
       int finelMinutes = totalMin - (totalHours * 60);
        System.out.println(String.format("%02d:%02d", finelHours, finelMinutes));
    }
}
