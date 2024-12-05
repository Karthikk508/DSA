package OOPS.Pillars.Encapsulation.Encapsulation_examples.Example_2;




public class Encapsulate {

    private String geekName;
    private String geekRoll;
    private int geekAge;

    public int getAge() { return geekAge; }
    public String getName() { return geekName; }
    public String getRoll() { return geekRoll; }

    public void setAge(int newAge) { geekAge = newAge; }
    public void setName(String newName) {geekName = newName;}
    public void setRoll(String newRoll) { geekRoll = newRoll; }
}
