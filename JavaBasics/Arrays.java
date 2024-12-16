public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        //change array element
        cars[1] = "Opel";
        System.out.println(cars[1]);

        //array lenght
        System.out.println(cars.length);

        //loop through an array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
          }


          //multidimensional array
          int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
          System.out.println(myNumbers[1][2]);  

          //change element values
          myNumbers[1][2] = 9;
          System.out.println(myNumbers[1][2]);

          for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
          }
      }
}
