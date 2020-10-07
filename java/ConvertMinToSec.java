import javax.swing.JOptionPane;

class ConvertMinToSec {
    static double convertMinutesToSeconds(double seconds) { return seconds*60; }
    public static void main(String[] args) {
        double minutes = Double.parseDouble(JOptionPane.showInputDialog(null, "Insert Minutes: "));
        double sec = convertMinutesToSeconds(minutes);
        JOptionPane.showMessageDialog(null, ("There are " + sec + " Seconds in " + minutes + " Minutes."));
    }
}
