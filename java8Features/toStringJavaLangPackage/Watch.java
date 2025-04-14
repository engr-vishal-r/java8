package toStringJavaLangPackage;

public class Watch{
    private int modelNumber;
    private String modelName;
    public Watch(int modelNo, String name) {
        this.modelNumber = modelNo;
        this.modelName = name;
    }
    //converts objects to string
    public String tostring() {
        return "Model Number: " + modelNumber + " \n Model Name: " + modelName;
    }
    //return modelnumber value of corresponding objects
    public int hashCode(){
        return modelNumber;
    }
    public boolean equals (Object obj) {
        Watch other = (Watch) obj;
        if (modelNumber == other.modelNumber) {
            if (modelName.equals(other.modelName)) {
                return true;
            }
        }
        return false;
    }
}
