package problem2;

public class IntegerList
{
    int[] list; //values in the list
    private int countElement = 0;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size) {list = new int[size];}
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //---------------------------------------------------------
    // increaseSize
    //----------------------------------------------------------
    public void increaseSize(){
        int[] newList = new int[list.length * 2];
        for(int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        this.list = newList;
    }
    //------------------------------------------------------------
    //addElement
    //------------------------------------------------------------
    public void addElement(int newVal){
        if(countElement == list.length){
            increaseSize();
        }
        list[countElement] = newVal;
        countElement++;
    }
    //------------------------------------------------------------
    //removeFirst
    //------------------------------------------------------------
    public void removeFirst(int newVal){
        for(int i = 0; i < countElement; i++){
            if(list[i] == newVal){
                for(int j = i; j < countElement - 1; j++){
                    list[j] = list[j + 1];
                }
                countElement--;
                break;
            }
        }
    }
    //--------------------------------------------------------------
    //removeAll
    //--------------------------------------------------------------
    public void removeAll(int newVal){
        for(int i = 0; i < countElement; i++){
            if(list[i] == newVal){
                for(int j = i; j < countElement - 1; j++){
                    list[j] = list[j + 1];
                }
                countElement--;
            }
        }
    }
}