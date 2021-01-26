
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        if(this.elements.isEmpty()){
        return "The collection "+this.name +" is empty.";
        }
        String allLetters = "";
        for(String letter : elements){
        allLetters += "\n" + letter;
        }
        String wordElements = "element";
        if(elements.size() >1){
        wordElements = "elements";
        }
        
        int sizeOfElements = this.elements.size();
       return "The collection "+this.name +" has " + sizeOfElements +" "+ wordElements+":" + allLetters ;
        
       
    }
}
