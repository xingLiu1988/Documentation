//格式化
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class CurrentDateTimeExample2 {  
    public static void main(String[] args) {  
        // 第一种：格式化DATE对象成STRING类型日期格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date(); //创建日期对象
		System.out.println("date: " + date);
		
		String formatedDate = sdf.format(date); //格式化日期对象
		System.out.println("formatedDate: " + formatedDate);
        
        // 第二种：装


    }  
} 

//默认创建日期时间
created_at Timestamp DEFAULT current_timestamp