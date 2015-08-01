
package Question3Package;


public class PopulateArrays {
    
    
    public String [] populateArrSales(){
    String[] arrSales = {"01#C#A122;500000", "01#C#A120;1200000", "01#C#A123;850000", "01#R#A121;75000", "02#C#A123;6200000", "02#A#A121;190000",
        "02#C#A121;500000", "02#C#A120;1200000", "02#C#A120;850000", "02#R#A124;75000", "02#C#A123;620000", "02#A#A124;690000",
        "02#C#A121;500000", "02#C#A120;1200000", "02#C#A120;850000", "02#R#A124;75000", "02#C#A123;620000", "02#A#A124;790000",
        "02#R#A124;1500000", "02#C#A125;200000", "02#F#A121;400000", "03#R#A120;175000", "03#C#A123;6200000", "03#A#A123;190000",
        "03#C#A124;500000", "03#C#A125;1200000", "03#C#A123;850000", "03#R#A122;75000", "03#C#A123;620000", "03#A#A123;890000",
        "03#R#A123;1500000", "03#C#A125;200000", "03#A#A123;400000", "04#R#A124;175000", "04#C#A120;6200000", "04#A#A123;190000",
        "03#R#A124;1500000", "03#C#A125;200000", "03#A#A122;400000", "04#R#A121;175000", "04#C#A123;6200000", "04#A#A123;190000",
        "04#C#A121;500000", "04#C#A120;1200000", "04#C#A120;850000", "04#R#A124;75000", "04#C#A123;620000", "04#A#A123;590000",
        "04#C#A123;500000", "04#C#A125;120000", "04#C#A124;850000", "04#R#A122;75000", "04#C#A123;6200000", "04#A#A120;490000",
        "04#C#A125;500000", "04#C#A125;120000", "04#C#A124;850000", "04#R#A122;75000", "04#C#A123;6200000", "04#A#A120;390000",
        "04#R#A120;1500000", "04#C#A121;200000", "04#A#A122;400000", "04#R#A124;175000", "04#C#A121;6200000", "04#A#A123;190000",
        "11#C#A122;500000", "07#C#A120;1200000", "10#C#A123;850000", "12#R#A121;75000", "12#C#A123;6200000", "11#A#A121;190000",
        "12#C#A121;500000", "12#C#A120;1200000", "11#C#A120;850000", "12#R#A124;75000", "12#C#A123;620000", "11#A#A124;690000",
        "09#C#A121;500000", "08#C#A120;1200000", "11#C#A120;850000", "12#R#A124;75000", "12#C#A123;620000", "10#A#A124;790000",
        "08#R#A124;1500000", "08#C#A125;200000", "11#A#A121;400000", "11#R#A120;175000", "07#C#A123;6200000", "09#A#A123;190000",
        "07#C#A124;500000", "07#C#A125;1200000", "12#C#A123;850000", "10#R#A122;75000", "08#C#A123;620000", "08#A#A123;890000",
        "06#R#A123;1500000", "09#C#A125;200000", "09#A#A123;400000", "09#R#A124;175000", "08#C#A120;6200000", "07#A#A123;190000",
        "08#R#A124;1500000", "06#C#A125;200000", "07#A#A122;400000", "08#R#A121;175000", "08#C#A123;6200000", "07#A#A123;190000",
        "11#C#A121;500000", "06#C#A120;1200000", "08#C#A120;850000", "08#R#A124;75000", "12#C#A123;620000", "07#A#A123;590000",
        "12#C#A123;500000", "07#C#A125;120000", "08#C#A124;850000", "07#R#A122;75000", "11#C#A123;6200000", "09#A#A120;490000",
        "08#C#A125;500000", "07#C#A125;120000", "09#C#A124;850000", "06#R#A122;75000", "10#C#A123;6200000", "09#A#A120;390000",
        "10#R#A120;1500000", "07#C#A121;200000", "09#A#A122;400000", "06#R#A124;175000", "10#C#A121;6200000", "09#A#A123;190000"};
    return arrSales;
    }
   
    public String [] populateArrAgents(){
    String[] arrAgents = {"A120:Wes Seelig",
        "A121:Tandra Peters",
        "A122:Lisha Champ",
        "A123:Melda Bissonette",
        "A124:Leta Hansell",
        "A125:Sid Rebello"};
    return arrAgents;
    }
    
    public String [] populateArrTypes(){  
    String[] arrTypes = {"Commercial", "Residential", "Agricultural"};
    return arrTypes;
    }
    
    public String [] populateArrMonths(){
    String[] arrMonths = {"Jan", "Feb", "Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    return arrMonths;
    }
    

}
