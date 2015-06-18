import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AllenLopezRun {

    public static void main(String[] args){
        Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
        //string for store json
        String jsonEmpty;
        String jsonSmall;
        String jsonMiddle;
        String jsonLarge;
        
        //serialize
        DimaSerial dsEemptySrc = new DimaSerial();
        jsonEmpty = gson.toJson(dsEemptySrc);
        System.out.println("dsEemptySrc, count of departments: " + dsEemptySrc.departmentCount() 
                + ", count of employees: "  + dsEemptySrc.employeeCount() 
                + ", json size: " + jsonEmpty.length());
        System.out.println("jsonEempty: " + jsonEmpty);
        
        DimaSerial dsSmallSrc = new DimaSerial();
        dsSmallSrc.initSmall();
        jsonSmall = gson.toJson(dsSmallSrc);
        System.out.println("dsSmallSrc, count of departments: " + dsSmallSrc.departmentCount() 
                + ", count of employees: "  + dsSmallSrc.employeeCount()
                + ", json size: " + jsonSmall.length());
        System.out.println("jsonSmall: " + jsonSmall);
        
        DimaSerial dsMiddleSrc = new DimaSerial();
        dsMiddleSrc.initMiddle();
        jsonMiddle = gson.toJson(dsMiddleSrc);
        System.out.println("dsMiddleSrc, count of departments: " + dsMiddleSrc.departmentCount() 
                + ", count of employees: "  + dsMiddleSrc.employeeCount()
                + ", json size: " + jsonMiddle.length());
        System.out.println("jsonMiddle: " + jsonMiddle);
        
        DimaSerial dsLargeSrc = new DimaSerial();
        dsLargeSrc.initLarge();
        jsonLarge = gson.toJson(dsLargeSrc);
        System.out.println("dsLargeSrc, count of departments: " + dsLargeSrc.departmentCount() 
                + ", count of employees: "  + dsLargeSrc.employeeCount()
                + ", json size: " + jsonLarge.length());
        System.out.println("jsonLarge: " + jsonLarge);
        
                            
        //deserialize
        DimaSerial dsEmptyDst;
        dsEmptyDst = gson.fromJson(jsonEmpty, DimaSerial.class);
        System.out.println("dsEmptyDst, count of departments: " + dsEmptyDst.departmentCount() 
                + ", count of employees: "  + dsEmptyDst.employeeCount());

        DimaSerial dsSmallDst;
        dsSmallDst = gson.fromJson(jsonSmall, DimaSerial.class);
        System.out.println("dsSmallDst, count of departments: " + dsSmallDst.departmentCount() 
                + ", count of employees: "  + dsSmallDst.employeeCount());

        DimaSerial dsMiddleDst;
        dsMiddleDst = gson.fromJson(jsonMiddle, DimaSerial.class);
        System.out.println("dsMiddleDst, count of departments: " + dsMiddleDst.departmentCount() 
                + ", count of employees: "  + dsMiddleDst.employeeCount());

        DimaSerial dsLargeDst;
        dsLargeDst = gson.fromJson(jsonLarge, DimaSerial.class);
        System.out.println("dsLargeDst, count of departments: " + dsLargeDst.departmentCount() 
                + ", count of employees: "  + dsLargeDst.employeeCount());
        
        System.out.println("dsLargeDst, transientStr: " + dsLargeDst.transientStr);
    }     
}