package Q2.sec1;

public class DataStat {
    public static int header;
    String dataDesc;
    DataFormat format; 

    // public static String getDesc(){
    //     return dataDesc;
    // }

    public DataFormat getDataFormat(){
        return format;
    }

    // public void setEncoding(String encode){
    //     format.encode =  encode;
    // }
}

class DataFormat{
    final String encode = "UTF8";
}