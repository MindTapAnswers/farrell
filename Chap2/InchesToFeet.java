class InchesToFeet {
    public static void main(String[] args) {
        int inches = 86;
        final int feet = inches/12;
        final int leftover = inches % 12;
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
        System.out.println(leftover + " inches");
    }
}
