package Applications.Bus_resv;

public class Bus {
    private int no;
    private boolean ac;
    private int capacity;  // getter and setter
    Bus(int no,boolean ac,int cap){
        this.no = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusNo()
    {
        return no;
    }
    public void setBusNo(int No)
    {
        no = No;
    }


    public int getCapacity()
    {
        return capacity;
    }
    public void setCapacity(int cap)
    {
        capacity = cap;
    }
    public boolean isAc()
    {
        return ac;
    }
    public void setAc(boolean ac)
    {
        ac = ac;
    }

    public void display_info()
    {
        System.out.println("Bus no : " + no + " ,Ac : " + ac + " ,Capacity : " + capacity);
    }


}
