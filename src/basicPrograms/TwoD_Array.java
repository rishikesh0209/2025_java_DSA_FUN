public class TwoD_Array {
        public static void main(String[] args){
            //2D Array 
            String[][] cars = new String[3][4];

            for(int i=0;i<cars.length;i++){
                System.out.println();
                for(int j = 0; j<cars[i].length;j++){
                    cars[i][j] = "car_"+ (i+1) +"_"+(j+1);
                    System.out.print(cars[i][j] + " ");
                }
            }

            String[][] cars2 = {{"car1","Car2","car3","car4"},{"car11","Car12","car13","car14"}};
            for(int i=0;i<cars2.length;i++){
                System.out.println();
                for(int j = 0; j<cars2[i].length;j++){
                    System.out.print(cars2[i][j] + " ");
                }
            }

        }
}
