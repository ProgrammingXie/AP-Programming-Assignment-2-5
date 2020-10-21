class Question6 {
    public static void main(String[] args){
        System.out.println("");
        displayBox(6,3);
    
    } 
    
    public static void displayBox(int width, int height){
        for (int i = 0; i < height; i++){
            for (int k = 0; k < width; k++){
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}