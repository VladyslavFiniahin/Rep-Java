package myPackage;

public class MainMethod {
    public static void main(String[] args) {
        One str1 = new One(14,21,27.2);
        Two str2 = new Two(34,44,52.7);
        Three str3 = new Three(24,70,23.1);

        str1.result();
        str2.result();
        str3.result();
    }
}
