import java.util.ArrayList;
import java.util.List;

public class ListEmploy {
    
    private List<Float> salary = new ArrayList<>();

    public List<Float> getSalary(){
        return salary;
        
    }
    
    public String tuString(int value){
        return String.format("%.2f",salary.get(value));
    }


}
