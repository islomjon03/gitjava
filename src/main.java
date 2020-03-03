public class main {
    public static void main(String[] args) {

        worker Abdullo = new worker("Abdullo", 2300,22);
        worker Sarvar = new worker("Savar", 2400, 20);
        worker Ibrohim = new worker("Ibrohim", 2500,25);

        worker[] workersArr = {Abdullo,Sarvar,Ibrohim};
        for (int i = 0; i <workersArr.length ; i++) {
            workersArr[i].salary();

        }

    }
}
