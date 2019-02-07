package ALKHANOV;


/**
 * Created by Админ on 07.02.2019.
 */
public class ArrayList {
    final int MAX_SIZE = 8;
    int array [];
    int count;

    public ArrayList() {
        this.array = new int[MAX_SIZE];
        this.count = 0;
    }

    void add(int element){
        this.array[count] = element;
        this.count ++;
    }

    void addToBegin(int element ){
        int begin;
        for (int i = 0; i <MAX_SIZE; i++){
            begin = this.array[i];
            this.array[i] = element;
            element = begin;
        }
    }

    int get(int index){
        return this.array[index];
    }


    void insert(int element, int index){
        for (int i = MAX_SIZE - 1; i > index; i--){
            this.array[i] = this.array[i-1];
        }
        this.array[index] = element;
    }

    void reverse(){
        for(int i = 0; i < MAX_SIZE/2; i++){
            int temp = this.array[i];
            this.array[i] = this.array[MAX_SIZE - i - 1];
            this.array[MAX_SIZE - i - 1] = temp;
        }
    }


    int getCount(){
        return this.count;
    }

    void  sort(){
        int min;
        int index;
        for (int i = 0; i < MAX_SIZE - 1; i++) {
            min = this.array[i];
            index = i;
        for (int j = i+1; j < MAX_SIZE; j++){
            if(this.array[j] < min){
                min = this.array[j];
                index = j;
            }
        }
            if(i != index){
                int temp = this.array[i];
                this.array[i] = this.array[index];
                this.array[index] = temp;

            }

        }
    }


    boolean contains(int element){
        for (int i = 0; i < MAX_SIZE; i++){
            if (this.array[i] == element)
                return true;
            }
            return false;
        }

    int indexOf(int element){
        int index;
        for (int i = 0; i < MAX_SIZE; i++){
            if (this.array[i] == element)
                return this.array[i];
        }
        return -1;
    }

    void print() {
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }





}


