public class player {

    static iii[] iii = new iii[5];
    public static void main(String[] args) {

        newWorkers("Sardor","driver");


        getList();
    }
    public static void newWorkers(String name, String profession){
        boolean isFreePlace = true;

        int index = 0;
        for (int i = 0; i <iii.length ; i++) {
            if (iii[i] == null){
                index = i;
                isFreePlace = true;
                break;
            }else {
                isFreePlace = false;
            }
        }
        if (isFreePlace){



            System.out.println("работник "+name+" был успешна нанят");
        }else{
            System.out.println("нету свободных для рфботника"+name);
        }
    }
    static void removeWorker(String name, String job){
        int index = 0;
        boolean isFound = false;
        for (int i = 0; i <iii.length ; i++) {
            if (name.equals(iii[i])){
                index = i;
                isFound = true;
                break;
            }

        }
        if (isFound){

            System.out.println("работик "+name+" уволен");
        }else {
            System.out.println("не удфлос найти работника "+name+" в списке работников");
        }
    }

    static void getList(){
        System.out.println("Список работников");
        for (int i = 0; i <iii.length ; i++) {

            System.out.println((i+1)+" . "+iii[i]);
        }
    }



}
