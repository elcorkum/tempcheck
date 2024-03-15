package arrays;

public class LessonArrays {
    public static void main(String[] args) {
//        char[] alphabet = {'x', 'y', 'z'};
//
//        for (Character i : alphabet) {
//            System.out.println(i);
//        }
        String[][] productNickNames = {
                {"CheeseBurger", "OrangeSoda", "French Fries"},  //row 0
                {"burger",         "soda",           "fries"}    //row 1
        };
        for (int i = 0; i < productNickNames.length; i++) {
            System.out.println(productNickNames[i][2]);
        }



    }
}
