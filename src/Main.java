import java.util.ArrayList;


class IntClass {

    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}



public class Main {

    public static void main(String[] args) {

        int[] array = new int[1];
        String[] strings = new String[2];

        ArrayList<String> strArray = new ArrayList<String>();
        strArray.add("home");

//        ArrayList<int> intArray = new ArrayList<int>()
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(3));
        Integer integer = new Integer(5);
        Double doubleValue = new Double(12.35);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i< 10; i++){
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;   //Integer.valueOf(56);
        Double myDoubleValue = 22.33;    //Double.valueOf(22.33);

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double dbl=0.0; dbl<10.0; dbl +=0.5){
            myDoubleValues.add(dbl);
        }

        for (int i =0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i+ " --> " + value);
        }

    }
}
