public class Cinema24 {
    public static void main(String[] args) {
        String[][] audience = new String[4][2];
        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";

        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

        //display the audience’s name for each line
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Audience in the row " + (i + 1) + ": " + String.join(", ", audience[i]));
        }

        //display the audience’s name on the 3rd line using a foreach loop
        /*System.out.println("Audiences in the row 3: ");
        for (String i : audience[2]) {
            System.out.println(i);
        }*/

        //display the audience’s name on the 3rd line using a for loop
        /*System.out.println("Audiences in the row 3: ");
        for (int i = 0; i < audience[2].length; i++) {
            System.out.println(audience[2][i]);
        }*/

        //display the length of each row in the array using foreach loop
        /*for (String[] rowAudience : audience) {
            System.out.println("Length of row: " + rowAudience.length);
        }*/
        
        //display the length of each row in the array using for loop
        /*System.out.println(audience.length);
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + audience[i].length);
        }*/
        
        //audience.length gives the number of rows & audience[i].length gives the number of columns
        /*System.out.println(audience.length);
        System.out.println(audience[0].length);
        System.out.println(audience[1].length);
        System.out.println(audience[2].length);
        System.out.println(audience[3].length);*/
    }
}
