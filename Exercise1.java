class Exercise1{
    public static void main() {
        verse("cow", "moo");
        System.out.println("");
        verse("dog", "woof");
    }
    
    public static void verse(String animal, String sound) {
        System.out.println("Old MacDonald had a farm, EE-I-EE-I-O,");
        System.out.println("And on that farm he had a " + animal + ", EE-I-EE-I-O,");
        System.out.println("With a " + sound + " " + sound + " here and a " + sound + " " + sound + " there");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + " " +sound);
        System.out.println("Old MacDonald had a farm, EE-I-EE-I-O.");
    }
}