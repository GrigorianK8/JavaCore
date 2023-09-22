package homeworks.dinamicarray;

public class DynamicArray {

    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    int getByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return 0;
        }
        return array[index];
    }

    public void deleteByIndex(int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
            array = newArray;
        }
    }

    public void add(int index, int value) {
        int[] newArray = new int[array.length + 1];
        newArray[index] = value;
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        array = newArray;
    }

    public boolean exists(int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}