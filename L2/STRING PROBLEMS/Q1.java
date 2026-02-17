public class q1 {
     int last(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return s.length() - lastSpace - 1;
    }
}
