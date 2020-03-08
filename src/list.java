
public class list {

        int[] arrayCopy (int[] original){
            int counter = 0;

            for (int a : original) {
                if (a == 0) {
                    break;
                } else {
                    counter++;
                }
            }
            int[] clone = new int[counter];
            for (int i = 0; i < original.length; i++) {
                if (original[i] == 0) {
                    break;
                } else {
                    clone[i] = original[i];
                }
            }
            return clone;
        }
        }



